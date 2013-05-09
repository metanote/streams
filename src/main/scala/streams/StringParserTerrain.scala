package streams

import common._

//les streams le premier element du stream suivis par le reste en fonction de Stream(1,?)
/**
 * This component implements a parser to define terrains from a
 * graphical ASCII representation.
 *
 * When mixing in that component, a level can be defined by
 * defining the field `level` in the following form:
 *
 *   val level =
 *     """------
 *       |--ST--
 *       |--oo--
 *       |--oo--
 *       |------""".stripMargin
 *
 * - The `-` character denotes parts which are outside the terrain
 * - `o` denotes fields which are part of the terrain
 * - `S` denotes the start position of the block (which is also considered
 * inside the terrain)
 * - `T` denotes the final position of the block (which is also considered
 * inside the terrain)
 *
 * In this example, the first and last lines could be omitted, and
 * also the columns that consist of `-` characters only.
 */
trait StringParserTerrain extends GameDef {

  /**
   * A ASCII representation of the terrain. This field should remain
   * abstract here.
   */
  val level: String

  /**
   * This method returns terrain function that represents the terrain
   * in `levelVector`. The vector contains parsed version of the `level`
   * string. For example, the following level
   *
   *   val level =
   *     """ST
   *       |oo
   *       |oo""".stripMargin
   *
   * is represented as
   *
   *   Vector(Vector('S', 'T'), Vector('o', 'o'), Vector('o', 'o'))
   *
   * The resulting function should return `true` if the position `pos` is
   * a valid position (not a '-' character) inside the terrain described
   * by `levelVector`.
   */    
  //Terrain => Pos => Boolean !
  def terrainFunction(levelVector: Vector[Vector[Char]]): Terrain = { p => if (p.x<0 ||p.y<0) false
  else if (p.x>levelVector.length-1) false 
  else if (p.y>levelVector(0).length-1) false
  else{
   // println(levelVector+" vector ===> "+p+" " + levelVector(p.x)(p.y) + "x " + p.x + "  y " + p.y )
    levelVector(p.x)(p.y) != '-'
  }
  }

  /**
   * This function should return the position of character `c` in the
   * terrain described by `levelVector`. You can assume that the `c`
   * appears exactly once in the terrain.
   *
   * Hint: you can use the functions `indexWhere` and / or `indexOf` of the
   * `Vector` class
   */
  def findChar(c: Char, levelVector: Vector[Vector[Char]]): Pos = {
    val i = levelVector.indexWhere(p => p.indexWhere(_ == c) > (-1))
    println("POSITION "+Pos(i, levelVector(i).indexWhere(_ == c))+" Character : "+c)
    Pos(i, levelVector(i).indexWhere(_ == c))
  }

  private lazy val vector: Vector[Vector[Char]] =
    Vector(level.split("\n").map(str => Vector(str: _*)): _*)
  println("Level  => "+level)
  lazy val terrain: Terrain = terrainFunction(vector)
  lazy val startPos: Pos = findChar('S', vector)
  lazy val goal: Pos = findChar('T', vector)
 //println("==> terrain " +terrain+" startPos "+startPos+" goal "+goal)
}

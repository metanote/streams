object works_test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
println("hemmo")                                  //> hemmo
lazy val cc=1                                     //> cc: => Int
cc                                                //> res0: Int = 1
val kk =1                                         //> kk  : Int = 1
List((1,3),(4,5)).map(x=> x match{case (a,b) => List(a)++ List(b)}).toSeq
                                                  //> res1: scala.collection.immutable.Seq[List[Int]] = List(List(1, 3), List(4, 5
                                                  //| ))

Stream(1,3)#:::Stream(3,4)                        //> res2: scala.collection.immutable.Stream[Int] = Stream(1, ?)
 
val l =List('a','b','c','d')                      //> l  : List[Char] = List(a, b, c, d)
l.indexWhere(c=>c=='b')                           //> res3: Int = 1
  println(" Scala worksheet hello")               //>  Scala worksheet hello
  val level: String =
   """ST
          |oo
          |oo""".stripMargin                      //> level  : String = ST
                                                  //| oo
                                                  //| oo
 
val vect=Vector(Vector('a','b'),Vector('c','d'))  //> vect  : scala.collection.immutable.Vector[scala.collection.immutable.Vector[
                                                  //| Char]] = Vector(Vector(a, b), Vector(c, d))
Vector(level.split("/n").map(str=>Vector(str:_*)):_*)
                                                  //> res4: scala.collection.immutable.Vector[scala.collection.immutable.Vector[Ch
                                                  //| ar]] = Vector(Vector(S, T, 
                                                  //| , o, o, 
                                                  //| , o, o))
 
 
 
 case class Pos(x: Int, y: Int) {
     def dx(d: Int) = copy(x = x + d)

     def dy(d: Int) = copy(y = y + d)
  }

 def terrainFunction(levelVector: Vector[Vector[Char]]): Pos => Boolean = p => levelVector(p.x)(p.y) !='-'
                                                  //> terrainFunction: (levelVector: Vector[Vector[Char]])works_test.Pos => Boolea
                                                  //| n

 
 val p=terrainFunction(Vector(Vector('S', 'T', '-', 'o', 'o', 'o')))
                                                  //> p  : works_test.Pos => Boolean = <function1>
  
val m =List(List("a","c"),List("b","f"),List("c","g"))
                                                  //> m  : List[List[String]] = List(List(a, c), List(b, f), List(c, g))
m.map(x=> x match{case List(a,b)=>a::List("f")} ).toList
                                                  //> res5: List[List[String]] = List(List(a, f), List(b, f), List(c, f))

//val p=spt.findChar('c',Vector(Vector('a','b'),Vector('a','c')))

val x=for{
i<-1 until 4
c <- List(i).map(a=>a+3)
}yield c                                          //> x  : scala.collection.immutable.IndexedSeq[Int] = Vector(4, 5, 6)


}
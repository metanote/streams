package streams
import Bloxorz._
import common._


object test_works{;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(83); 
lazy val cc=1;System.out.println("""cc: => Int""");$skip(3); val res$0 = 
cc;System.out.println("""res0: Int = """ + $show(res$0));$skip(10); 
val kk =1;System.out.println("""kk  : Int = """ + $show(kk ));$skip(74); val res$1 = 
List((1,3),(4,5)).map(x=> x match{case (a,b) => List(a)++ List(b)}).toSeq;System.out.println("""res1: scala.collection.immutable.Seq[List[Int]] = """ + $show(res$1));$skip(28); val res$2 = 

Stream(1,3)#:::Stream(3,4);System.out.println("""res2: scala.collection.immutable.Stream[Int] = """ + $show(res$2));$skip(31); 
 
val l =List('a','b','c','d');System.out.println("""l  : List[Char] = """ + $show(l ));$skip(24); val res$3 = 
l.indexWhere(c=>c=='b');System.out.println("""res3: Int = """ + $show(res$3));$skip(36); 
  println(" Scala worksheet hello");$skip(74); 
  val level: String =
   """ST
          |oo
          |oo""".stripMargin;System.out.println("""level  : String = """ + $show(level ));$skip(51); 
 
val vect=Vector(Vector('a','b'),Vector('c','d'));System.out.println("""vect  : scala.collection.immutable.Vector[scala.collection.immutable.Vector[Char]] = """ + $show(vect ));$skip(54); val res$4 = 
Vector(level.split("/n").map(str=>Vector(str:_*)):_*)
 
 
 
 case class Pos(x: Int, y: Int) {
     def dx(d: Int) = copy(x = x + d)

     def dy(d: Int) = copy(y = y + d)
  };System.out.println("""res4: scala.collection.immutable.Vector[scala.collection.immutable.Vector[Char]] = """ + $show(res$4));$skip(229); 

 def terrainFunction(levelVector: Vector[Vector[Char]]): Pos => Boolean = p => levelVector(p.x)(p.y) !='-';System.out.println("""terrainFunction: (levelVector: Vector[Vector[Char]])streams.test_works.Pos => Boolean""");$skip(72); 

 
 val p=terrainFunction(Vector(Vector('S', 'T', '-', 'o', 'o', 'o')));System.out.println("""p  : streams.test_works.Pos => Boolean = """ + $show(p ));$skip(58); 
  
val m =List(List("a","c"),List("b","f"),List("c","g"));System.out.println("""m  : List[List[String]] = """ + $show(m ));$skip(57); val res$5 = 
m.map(x=> x match{case List(a,b)=>a::List("f")} ).toList;System.out.println("""res5: List[List[String]] = """ + $show(res$5));$skip(126); 

//val p=spt.findChar('c',Vector(Vector('a','b'),Vector('a','c')))

val x=for{
i<-1 until 4
c <- List(i).map(a=>a+3)
}yield c;System.out.println("""x  : scala.collection.immutable.IndexedSeq[Int] = """ + $show(x ))}


}

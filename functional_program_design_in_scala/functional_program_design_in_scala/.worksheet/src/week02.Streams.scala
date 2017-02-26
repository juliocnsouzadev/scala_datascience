package week02

object Streams {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(112); 
  
  val stream1 = Stream.cons(1, Stream.cons(2, Stream.cons(3, Stream.empty)));System.out.println("""stream1  : Stream.Cons[Int] = """ + $show(stream1 ));$skip(30); 
  val stream2 = Stream(1,2,3);System.out.println("""stream2  : scala.collection.immutable.Stream[Int] = """ + $show(stream2 ));$skip(34); 
  val stream3 = (1 to 3).toStream;System.out.println("""stream3  : scala.collection.immutable.Stream[Int] = """ + $show(stream3 ));$skip(47); 
  val stream4 = 1 #:: 2 #:: 3 #:: Stream.empty;System.out.println("""stream4  : scala.collection.immutable.Stream[Int] = """ + $show(stream4 ));$skip(31); val res$0 = 
  
  (stream1 equals stream2 );System.out.println("""res0: Boolean = """ + $show(res$0));$skip(27); val res$1 = 
  (stream1 equals stream3);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(27); val res$2 = 
  (stream1 equals stream4);System.out.println("""res2: Boolean = """ + $show(res$2))}
}

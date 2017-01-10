package week4.lists

object Testing {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(89); 
  val fruits1 = List("oranges", "apples", "melons");System.out.println("""fruits1  : List[String] = """ + $show(fruits1 ));$skip(56); 
  val fruits2 = "apples" :: "oranges" :: "melons" ::Nil;System.out.println("""fruits2  : List[String] = """ + $show(fruits2 ));$skip(85); 
  fruits1
  .filter { f => f contains "a" }
  .sorted
  .foreach { f => println(f) };$skip(16); 
  
  val  x = 0;System.out.println("""x  : Int = """ + $show(x ));$skip(13); 
  val  y = 0;System.out.println("""y  : Int = """ + $show(y ));$skip(14); 
  val  xs = 0;System.out.println("""xs  : Int = """ + $show(xs ));$skip(14); 
  val  ys = 0;System.out.println("""ys  : Int = """ + $show(ys ));$skip(16); 
  val  zs = Nil;System.out.println("""zs  : scala.collection.immutable.Nil.type = """ + $show(zs ));$skip(46); 
  val someList = x :: y :: List(xs, ys) :: zs;System.out.println("""someList  : List[Any] = """ + $show(someList ))}
}

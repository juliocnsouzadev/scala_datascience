package week4.primitives

import week3.intsets.NonEmpty
import week3.intsets.Empty
import week3.intsets.IntSet

object Testing {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(140); val res$0 = 
  List(1,2);System.out.println("""res0: week3.lists.List[Int] = """ + $show(res$0));$skip(66); 
  
  val a: Array[NonEmpty] = Array(new NonEmpty(1,Empty, Empty));System.out.println("""a  : Array[week3.intsets.NonEmpty] = """ + $show(a ));$skip(58); 
	//val b: Array[IntSet] = a
	
	val x : List[String] = Nil;System.out.println("""x  : List[String] = """ + $show(x ))}
	
                                              
}

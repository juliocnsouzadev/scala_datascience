package week3

import week3.intsets._

object IntSetsTesting {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(107); 
  val set1 = new NonEmpty(3,  Empty,  Empty);System.out.println("""set1  : week3.NonEmpty = """ + $show(set1 ));$skip(24); 
  val set2 = set1 add 5;System.out.println("""set2  : week3.IntSet = """ + $show(set2 ))}
}

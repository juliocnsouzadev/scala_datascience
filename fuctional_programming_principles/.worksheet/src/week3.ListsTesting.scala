package week3

import week3.lists._

object ListsTesting {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(118); 
  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)));System.out.println("""list  : week3.lists.Cons[Int] = """ + $show(list ));$skip(14); val res$0 = 
  list.nth(2);System.out.println("""res0: Int = """ + $show(res$0));$skip(31); val res$1 = 
  //list.nth(4)
  list.nth(-1);System.out.println("""res1: Int = """ + $show(res$1))}
}

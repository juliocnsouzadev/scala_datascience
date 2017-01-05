package week3

import week3.lists._

object ListsTesting {
  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))
                                                  //> list  : week3.lists.Cons[Int] = week3.lists.Cons@28ba21f3
  list.nth(2)                                     //> res0: Int = 3
  //list.nth(4)
  list.nth(-1)                                    //> java.lang.IndexOutOfBoundsException
                                                  //| 	at week3.lists.List$class.nthInner(List.scala:10)
                                                  //| 	at week3.lists.List$class.nth(List.scala:8)
                                                  //| 	at week3.lists.Cons.nth(Cons.scala:3)
                                                  //| 	at week3.ListsTesting$$anonfun$main$1.apply$mcV$sp(week3.ListsTesting.sc
                                                  //| ala:9)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at week3.ListsTesting$.main(week3.ListsTesting.scala:5)
                                                  //| 	at week3.ListsTesting.main(week3.ListsTesting.scala)
}
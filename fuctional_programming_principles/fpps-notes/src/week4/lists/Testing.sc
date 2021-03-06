package week4.lists

object Testing {
  val fruits1 = List("oranges", "apples", "melons")
                                                  //> fruits1  : List[String] = List(oranges, apples, melons)
  val fruits2 = "apples" :: "oranges" :: "melons" ::Nil
                                                  //> fruits2  : List[String] = List(apples, oranges, melons)
  fruits1
  .filter { f => f contains "a" }
  .sorted
  .foreach { f => println(f) }                    //> apples
                                                  //| oranges
  
  val  x = 0                                      //> x  : Int = 0
  val  y = 0                                      //> y  : Int = 0
  val  xs = 0                                     //> xs  : Int = 0
  val  ys = 0                                     //> ys  : Int = 0
  val  zs = Nil                                   //> zs  : scala.collection.immutable.Nil.type = List()
  val someList = x :: y :: List(xs, ys) :: zs     //> someList  : List[Any] = List(0, 0, List(0, 0))
}
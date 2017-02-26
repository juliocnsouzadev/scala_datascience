package week02

object Streams {
  
  val stream1 = Stream.cons(1, Stream.cons(2, Stream.cons(3, Stream.empty)))
                                                  //> stream1  : Stream.Cons[Int] = Stream(1, ?)
  val stream2 = Stream(1,2,3)                     //> stream2  : scala.collection.immutable.Stream[Int] = Stream(1, ?)
  val stream3 = (1 to 3).toStream                 //> stream3  : scala.collection.immutable.Stream[Int] = Stream(1, ?)
  val stream4 = 1 #:: 2 #:: 3 #:: Stream.empty    //> stream4  : scala.collection.immutable.Stream[Int] = Stream(1, ?)
  
  (stream1 equals stream2 )                       //> res0: Boolean = true
  (stream1 equals stream3)                        //> res1: Boolean = true
  (stream1 equals stream4)                        //> res2: Boolean = true
}
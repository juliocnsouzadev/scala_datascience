package week5

object ListMethods {

  val numbers = List(12, -10, 1, 9, 8, 5, 0, -7, 87, -99)
                                                  //> numbers  : List[Int] = List(12, -10, 1, 9, 8, 5, 0, -7, 87, -99)

  numbers filter (n => n > 0)                     //> res0: List[Int] = List(12, 1, 9, 8, 5, 87)
  numbers filterNot (n => n > 0)                  //> res1: List[Int] = List(-10, 0, -7, -99)
  numbers partition (n => n > 0)                  //> res2: (List[Int], List[Int]) = (List(12, 1, 9, 8, 5, 87),List(-10, 0, -7, -9
                                                  //| 9))
  numbers takeWhile (n => n > 0)                  //> res3: List[Int] = List(12)
  numbers dropWhile (n => n > 0)                  //> res4: List[Int] = List(-10, 1, 9, 8, 5, 0, -7, 87, -99)
  numbers span (n => n > 0)                       //> res5: (List[Int], List[Int]) = (List(12),List(-10, 1, 9, 8, 5, 0, -7, 87, -9
                                                  //| 9))

  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xs1 =>
      val (first, rest) = xs span (y => y == x)
      first :: pack(rest)
  }                                               //> pack: [T](xs: List[T])List[List[T]]

  val data = List("a", "a", "a", "b", "c", "c", "a")
                                                  //> data  : List[String] = List(a, a, a, b, c, c, a)

  pack(data)                                      //> res6: List[List[String]] = List(List(a, a, a), List(b), List(c, c), List(a))
                                                  //| 

  def encode[T](xs: List[T]): List[(T, Int)] =
    pack(xs) map (ys => (ys.head, ys.length))     //> encode: [T](xs: List[T])List[(T, Int)]

  encode(data)                                    //> res7: List[(String, Int)] = List((a,3), (b,1), (c,2), (a,1))

  val names = List("Julio", "Rafael", "Wellington", "Carlos", "Marcelo")
                                                  //> names  : List[String] = List(Julio, Rafael, Wellington, Carlos, Marcelo)
  
  val numbers2 = List(5,10,15,20,25,30,35,40)     //> numbers2  : List[Int] = List(5, 10, 15, 20, 25, 30, 35, 40)
  
  numbers2 reduceLeft (_+_)                       //> res8: Int = 180
  numbers2 reduceLeft (_-_)                       //> res9: Int = -170
  
  numbers2 reduceRight (_+_)                      //> res10: Int = 180
  numbers2 reduceRight (_-_)                      //> res11: Int = -20
  
  val fullNumbers = (numbers :: numbers2)         //> fullNumbers  : List[Any] = List(List(12, -10, 1, 9, 8, 5, 0, -7, 87, -99), 5
                                                  //| , 10, 15, 20, 25, 30, 35, 40)

	(numbers :: numbers2 reverse) reverse     //> res12: List[Any] = List(List(12, -10, 1, 9, 8, 5, 0, -7, 87, -99), 5, 10, 15
                                                  //| , 20, 25, 30, 35, 40)

}
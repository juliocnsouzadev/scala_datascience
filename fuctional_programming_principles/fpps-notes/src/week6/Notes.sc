package week6

object Notes {
  val numbers = Vector(12, -10, 1, 9, 8, 5, 0, -7, 87, -99)
                                                  //> numbers  : scala.collection.immutable.Vector[Int] = Vector(12, -10, 1, 9, 8, 
                                                  //| 5, 0, -7, 87, -99)

  numbers filter (n => n > 0)                     //> res0: scala.collection.immutable.Vector[Int] = Vector(12, 1, 9, 8, 5, 87)
  numbers filterNot (n => n > 0)                  //> res1: scala.collection.immutable.Vector[Int] = Vector(-10, 0, -7, -99)
  numbers partition (n => n > 0)                  //> res2: (scala.collection.immutable.Vector[Int], scala.collection.immutable.Ve
                                                  //| ctor[Int]) = (Vector(12, 1, 9, 8, 5, 87),Vector(-10, 0, -7, -99))
  numbers takeWhile (n => n > 0)                  //> res3: scala.collection.immutable.Vector[Int] = Vector(12)
  numbers dropWhile (n => n > 0)                  //> res4: scala.collection.immutable.Vector[Int] = Vector(-10, 1, 9, 8, 5, 0, -7
                                                  //| , 87, -99)
  numbers span (n => n > 0)                       //> res5: (scala.collection.immutable.Vector[Int], scala.collection.immutable.Ve
                                                  //| ctor[Int]) = (Vector(12),Vector(-10, 1, 9, 8, 5, 0, -7, 87, -99))

  val names = Vector("Julio", "Rafael", "Wellington", "Carlos", "Marcelo")
                                                  //> names  : scala.collection.immutable.Vector[String] = Vector(Julio, Rafael, W
                                                  //| ellington, Carlos, Marcelo)

  val julio = "Julio"                             //> julio  : String = Julio

  names contains julio                            //> res6: Boolean = true

  julio filter (c => c.isUpper)                   //> res7: String = J

  julio exists (c => c equals 'i')                //> res8: Boolean = true
  julio exists (c => c == 'i')                    //> res9: Boolean = true

  julio forall (c => c.isLetter)                  //> res10: Boolean = true

  names                                           //> res11: scala.collection.immutable.Vector[String] = Vector(Julio, Rafael, Wel
                                                  //| lington, Carlos, Marcelo)

  names sorted                                    //> res12: scala.collection.immutable.Vector[String] = Vector(Carlos, Julio, Mar
                                                  //| celo, Rafael, Wellington)

  names sorted Ordering.String                    //> res13: scala.collection.immutable.Vector[String] = Vector(Carlos, Julio, Mar
                                                  //| celo, Rafael, Wellington)

  val allNumbers = (Vector(0, 2, 4, 6, 8, 10) ++ Vector(1, 3, 5, 7, 9, 11)) sorted Ordering.Int
                                                  //> allNumbers  : scala.collection.immutable.Vector[Int] = Vector(0, 1, 2, 3, 4,
                                                  //|  5, 6, 7, 8, 9, 10, 11)

  val pairs = (allNumbers reverse) zip julio      //> pairs  : scala.collection.immutable.Vector[(Int, Char)] = Vector((11,J), (10
                                                  //| ,u), (9,l), (8,i), (7,o))

  pairs.unzip                                     //> res14: (scala.collection.immutable.Vector[Int], scala.collection.immutable.V
                                                  //| ector[Char]) = (Vector(11, 10, 9, 8, 7),Vector(J, u, l, i, o))

  allNumbers sum                                  //> res15: Int = 66

  allNumbers product                              //> res16: Int = 0

  allNumbers max                                  //> res17: Int = 11

  allNumbers min                                  //> res18: Int = 0

  allNumbers filter (n => n % 2 == 0) sum         //> res19: Int = 30

  allNumbers filter (n => n % 2 != 0) sum         //> res20: Int = 36

  def isPrime(n: Int): Boolean =
    (2 until n) forall  (n % _ != 0)              //> isPrime: (n: Int)Boolean

  //CONBINATORIAL SEARCH AND FOR-EXPRESSIONS

  val n = 7                                       //> n  : Int = 7
  (1 until n) flatMap (i =>
    (1 until i) map (j => (i, j))) filter(pair => isPrime(pair._1 + pair._2))
                                                  //> res21: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3
                                                  //| ,2), (4,1), (4,3), (5,2), (6,1), (6,5))
                                                  
 def scalarProduct(xs: List[Double], ys: List[Double]):Double =
  (for ((x,y) <- xs zip ys ) yield x * y).sum     //> scalarProduct: (xs: List[Double], ys: List[Double])Double
  
  scalarProduct(List(10,20), List(5,15))          //> res22: Double = 350.0
 
                                                   
}
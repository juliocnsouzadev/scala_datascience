package week5

object Testing {

  def init[T](xs: List[T]): List[T] = xs match {
    case List()  => throw new Error("init of empty list")
    case List(x) => List()
    case y :: ys => y :: init(ys)
  }                                               //> init: [T](xs: List[T])List[T]

  def removeAt[T](n: Int, xs: List[T]) = (xs take n) ::: (xs drop n + 1)
                                                  //> removeAt: [T](n: Int, xs: List[T])List[T]

  removeAt(1, List('a', 'b', 'c', 'd'))           //> res0: List[Char] = List(a, c, d)

  //def merge[T](xs: List[T], ys: List[T])(lt: (T, T) => Boolean): List[T] =
  def merge[T](xs: List[T], ys: List[T])(implicit ord: Ordering[T]): List[T] =
    (xs, ys) match {
      case (Nil, ys) => ys
      case (xs, Nil) => xs
      case (x :: xs1, y :: ys1) =>
        if (ord.lt(x, y)) x :: merge(xs1, ys)(ord)
        else y :: merge(xs, ys1)(ord)

    }                                             //> merge: [T](xs: List[T], ys: List[T])(implicit ord: Ordering[T])List[T]

  //def msort[T](xs: List[T])(lt: (T, T) => Boolean): List[T] = {
  def msort[T](xs: List[T])(implicit ord: Ordering[T]): List[T] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      val (fst, snd) = xs splitAt n
      merge(msort(fst), msort(snd))
    }
  }                                               //> msort: [T](xs: List[T])(implicit ord: Ordering[T])List[T]

  val numbers = List(0, 10 - 5 - 8, 11, 4, 3, -1, 1, -2)
                                                  //> numbers  : List[Int] = List(0, -3, 11, 4, 3, -1, 1, -2)
  //msort(numbers)((x: Int, y: Int) => x < y)
  msort(numbers)(Ordering.Int)                    //> res1: List[Int] = List(-3, -2, -1, 0, 1, 3, 4, 11)
  msort(numbers)                                  //> res2: List[Int] = List(-3, -2, -1, 0, 1, 3, 4, 11)

  val eletronics = List("laptop", "smartphone", "desktop")
                                                  //> eletronics  : List[String] = List(laptop, smartphone, desktop)
  //msort(eletronics)((x:String, y:String) => x.compareTo(y) < 0)
  msort(eletronics)(Ordering.String)              //> res3: List[String] = List(desktop, laptop, smartphone)
  msort(eletronics)                               //> res4: List[String] = List(desktop, laptop, smartphone)

  def squareList(xs: List[Int]): List[Int] =
    xs match {
      case Nil     => Nil
      case y :: ys => y * y :: squareList(ys)
    }                                             //> squareList: (xs: List[Int])List[Int]

  def squareListMap(xs: List[Int]): List[Int] =
    xs map (x => x*x)                             //> squareListMap: (xs: List[Int])List[Int]
    
    squareList(numbers)                           //> res5: List[Int] = List(0, 9, 121, 16, 9, 1, 1, 4)
    
    squareListMap(numbers)                        //> res6: List[Int] = List(0, 9, 121, 16, 9, 1, 1, 4)
    
    
   numbers reduceLeft (_ + _)                     //> res7: Int = 13
   
   numbers reduceLeft (_ * _)                     //> res8: Int = 0
   
   val n2 = numbers sorted                        //> n2  : List[Int] = List(-3, -2, -1, 0, 1, 3, 4, 11)
   val z = 1 :: n2                                //> z  : List[Int] = List(1, -3, -2, -1, 0, 1, 3, 4, 11)
   
}
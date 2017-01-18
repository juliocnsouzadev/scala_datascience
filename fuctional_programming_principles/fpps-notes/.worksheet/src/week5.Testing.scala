package week5

object Testing {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(206); 

  def init[T](xs: List[T]): List[T] = xs match {
    case List()  => throw new Error("init of empty list")
    case List(x) => List()
    case y :: ys => y :: init(ys)
  };System.out.println("""init: [T](xs: List[T])List[T]""");$skip(75); 

  def removeAt[T](n: Int, xs: List[T]) = (xs take n) ::: (xs drop n + 1);System.out.println("""removeAt: [T](n: Int, xs: List[T])List[T]""");$skip(42); val res$0 = 

  removeAt(1, List('a', 'b', 'c', 'd'));System.out.println("""res0: List[Char] = """ + $show(res$0));$skip(365); 

  //def merge[T](xs: List[T], ys: List[T])(lt: (T, T) => Boolean): List[T] =
  def merge[T](xs: List[T], ys: List[T])(implicit ord: Ordering[T]): List[T] =
    (xs, ys) match {
      case (Nil, ys) => ys
      case (xs, Nil) => xs
      case (x :: xs1, y :: ys1) =>
        if (ord.lt(x, y)) x :: merge(xs1, ys)(ord)
        else y :: merge(xs, ys1)(ord)

    };System.out.println("""merge: [T](xs: List[T], ys: List[T])(implicit ord: Ordering[T])List[T]""");$skip(274); 

  //def msort[T](xs: List[T])(lt: (T, T) => Boolean): List[T] = {
  def msort[T](xs: List[T])(implicit ord: Ordering[T]): List[T] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      val (fst, snd) = xs splitAt n
      merge(msort(fst), msort(snd))
    }
  };System.out.println("""msort: [T](xs: List[T])(implicit ord: Ordering[T])List[T]""");$skip(59); 

  val numbers = List(0, 10 - 5 - 8, 11, 4, 3, -1, 1, -2);System.out.println("""numbers  : List[Int] = """ + $show(numbers ));$skip(77); val res$1 = 
  //msort(numbers)((x: Int, y: Int) => x < y)
  msort(numbers)(Ordering.Int);System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(17); val res$2 = 
  msort(numbers);System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(61); 

  val eletronics = List("laptop", "smartphone", "desktop");System.out.println("""eletronics  : List[String] = """ + $show(eletronics ));$skip(103); val res$3 = 
  //msort(eletronics)((x:String, y:String) => x.compareTo(y) < 0)
  msort(eletronics)(Ordering.String);System.out.println("""res3: List[String] = """ + $show(res$3));$skip(20); val res$4 = 
  msort(eletronics);System.out.println("""res4: List[String] = """ + $show(res$4));$skip(140); 

  def squareList(xs: List[Int]): List[Int] =
    xs match {
      case Nil     => Nil
      case y :: ys => y * y :: squareList(ys)
    };System.out.println("""squareList: (xs: List[Int])List[Int]""");$skip(72); 

  def squareListMap(xs: List[Int]): List[Int] =
    xs map (x => x*x);System.out.println("""squareListMap: (xs: List[Int])List[Int]""");$skip(29); val res$5 = 
    
    squareList(numbers);System.out.println("""res5: List[Int] = """ + $show(res$5));$skip(32); val res$6 = 
    
    squareListMap(numbers);System.out.println("""res6: List[Int] = """ + $show(res$6));$skip(40); val res$7 = 
    
    
   numbers reduceLeft (_ + _);System.out.println("""res7: Int = """ + $show(res$7));$skip(34); val res$8 = 
   
   numbers reduceLeft (_ * _);System.out.println("""res8: Int = """ + $show(res$8));$skip(31); 
   
   val n2 = numbers sorted;System.out.println("""n2  : List[Int] = """ + $show(n2 ));$skip(19); 
   val z = 1 :: n2;System.out.println("""z  : List[Int] = """ + $show(z ))}
   
}

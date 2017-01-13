package week5

object ListMethods {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(96); 

  val numbers = List(12, -10, 1, 9, 8, 5, 0, -7, 87, -99);System.out.println("""numbers  : List[Int] = """ + $show(numbers ));$skip(32); val res$0 = 

  numbers filter (n => n > 0);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(33); val res$1 = 
  numbers filterNot (n => n > 0);System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(33); val res$2 = 
  numbers partition (n => n > 0);System.out.println("""res2: (List[Int], List[Int]) = """ + $show(res$2));$skip(33); val res$3 = 
  numbers takeWhile (n => n > 0);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(33); val res$4 = 
  numbers dropWhile (n => n > 0);System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(28); val res$5 = 
  numbers span (n => n > 0);System.out.println("""res5: (List[Int], List[Int]) = """ + $show(res$5));$skip(176); 

  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xs1 =>
      val (first, rest) = xs span (y => y == x)
      first :: pack(rest)
  };System.out.println("""pack: [T](xs: List[T])List[List[T]]""");$skip(55); 

  val data = List("a", "a", "a", "b", "c", "c", "a");System.out.println("""data  : List[String] = """ + $show(data ));$skip(15); val res$6 = 

  pack(data);System.out.println("""res6: List[List[String]] = """ + $show(res$6));$skip(95); 

  def encode[T](xs: List[T]): List[(T, Int)] =
    pack(xs) map (ys => (ys.head, ys.length));System.out.println("""encode: [T](xs: List[T])List[(T, Int)]""");$skip(17); val res$7 = 

  encode(data);System.out.println("""res7: List[(String, Int)] = """ + $show(res$7));$skip(75); 

  val names = List("Julio", "Rafael", "Wellington", "Carlos", "Marcelo");System.out.println("""names  : List[String] = """ + $show(names ))}

}
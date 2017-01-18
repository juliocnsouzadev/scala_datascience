package week6

object Notes {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(90); 
  val numbers = Vector(12, -10, 1, 9, 8, 5, 0, -7, 87, -99);System.out.println("""numbers  : scala.collection.immutable.Vector[Int] = """ + $show(numbers ));$skip(32); val res$0 = 

  numbers filter (n => n > 0);System.out.println("""res0: scala.collection.immutable.Vector[Int] = """ + $show(res$0));$skip(33); val res$1 = 
  numbers filterNot (n => n > 0);System.out.println("""res1: scala.collection.immutable.Vector[Int] = """ + $show(res$1));$skip(33); val res$2 = 
  numbers partition (n => n > 0);System.out.println("""res2: (scala.collection.immutable.Vector[Int], scala.collection.immutable.Vector[Int]) = """ + $show(res$2));$skip(33); val res$3 = 
  numbers takeWhile (n => n > 0);System.out.println("""res3: scala.collection.immutable.Vector[Int] = """ + $show(res$3));$skip(33); val res$4 = 
  numbers dropWhile (n => n > 0);System.out.println("""res4: scala.collection.immutable.Vector[Int] = """ + $show(res$4));$skip(28); val res$5 = 
  numbers span (n => n > 0);System.out.println("""res5: (scala.collection.immutable.Vector[Int], scala.collection.immutable.Vector[Int]) = """ + $show(res$5));$skip(77); 

  val names = Vector("Julio", "Rafael", "Wellington", "Carlos", "Marcelo");System.out.println("""names  : scala.collection.immutable.Vector[String] = """ + $show(names ));$skip(24); 

  val julio = "Julio";System.out.println("""julio  : String = """ + $show(julio ));$skip(25); val res$6 = 

  names contains julio;System.out.println("""res6: Boolean = """ + $show(res$6));$skip(34); val res$7 = 

  julio filter (c => c.isUpper);System.out.println("""res7: String = """ + $show(res$7));$skip(37); val res$8 = 

  julio exists (c => c equals 'i');System.out.println("""res8: Boolean = """ + $show(res$8));$skip(31); val res$9 = 
  julio exists (c => c == 'i');System.out.println("""res9: Boolean = """ + $show(res$9));$skip(35); val res$10 = 

  julio forall (c => c.isLetter);System.out.println("""res10: Boolean = """ + $show(res$10));$skip(10); val res$11 = 

  names;System.out.println("""res11: scala.collection.immutable.Vector[String] = """ + $show(res$11));$skip(17); val res$12 = 

  names sorted;System.out.println("""res12: scala.collection.immutable.Vector[String] = """ + $show(res$12));$skip(33); val res$13 = 

  names sorted Ordering.String;System.out.println("""res13: scala.collection.immutable.Vector[String] = """ + $show(res$13));$skip(98); 

  val allNumbers = (Vector(0, 2, 4, 6, 8, 10) ++ Vector(1, 3, 5, 7, 9, 11)) sorted Ordering.Int;System.out.println("""allNumbers  : scala.collection.immutable.Vector[Int] = """ + $show(allNumbers ));$skip(47); 

  val pairs = (allNumbers reverse) zip julio;System.out.println("""pairs  : scala.collection.immutable.Vector[(Int, Char)] = """ + $show(pairs ));$skip(16); val res$14 = 

  pairs.unzip;System.out.println("""res14: (scala.collection.immutable.Vector[Int], scala.collection.immutable.Vector[Char]) = """ + $show(res$14));$skip(19); val res$15 = 

  allNumbers sum;System.out.println("""res15: Int = """ + $show(res$15));$skip(23); val res$16 = 

  allNumbers product;System.out.println("""res16: Int = """ + $show(res$16));$skip(19); val res$17 = 

  allNumbers max;System.out.println("""res17: Int = """ + $show(res$17));$skip(19); val res$18 = 

  allNumbers min;System.out.println("""res18: Int = """ + $show(res$18));$skip(44); val res$19 = 

  allNumbers filter (n => n % 2 == 0) sum;System.out.println("""res19: Int = """ + $show(res$19));$skip(44); val res$20 = 

  allNumbers filter (n => n % 2 != 0) sum;System.out.println("""res20: Int = """ + $show(res$20));$skip(72); 

  def isPrime(n: Int): Boolean =
    (2 until n) forall  (n % _ != 0);System.out.println("""isPrime: (n: Int)Boolean""");$skip(61); 

  //CONBINATORIAL SEARCH AND FOR-EXPRESSIONS

  val n = 7;System.out.println("""n  : Int = """ + $show(n ));$skip(106); val res$21 = 
  (1 until n) flatMap (i =>
    (1 until i) map (j => (i, j))) filter(pair => isPrime(pair._1 + pair._2));System.out.println("""res21: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$21));$skip(161); 
                                                  
 def scalarProduct(xs: List[Double], ys: List[Double]):Double =
  (for ((x,y) <- xs zip ys ) yield x * y).sum;System.out.println("""scalarProduct: (xs: List[Double], ys: List[Double])Double""");$skip(44); val res$22 = 
  
  scalarProduct(List(10,20), List(5,15));System.out.println("""res22: Double = """ + $show(res$22))}
 
                                                   
}

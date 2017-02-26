package week02

object InfiniteSequences {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(97); 

  def from(n: Int): Stream[Int] = n #:: from(n + 1);System.out.println("""from: (n: Int)Stream[Int]""");$skip(23); 

  val nats = from(0);System.out.println("""nats  : Stream[Int] = """ + $show(nats ));$skip(33); 

  val mult4 = nats map (_ * 4);System.out.println("""mult4  : scala.collection.immutable.Stream[Int] = """ + $show(mult4 ));$skip(28); val res$0 = 

  (mult4 take 100).toList;System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(99); 

  def sieve(s: Stream[Int]): Stream[Int] =
    s.head #:: sieve(s.tail filter (_ % s.head != 0));System.out.println("""sieve: (s: Stream[Int])Stream[Int]""");$skip(31); 

  val natsForPrime = from(2);System.out.println("""natsForPrime  : Stream[Int] = """ + $show(natsForPrime ));$skip(44); val res$1 = 
  
  (sieve(natsForPrime) take 100) toList;System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(232); 
                                                  
	def sqrtStream(x:Double):Stream[Double] = {
  	def improve(guess:Double) = (guess + x / guess) / 2
  	lazy val guesses: Stream[Double] = 1 #:: (guesses map improve)
  	guesses
  };System.out.println("""sqrtStream: (x: Double)Stream[Double]""");$skip(104); 
  
  def isGoodenough(guess: Double, x: Double):Boolean =
  	Math.abs((guess * guess - x) / x) < 0.0001;System.out.println("""isGoodenough: (guess: Double, x: Double)Boolean""");$skip(63); val res$2 = 
  
  sqrtStream(4) filter( isGoodenough(_, 4))  take 10 toList;System.out.println("""res2: List[Double] = """ + $show(res$2))}
}

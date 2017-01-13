package week2

object Exercise {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(255); 
  //Write a product function that calculates the product of the values of a function for the points on a given interval.
  def product (f: Int => Int)(x: Int, y:Int): Int =
		if (x > y) 1
		else f(x) * product(f)(x + 1, y);System.out.println("""product: (f: Int => Int)(x: Int, y: Int)Int""");$skip(30); val res$0 = 
		
	product(v => v + v)(1, 5);System.out.println("""res0: Int = """ + $show(res$0));$skip(91); 
	
	//Write a factorial in terms of product
	def factorial (v: Int) = product(x => x)(1, v);System.out.println("""factorial: (v: Int)Int""");$skip(16); val res$1 = 
	
	factorial(5);System.out.println("""res1: Int = """ + $show(res$1));$skip(198); 
	
	//Product an Sum -> MapReduce
	
	def mapReduce (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(x:Int, y:Int):Int =
	if (x > y) zero
	else combine(f(x), mapReduce(f, combine, zero)(x+1,y));System.out.println("""mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(x: Int, y: Int)Int""");$skip(143); 
                                                  
  def productMR (f: Int => Int)(x: Int, y:Int): Int = mapReduce(f, (z,v) => z * v, 1)(x, y);System.out.println("""productMR: (f: Int => Int)(x: Int, y: Int)Int""");$skip(30); val res$2 = 
  productMR(v => v + v)(1, 5);System.out.println("""res2: Int = """ + $show(res$2))}
}

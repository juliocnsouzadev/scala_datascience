package week2

object Exercise {
  //Write a product function that calculates the product of the values of a function for the points on a given interval.
  def product (f: Int => Int)(x: Int, y:Int): Int =
		if (x > y) 1
		else f(x) * product(f)(x + 1, y)  //> product: (f: Int => Int)(x: Int, y: Int)Int
		
	product(v => v + v)(1, 5)                 //> res0: Int = 3840
	
	//Write a factorial in terms of product
	def factorial (v: Int) = product(x => x)(1, v)
                                                  //> factorial: (v: Int)Int
	
	factorial(5)                              //> res1: Int = 120
	
	//Product an Sum -> MapReduce
	
	def mapReduce (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(x:Int, y:Int):Int =
	if (x > y) zero
	else combine(f(x), mapReduce(f, combine, zero)(x+1,y))
                                                  //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(x: Int, y:
                                                  //|  Int)Int
                                                  
  def productMR (f: Int => Int)(x: Int, y:Int): Int = mapReduce(f, (z,v) => z * v, 1)(x, y)
                                                  //> productMR: (f: Int => Int)(x: Int, y: Int)Int
  productMR(v => v + v)(1, 5)                     //> res2: Int = 3840
}
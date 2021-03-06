package week2

object Currying {
  
  def sum (f: Int => Int): (Int, Int) => Int = {
  	def sumF(x: Int, y: Int): Int =
  		if (x > y) 0
  		else f(x) + sumF(x + 1, y)
  	sumF
  }                                               //> sum: (f: Int => Int)(Int, Int) => Int
  
  def fact(v: Int): Int = if (v == 0) 1 else fact(v - 1)
                                                  //> fact: (v: Int)Int
  
  def sumOfIntegers = sum(v => v)                 //> sumOfIntegers: => (Int, Int) => Int
	def sumOfCubes  = sum(v => v * v * v)     //> sumOfCubes: => (Int, Int) => Int
	def sumOfFactorials = sum(fact)           //> sumOfFactorials: => (Int, Int) => Int
	
	sumOfCubes(2, 5)                          //> res0: Int = 224
	sumOfFactorials(2,6)                      //> res1: Int = 5
	
	def justSum(x: Int, y:Int):Int = x + y    //> justSum: (x: Int, y: Int)Int
	justSum(sumOfCubes(3,8), sumOfFactorials(10,20))
                                                  //> res2: Int = 1298
	
	def cube(v: Int): Int = v * v * v         //> cube: (v: Int)Int
	
	sum(cube)(5,12)                           //> res3: Int = 5984
  
  
    //SHOTER FORM
  def sumS(f: Int => Int)(x: Int, y: Int): Int =
		if (x > y) 0 else f(x) + sumS(f)(x + 1, y)
                                                  //> sumS: (f: Int => Int)(x: Int, y: Int)Int
		
	sumS(cube)(5,12)                          //> res4: Int = 5984
                                                  
                                            
                                                                                             
}
package week2

object Currying {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(179); 
  
  def sum (f: Int => Int): (Int, Int) => Int = {
  	def sumF(x: Int, y: Int): Int =
  		if (x > y) 0
  		else f(x) + sumF(x + 1, y)
  	sumF
  };System.out.println("""sum: (f: Int => Int)(Int, Int) => Int""");$skip(60); 
  
  def fact(v: Int): Int = if (v == 0) 1 else fact(v - 1);System.out.println("""fact: (v: Int)Int""");$skip(37); 
  
  def sumOfIntegers = sum(v => v);System.out.println("""sumOfIntegers: => (Int, Int) => Int""");$skip(39); 
	def sumOfCubes  = sum(v => v * v * v);System.out.println("""sumOfCubes: => (Int, Int) => Int""");$skip(33); 
	def sumOfFactorials = sum(fact);System.out.println("""sumOfFactorials: => (Int, Int) => Int""");$skip(20); val res$0 = 
	
	sumOfCubes(2, 5);System.out.println("""res0: Int = """ + $show(res$0));$skip(22); val res$1 = 
	sumOfFactorials(2,6);System.out.println("""res1: Int = """ + $show(res$1));$skip(42); 
	
	def justSum(x: Int, y:Int):Int = x + y;System.out.println("""justSum: (x: Int, y: Int)Int""");$skip(50); val res$2 = 
	justSum(sumOfCubes(3,8), sumOfFactorials(10,20));System.out.println("""res2: Int = """ + $show(res$2));$skip(37); 
	
	def cube(v: Int): Int = v * v * v;System.out.println("""cube: (v: Int)Int""");$skip(19); val res$3 = 
	
	sum(cube)(5,12);System.out.println("""res3: Int = """ + $show(res$3));$skip(118); 
  
  
    //SHOTER FORM
  def sumS(f: Int => Int)(x: Int, y: Int): Int =
		if (x > y) 0 else f(x) + sumS(f)(x + 1, y);System.out.println("""sumS: (f: Int => Int)(x: Int, y: Int)Int""");$skip(21); val res$4 = 
		
	sumS(cube)(5,12);System.out.println("""res4: Int = """ + $show(res$4))}
                                                  
                                            
                                                                                             
}

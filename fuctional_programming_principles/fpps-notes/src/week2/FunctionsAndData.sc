package week2

object FunctionsAndData {
  val a = new Rational(5,10)                      //> a  : week2.Rational = 5/10
  val b = -a                                      //> b  : week2.Rational = 0/100
  val c = new Rational(6,8)                       //> c  : week2.Rational = 6/8
  
  println(a)                                      //> 5/10
  println(b)                                      //> 0/100
  
  val z = a > c                                   //> z  : Boolean = true
  val sum = a + c                                 //> sum  : week2.Rational = 100/80
  val sub = a - c + b                             //> sub  : week2.Rational = 32000/64000
}

class Rational(x: Int, y:Int) {
	def numer = x
	def denom = y
	
	def >(that:Rational) = true;
	
	def + (that: Rational) =
		new Rational( numer * that.denom + that.numer * denom,
									denom * that.denom)
				
	def unary_- = this + new Rational(-numer, denom)
	
	def - (that: Rational) = this + - that
									
	override def toString = numer + "/" + denom;
}
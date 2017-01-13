package week2

object FunctionsAndData {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(69); 
  val a = new Rational(5,10);System.out.println("""a  : week2.Rational = """ + $show(a ));$skip(13); 
  val b = -a;System.out.println("""b  : week2.Rational = """ + $show(b ));$skip(28); 
  val c = new Rational(6,8);System.out.println("""c  : week2.Rational = """ + $show(c ));$skip(16); 
  
  println(a);$skip(13); 
  println(b);$skip(19); 
  
  val z = a > c;System.out.println("""z  : Boolean = """ + $show(z ));$skip(18); 
  val sum = a + c;System.out.println("""sum  : week2.Rational = """ + $show(sum ));$skip(22); 
  val sub = a - c + b;System.out.println("""sub  : week2.Rational = """ + $show(sub ))}
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

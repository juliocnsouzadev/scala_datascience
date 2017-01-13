package week01

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(386); 

  def sqrt(x: Double) = {
    def abs(x: Double) = if (x < 0) -x else x

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double) = (guess + x / guess) / 2
    sqrtIter(1.0)
  };System.out.println("""sqrt: (x: Double)Double""")}
}

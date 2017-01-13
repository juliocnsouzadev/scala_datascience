package week2

object HighLevelFunctions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(251); 
 // high level functions take another function as parameter
	def sum(f: Int => Int, a: Int, b: Int) = {
		def loop(a: Int, acc: Int ): Int =
			if (a > b) acc
			else loop(a + 1, f(a) + acc)
		
		loop(a,0)
	};System.out.println("""sum: (f: Int => Int, a: Int, b: Int)Int""");$skip(24); val res$0 = 

	sum(x => x * x, 3, 5);System.out.println("""res0: Int = """ + $show(res$0))}
}

package week04

object Exercise {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(55); 
  
  val num = Var(1);System.out.println("""num  : week04.Var[Int] = """ + $show(num ));$skip(32); 
  val twice = Signal(num() * 2);System.out.println("""twice  : week04.Signal[Int] = """ + $show(twice ));$skip(12); 
  num() = 2;$skip(10); val res$0 = 
  twice();System.out.println("""res0: Int = """ + $show(res$0));$skip(26); 
  
  
  var num2 = Var(1);System.out.println("""num2  : week04.Var[Int] = """ + $show(num2 ));$skip(34); 
  val twice2 = Signal(num2() * 2);System.out.println("""twice2  : week04.Signal[Int] = """ + $show(twice2 ));$skip(16); 
  num2 = Var(2);$skip(11); val res$1 = 
  twice2();System.out.println("""res1: Int = """ + $show(res$1))}
  
}

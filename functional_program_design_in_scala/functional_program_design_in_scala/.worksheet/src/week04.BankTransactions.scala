package week04

object BankTransactions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(150); 

  def consolidated(accounts: List[BankAccount]): Signal[Int] =
    Signal(accounts map (_.balance()) sum);System.out.println("""consolidated: (accounts: List[week04.BankAccount])week04.Signal[Int]""");$skip(33); 

  val acc1 = new BankAccount();System.out.println("""acc1  : week04.BankAccount = """ + $show(acc1 ));$skip(31); 
  val acc2 = new BankAccount();System.out.println("""acc2  : week04.BankAccount = """ + $show(acc2 ));$skip(44); 
  val cons = consolidated(List(acc1, acc2));System.out.println("""cons  : week04.Signal[Int] = """ + $show(cons ));$skip(9); val res$0 = 
  cons();System.out.println("""res0: Int = """ + $show(res$0));$skip(21); 

  acc1 deposit 100;$skip(9); val res$1 = 
  cons();System.out.println("""res1: Int = """ + $show(res$1));$skip(20); 

  acc2 deposit 63;$skip(9); val res$2 = 
  cons();System.out.println("""res2: Int = """ + $show(res$2));$skip(21); 

  acc1 withdrow 44;$skip(9); val res$3 = 
  cons();System.out.println("""res3: Int = """ + $show(res$3));$skip(21); 

  acc2 withdrow 25;$skip(9); val res$4 = 
  cons();System.out.println("""res4: Int = """ + $show(res$4));$skip(34); 
  
  val xChange = Signal(246.00);System.out.println("""xChange  : week04.Signal[Double] = """ + $show(xChange ));$skip(44); 
  val inDollar = Signal(cons() * xChange());System.out.println("""inDollar  : week04.Signal[Double] = """ + $show(inDollar ));$skip(13); val res$5 = 
  inDollar();System.out.println("""res5: Double = """ + $show(res$5))}
}

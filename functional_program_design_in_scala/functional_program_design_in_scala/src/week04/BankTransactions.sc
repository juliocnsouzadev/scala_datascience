package week04

object BankTransactions {

  def consolidated(accounts: List[BankAccount]): Signal[Int] =
    Signal(accounts map (_.balance()) sum)        //> consolidated: (accounts: List[week04.BankAccount])week04.Signal[Int]

  val acc1 = new BankAccount()                    //> acc1  : week04.BankAccount = week04.BankAccount@506e6d5e
  val acc2 = new BankAccount()                    //> acc2  : week04.BankAccount = week04.BankAccount@96532d6
  val cons = consolidated(List(acc1, acc2))       //> cons  : week04.Signal[Int] = week04.Signal@3567135c
  cons()                                          //> res0: Int = 0

  acc1 deposit 100
  cons()                                          //> res1: Int = 100

  acc2 deposit 63
  cons()                                          //> res2: Int = 163

  acc1 withdrow 44
  cons()                                          //> res3: Int = 119

  acc2 withdrow 25
  cons()                                          //> res4: Int = 94
  
  val xChange = Signal(246.00)                    //> xChange  : week04.Signal[Double] = week04.Signal@4909b8da
  val inDollar = Signal(cons() * xChange())       //> inDollar  : week04.Signal[Double] = week04.Signal@3a03464
  inDollar()                                      //> res5: Double = 23124.0
}
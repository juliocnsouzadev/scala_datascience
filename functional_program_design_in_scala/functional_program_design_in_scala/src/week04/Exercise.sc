package week04

object Exercise {
  
  val num = Var(1)                                //> num  : week04.Var[Int] = week04.Var@5b464ce8
  val twice = Signal(num() * 2)                   //> twice  : week04.Signal[Int] = week04.Signal@6442b0a6
  num() = 2
  twice()                                         //> res0: Int = 4
  
  
  var num2 = Var(1)                               //> num2  : week04.Var[Int] = week04.Var@7f690630
  val twice2 = Signal(num2() * 2)                 //> twice2  : week04.Signal[Int] = week04.Signal@edf4efb
  num2 = Var(2)
  twice2()                                        //> res1: Int = 2
  
}
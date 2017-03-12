package week04

import week04.frp.Var

class BankAccount {
  
  val balance = Var(0)
  
  def deposit(amount: Int): Unit =
    if (amount > 0){
      val b = balance()
      balance() = b + amount
    }
  
  def withdrow(amount: Int): Unit =
    if(0 < amount && amount <= balance()){
      val b = balance()
      balance() = b - amount
    }else throw new Error("Insufficient founds")
  
}
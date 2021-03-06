package week4.primitives

class Succ(n: Nat) extends Nat {
  
  def isZero: Boolean = false
  
  def predecessor: Nat = n
  
  def + (that: Nat): Nat = new Succ(n + that)
  
  def - (that: Nat): Nat = 
    if (that.isZero) this
    else n - that.predecessor
}
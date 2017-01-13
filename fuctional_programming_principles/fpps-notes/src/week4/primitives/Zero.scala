package week4.primitives

object Zero extends Nat {
  def isZero: Boolean = true
  
  def predecessor: Nat = throw new Error("no predecessor for 0")
  
  def + (that: Nat): Nat = that
  
  def - (that: Nat): Nat = 
    if(that.isZero) this
    else throw new Error("no negative allowed")
  
}
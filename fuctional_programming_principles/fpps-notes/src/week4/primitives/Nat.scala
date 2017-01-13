package week4.primitives

abstract class Nat {
  def isZero: Boolean
  
  def predecessor: Nat
  
  def successor: Nat = new Succ(this)
  
  def + (that: Nat): Nat
  
  def - (that: Nat): Nat
}
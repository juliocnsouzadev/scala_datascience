package week02

case class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  
  def include(x: Int): IntSet=
    if (x < elem) NonEmpty(elem, left include x, right)
    else if (x > elem) NonEmpty(elem, left, right include x)
    else this
    
  def contains(x: Int): Boolean =
    if(x < elem) left contains x
    else if (x > elem) right  contains x
    else true
    
  def union(other: IntSet): IntSet =
    (left union (right union (other)))  include elem
  
}
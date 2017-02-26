package week02

object Empty extends IntSet {
  
  def include(x: Int): IntSet = NonEmpty(x, Empty, Empty)
  
  def contains(x: Int): Boolean = false
  
  def union(other: IntSet) = other
  
}
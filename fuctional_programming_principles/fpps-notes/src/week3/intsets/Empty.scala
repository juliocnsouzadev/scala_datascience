package week3.intsets

object Empty extends IntSet {

	def add(x: Int): IntSet = new NonEmpty(x,  Empty,  Empty)
	
	def contains(x: Int): Boolean = false
	
	def union (other: IntSet): IntSet = other
		
	
	override def toString = "."
}
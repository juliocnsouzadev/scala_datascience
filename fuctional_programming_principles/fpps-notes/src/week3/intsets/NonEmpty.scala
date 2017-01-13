package week3.intsets

class NonEmpty (elem: Int, left: IntSet, right: IntSet) extends IntSet  {

	def add(x: Int): IntSet =
		if (x < elem) new NonEmpty(elem, left add x, right)
		else if (x > elem) new NonEmpty(elem, left, right add x)
		else this
		
	
	def contains(x: Int): Boolean =
		if (x < elem) left contains x
		else if (x > elem) right contains x
		else true
		
	def union (other: IntSet): IntSet =
		((left union right) union other) add elem
		
	override def toString = "{" + left + elem + right + "}"
}
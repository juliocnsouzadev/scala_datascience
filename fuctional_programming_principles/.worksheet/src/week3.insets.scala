 package week3

object insets {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(76); 
  val set1 = new NonEmpty(3,  Empty,  Empty);System.out.println("""set1  : week3.NonEmpty = """ + $show(set1 ));$skip(24); 
  val set2 = set1 add 5;System.out.println("""set2  : week3.IntSet = """ + $show(set2 ))}
}

abstract class IntSet {

	def add(x: Int): IntSet
	
	def contains(x: Int): Boolean
	
	def union (other: IntSet): IntSet
}

object Empty extends IntSet {

	def add(x: Int): IntSet = new NonEmpty(x,  Empty,  Empty)
	
	def contains(x: Int): Boolean = false
	
	def union (other: IntSet): IntSet = other
		
	
	override def toString = "."
}

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

package week3.intsets

abstract class IntSet {

	def add(x: Int): IntSet
	
	def contains(x: Int): Boolean
	
	def union (other: IntSet): IntSet
}
package week3.lists

import java.util.NoSuchElementException

class Nil[T] extends List[T] {
  
  def isEmpty : Boolean = true
  
  def head : Nothing = throw new NoSuchElementException("Nill.head")
  
  def tail : Nothing = throw new NoSuchElementException("Nill.tail")
  
}
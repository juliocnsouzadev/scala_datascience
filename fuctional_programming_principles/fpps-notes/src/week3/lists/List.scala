package week3.lists

trait List[T] {
  def isEmpty : Boolean
  
  def head : T
  
  def tail : List[T]
  
  def nth(n: Int): T = 
    nthInner(n, this) 
  
   private def nthInner[T](n: Int, xs: List[T]): T = 
    if (xs.isEmpty) throw new IndexOutOfBoundsException
    else if (n == 0) xs.head
    else nthInner(n- 1, xs.tail) 
}
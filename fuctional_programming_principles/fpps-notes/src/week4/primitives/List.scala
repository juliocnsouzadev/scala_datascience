package week4.primitives

import week3.lists.Cons
import week3.lists.Nil

object List {
  def apply[T](x1: T, x2: T): week3.lists.List[T] = new Cons(x1, new Cons(x2, new Nil))
}
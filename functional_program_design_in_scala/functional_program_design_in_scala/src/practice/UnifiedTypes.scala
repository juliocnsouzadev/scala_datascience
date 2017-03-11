package practice

import scala.collection.mutable.LinkedHashSet

object UnifiedTypes extends App {

  def f() = {
    
  }  
  

  val set = new LinkedHashSet[Any];

  set += "a string"
  set += 234
  set += 'a'
  set += false
  set += f _

  val iterator: Iterator[Any] = set.iterator

  while (iterator.hasNext) {
    val extracted = iterator.next()
    
    println(extracted.getClass().getName + " : " + extracted.toString())
  }
}
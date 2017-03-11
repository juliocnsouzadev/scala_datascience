package practice

trait Similarity {
  def isSimiliar(a:Any): Boolean
  def isNotSimilar(a: Any): Boolean = !isSimiliar(a)
}
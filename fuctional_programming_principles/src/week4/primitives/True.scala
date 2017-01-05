package week4.primitives

object True extends MyBoolean{
  def ifThenElse[T] (t: => T, f: => T) = t;
}
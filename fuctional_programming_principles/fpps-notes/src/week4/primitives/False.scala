package week4.primitives

object False extends MyBoolean{
  def ifThenElse[T] (t: => T, f: => T) = f;
}
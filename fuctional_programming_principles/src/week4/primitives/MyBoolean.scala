package week4.primitives

abstract class MyBoolean {
  
  def ifThenElse[T](t: => T, f: => T) : T
  
  def && (x: => MyBoolean): MyBoolean =
     ifThenElse(x, False)
     
  def || (x: => MyBoolean): MyBoolean =
       ifThenElse(False, x)
       
  def unary_! : MyBoolean =
    ifThenElse(False, True)
    
  def == (x: MyBoolean): MyBoolean = 
    ifThenElse(x, x.unary_!)
  
  def != (x: MyBoolean): MyBoolean = 
    ifThenElse(x.unary_!, x)
  
  def < (x: MyBoolean): MyBoolean =
    ifThenElse(False, x)
    
  def > (x: MyBoolean): MyBoolean = 
    ifThenElse(x, False)
}
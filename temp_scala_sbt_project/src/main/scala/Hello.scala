class Hello(val name: String) { //parameter that turns in a field


  var message: String = "Hello message"; //mutable
  val from: String = Hello.default; //imutable
  def echo(): String = name + " says " + message + " from " + from;

  def count(): Int = 10 * 12 / 13 + 30;

  //parameters with and without default values
  def buildName(first: String, last: String, middle: String = ""): String = first + " " + middle + " " + last;

}

object Hello { //singleton instance
  private val default: String = "Hello class"; //imutable
}




object Foo {

  def main(args: Array[String]): Unit = {
    var hello = new Hello("Julio");
    println(hello.echo);
    println(hello.count);
    println(hello.buildName("Julio", "Souza"));
    println(hello.buildName("Julio", "Souza", "Nunes"));

    var t1 = Time(10, 20);
    var t2 = Time();
    var t3 = Time(9);

    println(t1.toString);
    println(t2.toString);
    println(t3.toString);

    var a: Array[Int] = Array(1, 2, 3, 4, 5);
    var l: List[Int] = List(1, 2, 3, 4, 5); //LinkedList
    var v: Vector[Int] = Vector(1, 2, 3, 4, 5);
    var s: Set[Int] = Set(1, 2, 3, 4, 5, 5); //does not alow duplicates;
    var o: Option[String] = Option("Julio");
    val t2 = ("a", 1);
  }

}

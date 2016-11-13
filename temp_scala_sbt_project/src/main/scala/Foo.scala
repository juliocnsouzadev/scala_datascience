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

  }

}

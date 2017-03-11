package practice

object TraitTest {
  val dog = new Animal("A", "B", "C", "D","E","F","Dog", "Brutus")
                                                  //> dog  : practice#27.Animal#17787 = Brutus
  val dog2 = new Animal("A", "B", "C", "D","E","F","Dog","Bud")
                                                  //> dog2  : practice#27.Animal#17787 = Bud
  val cat = new Animal("A", "B", "C", "D","E","F","Cat","Brutus")
                                                  //> cat  : practice#27.Animal#17787 = Brutus
  
  println(dog isSimiliar cat)                     //> false
  println(dog isSimiliar dog2)                    //> true
}
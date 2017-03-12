package practice

object TraitTest {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(103); 
  val dog = new Animal("A", "B", "C", "D","E","F","Dog", "Brutus");System.out.println("""dog  : practice#27.Animal#17787 = """ + $show(dog ));$skip(64); 
  val dog2 = new Animal("A", "B", "C", "D","E","F","Dog","Bud");System.out.println("""dog2  : practice#27.Animal#17787 = """ + $show(dog2 ));$skip(66); 
  val cat = new Animal("A", "B", "C", "D","E","F","Cat","Brutus");System.out.println("""cat  : practice#27.Animal#17787 = """ + $show(cat ));$skip(33); 
  
  println(dog isSimiliar cat);$skip(31); 
  println(dog isSimiliar dog2)}
}

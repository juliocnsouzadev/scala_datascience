package week6

object maps {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(109); 
  val romanNumerals = Map("I" -> 1, "II" -> 2, "III" -> 3 , "IV" -> 4, "V" -> 5);System.out.println("""romanNumerals  : scala.collection.immutable.Map[String,Int] = """ + $show(romanNumerals ));$skip(78); 
  val capitalOfCountry = Map("Brazil" -> "Brasilia", "Switzerland" -> "Bern");System.out.println("""capitalOfCountry  : scala.collection.immutable.Map[String,String] = """ + $show(capitalOfCountry ));$skip(32); val res$0 = 

	capitalOfCountry get "Brazil";System.out.println("""res0: Option[String] = """ + $show(res$0));$skip(103); 
	
	val names = List("Julio", "Rafael", "Wellington", "Carlos", "Marcelo", "Robert", "Julia", "Celine");System.out.println("""names  : List[String] = """ + $show(names ));$skip(40); val res$1 = 
	
	names sortWith (_.length < _.length);System.out.println("""res1: List[String] = """ + $show(res$1));$skip(66); val res$2 = 
                                                  
  names sorted;System.out.println("""res2: List[String] = """ + $show(res$2));$skip(26); val res$3 = 
	
	names groupBy (_.head);System.out.println("""res3: scala.collection.immutable.Map[Char,List[String]] = """ + $show(res$3))}

}

package week6

object maps {
  val romanNumerals = Map("I" -> 1, "II" -> 2, "III" -> 3 , "IV" -> 4, "V" -> 5)
                                                  //> romanNumerals  : scala.collection.immutable.Map[String,Int] = Map(II -> 2, I
                                                  //| V -> 4, I -> 1, V -> 5, III -> 3)
  val capitalOfCountry = Map("Brazil" -> "Brasilia", "Switzerland" -> "Bern")
                                                  //> capitalOfCountry  : scala.collection.immutable.Map[String,String] = Map(Braz
                                                  //| il -> Brasilia, Switzerland -> Bern)

	capitalOfCountry get "Brazil"             //> res0: Option[String] = Some(Brasilia)
	
	val names = List("Julio", "Rafael", "Wellington", "Carlos", "Marcelo", "Robert", "Julia", "Celine")
                                                  //> names  : List[String] = List(Julio, Rafael, Wellington, Carlos, Marcelo, Rob
                                                  //| ert, Julia, Celine)
	
	names sortWith (_.length < _.length)      //> res1: List[String] = List(Julio, Julia, Rafael, Carlos, Robert, Celine, Marc
                                                  //| elo, Wellington)
                                                  
  names sorted                                    //> res2: List[String] = List(Carlos, Celine, Julia, Julio, Marcelo, Rafael, Rob
                                                  //| ert, Wellington)
	
	names groupBy (_.head)                    //> res3: scala.collection.immutable.Map[Char,List[String]] = Map(J -> List(Juli
                                                  //| o, Julia), M -> List(Marcelo), C -> List(Carlos, Celine), W -> List(Wellingt
                                                  //| on), R -> List(Rafael, Robert))

}
package week01.for_translationsjson

object QueriesInFor {

  case class Baby(name: String, parents: List[String])

  val babies = Set(
    Baby(
      name = "Julia",
      parents = List("Julio", "Marilia")),
    Baby(
      name = "Rafaela",
      parents = List("Ademilson", "Flavia")),
    Baby(
      name = "Sofia",
      parents = List("Jose", "Maria")),
    Baby(
      name = "Ester",
      parents = List("Carlos", "Joana")),
    Baby(
      name = "Joao",
      parents = List("Carlos", "Joana")),
    Baby(
      name = "Jose",
      parents = List("Carlos", "Joana")),
    Baby(
      name = "Solange",
      parents = List("Gilberto", "Maria")))

  for (b <- babies; p <- b.parents if p startsWith "J") yield b.name

  for {
    b1 <- babies
    b2 <- babies
    if b1.name < b2.name
    p1 <- b1.parents
    p2 <- b2.parents
    if p1 == p2
  } yield p1
  
  babies flatMap ( x =>
	for  (p <- x.parents withFilter (p => p startsWith "J" )) yield x.name
	)
                                                  
  babies flatMap ( x =>
	for  (p <- x.parents withFilter (p => p startsWith "J" )) yield x.name
	)
	

}
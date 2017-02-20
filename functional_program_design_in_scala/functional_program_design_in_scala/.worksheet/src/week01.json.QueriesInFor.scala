package week01.json

object QueriesInFor {

  case class Baby(name: String, parents: List[String]);import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(647); 

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
      parents = List("Gilberto", "Maria")));System.out.println("""babies  : scala.collection.immutable.Set[week01.json.QueriesInFor.Baby] = """ + $show(babies ));$skip(71); val res$0 = 

  for (b <- babies; p <- b.parents if p startsWith "J") yield b.name;System.out.println("""res0: scala.collection.immutable.Set[String] = """ + $show(res$0));$skip(140); val res$1 = 

  for {
    b1 <- babies
    b2 <- babies
    if b1.name < b2.name
    p1 <- b1.parents
    p2 <- b2.parents
    if p1 == p2
  } yield p1;System.out.println("""res1: scala.collection.immutable.Set[String] = """ + $show(res$1));$skip(102); val res$2 = 
  
  babies flatMap ( x =>
	for  (p <- x.parents withFilter (p => p startsWith "J" )) yield x.name
	);System.out.println("""res2: scala.collection.immutable.Set[String] = """ + $show(res$2))}
                                                  

	

}

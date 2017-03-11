package week02

object PouringTest {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(83); 
  val problem = new Pouring(Vector(4, 9, 19));System.out.println("""problem  : week02.Pouring = """ + $show(problem ));$skip(18); val res$0 = 

  problem.moves;System.out.println("""res0: scala.collection.immutable.IndexedSeq[Product with Serializable with week02.PouringTest.problem.Move] = """ + $show(res$0));$skip(26); val res$1 = 

  problem.solutions(18);System.out.println("""res1: Stream[week02.PouringTest.problem.Path] = """ + $show(res$1))}
}

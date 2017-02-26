package week02

object PouringTest {
  val problem = new Pouring(Vector(4, 9, 19))     //> problem  : week02.Pouring = week02.Pouring@2d554825

  problem.moves                                   //> res0: scala.collection.immutable.IndexedSeq[Product with Serializable with w
                                                  //| eek02.PouringTest.problem.Move] = Vector(Empty(0), Empty(1), Empty(2), Fill(
                                                  //| 0), Fill(1), Fill(2), Pour(0,1), Pour(0,2), Pour(1,0), Pour(1,2), Pour(2,0),
                                                  //|  Pour(2,1))

  problem.solutions(18)                           //> res1: Stream[week02.PouringTest.problem.Path] = Stream(Fill(1) Pour(1,2) Fil
                                                  //| l(1) Pour(1,2)--> Vector(0, 0, 18), ?)
}
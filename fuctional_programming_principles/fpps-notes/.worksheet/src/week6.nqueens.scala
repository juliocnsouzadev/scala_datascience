package week6

//there can't be two queens int the same row, column or diagonal
object nqueens {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(601); 
  //produces a set of solutions
  def queensPossiblePositions(numberOfRows: Int): Set[List[Int]] = {

    def placeQueens(numberOfQueens: Int): Set[List[Int]] = {
      val empty = Set(List[Int]())
      if (numberOfQueens == 0)
        empty
      else
        for {
          queens <- placeQueens(numberOfQueens - 1)
          column <- 0 until numberOfRows //tests all columns
          if isSafe(column, queens) //filter
        } yield column :: queens

    }

    placeQueens(numberOfRows)
  };System.out.println("""queensPossiblePositions: (numberOfRows: Int)Set[List[Int]]""");$skip(295); 

  def isSafe(column: Int, queens: List[Int]): Boolean = {
    val row: Int = queens.length
    val queensWithRows = (row - 1 to 0 by -1) zip queens
    queensWithRows forall {
      case (thisRow, thisColumn) => column != thisColumn && math.abs(column - thisColumn) != row - thisRow
    }
  };System.out.println("""isSafe: (column: Int, queens: List[Int])Boolean""");$skip(222); 

  def show(queens: List[Int]) = {
    var lines =
      for (column <- queens.reverse)
        yield Vector.fill(queens.length)("* ")
        .updated(column, "X ")
        .mkString
    "\n" + (lines mkString "\n")
  };System.out.println("""show: (queens: List[Int])String""");$skip(58); val res$0 = 
  
  (queensPossiblePositions(8) map show) mkString  "\n";System.out.println("""res0: String = """ + $show(res$0))}

}

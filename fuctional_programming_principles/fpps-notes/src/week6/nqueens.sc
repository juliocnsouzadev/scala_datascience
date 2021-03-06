package week6

//there can't be two queens int the same row, column or diagonal
object nqueens {
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
  }                                               //> queensPossiblePositions: (numberOfRows: Int)Set[List[Int]]

  def isSafe(column: Int, queens: List[Int]): Boolean = {
    val row: Int = queens.length
    val queensWithRows = (row - 1 to 0 by -1) zip queens
    queensWithRows forall {
      case (thisRow, thisColumn) => column != thisColumn && math.abs(column - thisColumn) != row - thisRow
    }
  }                                               //> isSafe: (column: Int, queens: List[Int])Boolean

  def show(queens: List[Int]) = {
    var lines =
      for (column <- queens.reverse)
        yield Vector.fill(queens.length)("* ")
        .updated(column, "X ")
        .mkString
    "\n" + (lines mkString "\n")
  }                                               //> show: (queens: List[Int])String
  
  (queensPossiblePositions(8) map show) mkString  "\n"
                                                  //> res0: String = "
                                                  //| * * * X * * * * 
                                                  //| X * * * * * * * 
                                                  //| * * * * X * * * 
                                                  //| * * * * * * * X 
                                                  //| * * * * * X * * 
                                                  //| * * X * * * * * 
                                                  //| * * * * * * X * 
                                                  //| * X * * * * * * 
                                                  //| 
                                                  //| * * * * X * * * 
                                                  //| * * X * * * * * 
                                                  //| X * * * * * * * 
                                                  //| * * * * * X * * 
                                                  //| * * * * * * * X 
                                                  //| * X * * * * * * 
                                                  //| * * * X * * * * 
                                                  //| * * * * * * X * 
                                                  //| 
                                                  //| * * * * * X * * 
                                                  //| * X * * * * * * 
                                                  //| * * * * * * X * 
                                                  //| X * * * * * * * 
                                                  //| * * * X * * * * 
                                                  //| * * * * * * * X 
                                                  //| * * * * X * * * 
                                                  //| * * X * * * * * 
                                                  //| 
                                                  //| * * * * * * X * 
                                                  //| * * * * X * * * 
                                                  //| * * X * * * * * 
                                                  //| X * * * * * * * 
                                                  //| * * * * * X * * 
                                                  //| * * * * * * * X 
                                                  //| * X * * * * * * 
                                                  //| * * * X * * * * 
                                                  //| 
                                                  //| * * X * * * * * 
                                                  //| * * * * X * * * 
                                                  //| * X * * * * * * 
                                                  //| * * * * * * * X 
                                                  //| * * * * * X * * 
                                                  //| * * * X * * * * 
                                                  //| * * * * * * X * 
                                                  //| X * * * * * * * 
                                                  //| 
                                                  //| * * * X * * * * 
                                                  //| * * * * * * * X 
                                                  //| X * * * * * * * 

}
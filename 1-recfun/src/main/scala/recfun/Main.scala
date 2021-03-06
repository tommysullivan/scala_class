package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(column: Int, row: Int):Int = {
		require(column >= 0)
		require(column <= row)
		require(row >= 0)
		def lenientPascal(column:Int, row:Int):Int = {
			val isTopCorner = (column == 0 && row == 0)
			def sumOfParents() = {
				def isColumnOutsideTriangle = (column < 0 || column > row)
				if(isColumnOutsideTriangle) 0
				else lenientPascal(column - 1, row - 1) + lenientPascal(column, row - 1)
			}
			if(isTopCorner) 1
			else sumOfParents()
		}
		lenientPascal(column,row)
	} 

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def doesBalance(chars:List[Char], numOpeningParens:Int):Boolean = {
	  def balanceClosingParen():Boolean = {
		  if(noUnusedOpeningParams) false
		  else doesBalance(chars.tail, numOpeningParens-1)
      }
      def balanceNonOpeningParen():Boolean = {
    	  if(chars.head == ')') balanceClosingParen
	      else doesBalance(chars.tail, numOpeningParens)
	  }
      def balanceOpeningParen():Boolean = doesBalance(chars.tail, numOpeningParens+1)
      def noUnusedOpeningParams():Boolean = numOpeningParens==0
      if(chars.isEmpty) noUnusedOpeningParams
      else {
        if(chars.head == '(') balanceOpeningParen
	    else balanceNonOpeningParen
      }
    }
    doesBalance(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def headMatchCount():Int = if(money==coins.head) 1 else 0
    if(coins.isEmpty || money < 1) 0
    else headMatchCount + countChange(money-coins.head, coins) + countChange(money, coins.tail)
  }
}

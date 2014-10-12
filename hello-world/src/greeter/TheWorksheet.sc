package greeter

object TheWorksheet {
  
	def pascal(column: Int, row: Int):Int = {
		require(column > 0)
		require(column <= row)
		require(row > 0)
		def lenientPascal(column:Int, row:Int):Int = {
			var isTopCorner = (column == 1 && row == 1)
			def sumOfParents() = {
				def isColumnOutsideTriangle = (column < 1 || column > row)
				if(isColumnOutsideTriangle) 0
				else lenientPascal(column - 1, row - 1) + lenientPascal(column, row - 1)
			}
			if(isTopCorner) 1
			else sumOfParents()
		}
		lenientPascal(column,row)
	}                                         //> pascal: (column: Int, row: Int)Int
	
	pascal(1,1)                               //> res0: Int = 1
	pascal(1,2)                               //> res1: Int = 1
	pascal(2,2)                               //> res2: Int = 1
	pascal(1,3)                               //> res3: Int = 1
	pascal(2,3)                               //> res4: Int = 2
	pascal(3,3)                               //> res5: Int = 1
	pascal(1,4)                               //> res6: Int = 1
	pascal(2,4)                               //> res7: Int = 3
	pascal(3,4)                               //> res8: Int = 3
	pascal(4,4)                               //> res9: Int = 1

}
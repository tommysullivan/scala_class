package greeter

object TheWorksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(530); 
  
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
	};System.out.println("""pascal: (column: Int, row: Int)Int""");$skip(15); val res$0 = 
	
	pascal(1,1);System.out.println("""res0: Int = """ + $show(res$0));$skip(13); val res$1 = 
	pascal(1,2);System.out.println("""res1: Int = """ + $show(res$1));$skip(13); val res$2 = 
	pascal(2,2);System.out.println("""res2: Int = """ + $show(res$2));$skip(13); val res$3 = 
	pascal(1,3);System.out.println("""res3: Int = """ + $show(res$3));$skip(13); val res$4 = 
	pascal(2,3);System.out.println("""res4: Int = """ + $show(res$4));$skip(13); val res$5 = 
	pascal(3,3);System.out.println("""res5: Int = """ + $show(res$5));$skip(13); val res$6 = 
	pascal(1,4);System.out.println("""res6: Int = """ + $show(res$6));$skip(13); val res$7 = 
	pascal(2,4);System.out.println("""res7: Int = """ + $show(res$7));$skip(13); val res$8 = 
	pascal(3,4);System.out.println("""res8: Int = """ + $show(res$8));$skip(13); val res$9 = 
	pascal(4,4);System.out.println("""res9: Int = """ + $show(res$9))}

}

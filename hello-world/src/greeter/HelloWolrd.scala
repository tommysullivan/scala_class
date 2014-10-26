package greeter

object HelloWolrd extends App {
	println("Hello "+ten.toString())
	
	def ten = {
	  lazy val x = y
	  lazy val y = 5
	  x + y
	}
}
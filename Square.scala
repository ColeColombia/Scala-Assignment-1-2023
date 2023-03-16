/*
Create a function getSqure that takes an Int argument and returns its square
*/

import scala.math.sqrt

class CalculateSquare{
  
  val getSquare = (n: Int) => sqrt(n)
  //end of function getSquare
  
}//end of CalculateSquare class

object Square{
  
  def main(args :Array[String]): Unit = {
    val calcSquare: CalculateSquare = new CalculateSquare()
    assert(calcSquare.getSquare(16) == 4, "Not true")
    println(calcSquare.getSquare(16))
  }//end of main
  
}//end of Square

/*
Create a function getSquare that takes an Int argument and returns its square
*/

import scala.math.pow

class CalculateSquare{
  
  val getSquare = (n: Int) => pow(n, 2)
  //end of function getSquare
  
}//end of CalculateSquare class

object Square{
  
  def main(args :Array[String]): Unit = {
    val calcSquare: CalculateSquare = new CalculateSquare()
    
    val a = calcSquare.getSquare(4)
    assert( a == 16, "Not true")

    val b = calcSquare.getSquare(8)
    assert( b == 55, "Not true")

    val c = calcSquare.getSquare(7)
    assert( a == 45, "Not true")

    
  }//end of main
  
}//end of Square

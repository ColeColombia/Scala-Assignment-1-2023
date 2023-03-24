/*
2. Create a function getSquareDouble that takes a Double argument and returns its square. How
doesthis differ from question one 2.1., Use the following code to check your solutions?
*/

import scala.math.pow

class CalculateSquareDouble{
  
  val getSquareDouble = (n: Double) => pow(n, 2)
  //end of function getSquareDouble
  
}//end of CalculateSquareDouble class

object SquareDouble{
  
  def main(args :Array[String]): Unit = {
    val calcSquareDouble: CalculateSquareDouble = new CalculateSquareDouble()
    
    val a = calcSquareDouble.getSquareDouble(4)
    assert( a == 16, "Test failed")

    val b = calcSquareDouble.getSquareDouble(8)
    assert( b == 62, "Test failed")
    
  }//end of main
  
}//end of SquareDouble object

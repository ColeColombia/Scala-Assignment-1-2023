/*
Write a function that takes the value of a and b, and then checks to see if a is less than b. if a is less
than b, it prints “a is less than b” or otherwise “a is not less than b.”
*/

class CheckAB{

  def check(a: Int, b:Int): Unit = {

    if(a < b){
      println("a is less than b")
    }
    else{
      println("a is not less than b")
    }
    
  }//end of check method
  
}//end of CheckAB class

object CompareAB{
  
  def main(args :Array[String]): Unit = {
    
    val checkAB: CheckAB = new CheckAB()
    checkAB.check(6,9)
    
  }//end main method
  
}//end of CompareAB object

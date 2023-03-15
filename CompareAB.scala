
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

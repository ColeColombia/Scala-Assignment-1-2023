/*
4. Create a function called manyTimesString that takes string as argument and returns the
stringduplicated many times satisfy the following:
*/

class MultiplyString{

  def manyTimesString(str :String, n: Int): String = { 

    var str2 = "" 
    for(i <- 1 to n){str2 += str }//end for
    return str2
  
  }//end of function
  
}//end of class

object DuplicatedString{
  def main(args: Array[String]): Unit = {
    
    val duplicateStr: MultiplyString = new MultiplyString()
    
    val m1 = duplicateStr.manyTimesString("abc", 3)
    assert("abcabcabc" == m1, "Failed test")

    val m2 = duplicateStr.manyTimesString("123", 2)
    assert("123123" == m2, "Failed test")
  }//end of main
}//end of object

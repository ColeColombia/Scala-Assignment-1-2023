/*
3. Create a function addString that takes two string as arguments and return the string
appended(added).
*/

class AppendString{

  def addString(string1 :String, string2: String): String = string1 + string2
  
}//end AppendString class

object StringAddition{
  
  def main(args :Array[String]) = {
    val myString: AppendString = new AppendString()
    val s1 = myString.addString("abs", "def")

    assert(s1 == "absdef")
    println(s1)
    
  }//end main
}//end of StringAddition

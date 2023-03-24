/*
7. Create an anonymous function or lambda expression and assign I to the name
pluralize. It should construct the (simple) plural form of a word by just adding an
“s”.
*/

class ShowPlural{
  val pluralize = (word: String) => s"${word}s" 
}//end of class

object Plural{
  def main(args :Array[String]): Unit = {
    
    val plural: ShowPlural = new ShowPlural()
    
    var s = ""
    val words = List("word", "cat", "animal")

    words.foreach(w => s = s"${s.concat(plural.pluralize(w))} ")
    println(s"s is " + s""""${s}"""")
  }//end main
}//end of object

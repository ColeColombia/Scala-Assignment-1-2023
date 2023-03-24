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
    
    val word1 = plural.pluralize("dog")
    println(word1)

    val word2 = plural.pluralize("pig")
    println(word2)

    val word3 = plural.pluralize("chicken")
    println(word3)
    
  }//end main
}//end of object

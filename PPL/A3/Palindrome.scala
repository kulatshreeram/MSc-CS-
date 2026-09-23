object Palindrome{
  def palindromeIfElse(str: String): Unit ={
    if(str.isEmpty){
      println("Empty string is not considered a palindrome.")
    }else if(str.reverse == str){
      println("The string is a palindrome.")
    }else{
      println("The string is not a palindrome.")
    }
  }

  def palindromePattern(str: String): Unit ={
    str.reverse match{
      case x if str.isEmpty =>
        println("Empty string is not considered a palindrome.")

      case x if x == str =>
        println("The string is a palindrome.")

      case _ =>
        println("The string is not a palindrome.")
    }
  }

  def main(args: Array[String]): Unit ={

    print("Enter a string: ")
    val str = scala.io.StdIn.readLine()

    println("\nUsing If-Else:")
    palindromeIfElse(str)

    println("\nUsing Pattern Matching:")
    palindromePattern(str)
  }
}

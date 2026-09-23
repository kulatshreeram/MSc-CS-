object ReplaceSpace{
  def main(args: Array[String]): Unit ={

    print("Enter a string: ")
    val str = scala.io.StdIn.readLine()
    val newString = str.replace(' ', '-')

    println("New string: " + newString)
  }
}
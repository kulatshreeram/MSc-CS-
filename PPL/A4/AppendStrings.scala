import scala.io.StdIn
object AppendStrings{
  def main(args: Array[String]): Unit ={
    print("Enter first string: ")
    var str1 = StdIn.readLine()
    print("Enter second string: ")
    var str2 = StdIn.readLine()

    if(str1.length > str2.length)                   // If str1 > str2 
      str1 = str1.drop(str1.length - str2.length)   // remove first n letters from str1
    else if(str2.length > str1.length)              // If str2 > str1 
      str2 = str2.drop(str2.length - str1.length)   // remove first n letters from str2

    val result = str1 +" "+ str2
    println("Result = " + result)
  }
}
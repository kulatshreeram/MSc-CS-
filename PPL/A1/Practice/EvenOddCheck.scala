import scala.io.StdIn

object EvenOddCheck{
   def main(args: Array[String]): Unit = {
    println("enter an integer")
    val number=StdIn.readInt()
    val result=if(number %2==0)"even"else"odd"
    println(s"the number $number is $result.")
  }
}

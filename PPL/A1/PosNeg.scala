import scala.io.StdIn

object PosNeg{
   def main(args: Array[String]): Unit = {
    println("enter an integer")
    val n=StdIn.readInt()
    val result=if(n > 0)"positive"else if(n<0)"negative"else"zero"
    println(s"the number $n is $result.")
  }
}


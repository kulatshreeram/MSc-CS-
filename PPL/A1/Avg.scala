import scala.io.StdIn

object Avg{
   def main(args: Array[String]): Unit = {
    println("enter a number:")
    val a=StdIn.readInt()
    println("enter b number:")
    val b=StdIn.readInt()
    var sum = 0
    var i= a
    while(i<=b){
    sum= sum+i
    i=i+1
    }
    val n=b-a+1
    val avg=sum.toDouble/n
    println("the Average is "+ avg)
  }
}

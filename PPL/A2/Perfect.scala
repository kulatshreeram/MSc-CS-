import scala.io.StdIn
object Perfect {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 5) {
      print("Enter number: ")
      val n = StdIn.readInt()
      var sum = 0
      for (j <- 1 until n) {
        if (n % j == 0)
          sum = sum + j
      }
      if (sum == n)
        println(n + " is Perfect")
      else
        println(n + " is Not Perfect")
    }
  }
}

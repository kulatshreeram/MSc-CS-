import scala.io.StdIn
object SecondMax {
  def main(args: Array[String]): Unit = {
    print("Enter 4 numbers: ")
    val a = StdIn.readInt()
    val b = StdIn.readInt()
    val c = StdIn.readInt()
    val d = StdIn.readInt()
    var max = a
    var second = a
    if (b > max) {
      second = max
      max = b
    } else if (b > second) {
      second = b
    }
    if (c > max) {
      second = max
      max = c
    } else if (c > second) {
      second = c
    }
    if (d > max) {
      second = max
      max = d
    } else if (d > second) {
      second = d
    }
    println("Second maximum = " + second)
  }
}

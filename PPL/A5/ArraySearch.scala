import scala.io.StdIn

object ArraySearch {
  def main(args: Array[String]): Unit = {
    val arr = Array(10, 20, 30, 40, 50)

    print("Enter element to search: ")
    val target = StdIn.readInt()

    var found = false

    for (i <- arr.indices) {
      if (arr(i) == target) {
        println("Element found at index " + i)
        found = true
      }
    }

    if (!found)
      println("Element not found")
  }
}

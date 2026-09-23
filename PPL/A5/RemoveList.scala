import scala.io.StdIn

object RemoveList {
  def main(args: Array[String]): Unit = {
    val list = List(10, 20, 30, 40, 50)

    print("Enter element to remove: ")
    val value = StdIn.readInt()

    val byValue = list.filterNot(_ == value)
    println("After removing by value = " + byValue)

    print("Enter index to remove: ")
    val index = StdIn.readInt()

    if (index >= 0 && index < list.length) {
      val byIndex = list.patch(index, Nil, 1)
      println("After removing by index = " + byIndex)
    } else {
      println("Invalid index")
    }
  }
}

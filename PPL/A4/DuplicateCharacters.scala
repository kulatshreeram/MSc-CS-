import scala.io.StdIn

object DuplicateCharacters {
  def main(args: Array[String]): Unit = {

    print("Enter a string: ")
    val str = StdIn.readLine()

    println("Duplicate Characters:")

    for (ch <- str.distinct) {
      val count = str.count(_ == ch)

      if (count > 1)
        println(ch + " -> " + count)
    }
  }
}



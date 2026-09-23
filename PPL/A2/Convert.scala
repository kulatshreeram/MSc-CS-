import scala.io.StdIn
object Convert {
  def toBinary(n: Int): String = {
    Integer.toBinaryString(n)
  }
  def toOctal(n: Int): String = {
    Integer.toOctalString(n)
  }
  def main(args: Array[String]): Unit = {
    print("Enter an integer: ")
    val n = StdIn.readInt()
    println("Binary = " + toBinary(n))
    println("Octal = " + toOctal(n))
  }
}

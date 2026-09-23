import scala.io.StdIn

object Calculator {
  def main(args: Array[String]): Unit = {
    print("Enter first number: ")
    val a = StdIn.readDouble()
    print("Enter second number: ")
    val b = StdIn.readDouble()
    print("Enter operator (+, -, *, /): ")
    val op = StdIn.readChar()
    val result = op match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case _   => 0
    }
    println("Result = " + result)
  }
}

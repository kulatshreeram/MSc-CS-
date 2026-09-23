import scala.io.StdIn

object Armstrong {
  def isArmstrong(n: Int): Boolean = {
    var num = n
    var sum = 0

    while (num > 0) {
      val digit = num % 10
      sum = sum + digit * digit * digit
      num = num / 10
    }

    sum == n
  }

  def main(args: Array[String]): Unit = {
    print("Enter number: ")
    val n = StdIn.readInt()

    if (isArmstrong(n))
      println("Armstrong number")
    else
      println("Not an Armstrong number")
  }
}


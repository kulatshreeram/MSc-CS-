object MaxMin {
  def main(args: Array[String]): Unit = {
    val arr = Array(25, 10, 45, 5, 30)

    var max = arr(0)
    var min = arr(0)

    for (n <- arr) {
      if (n > max)
        max = n

      if (n < min)
        min = n
    }

    println("Maximum = " + max)
    println("Minimum = " + min)
  }
}

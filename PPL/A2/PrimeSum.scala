object PrimeSum {
  def main(args: Array[String]): Unit = {
    var sum = 0
    for (i <- 2 to 100) {
      var count = 0
      for (j <- 1 to i) {
        if (i % j == 0)
          count = count + 1
      }
      if (count == 2)
        sum = sum + i
    }
    println("Sum of prime numbers = " + sum)
  }
}

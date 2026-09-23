object ListDemo {
  def main(args: Array[String]): Unit = {
    val list = List(10, 15, 20, 25)

    val newList = 5 :: 7 :: 9 :: list

    val result = newList.filter(_ % 2 != 0)

    println("Final List = " + result)
  }
}

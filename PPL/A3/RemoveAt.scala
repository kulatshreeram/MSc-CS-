object RemoveAt{
  def main(args: Array[String]): Unit ={

    print("Enter a string: ")
    val str = scala.io.StdIn.readLine()

    print("Enter position to remove: ")
    val pos = scala.io.StdIn.readInt()

    if(pos>=0 && pos<str.length){
      val newString = str.substring(0, pos) + str.substring(pos + 1)

      println("Character removed: " + str.charAt(pos))
      println("New string: " + newString)
    }else{
      println("Invalid position! Position must be between 0 and " + (str.length - 1))
    }
  }
}
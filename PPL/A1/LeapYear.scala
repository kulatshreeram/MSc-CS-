object LeapYear{
  def main(args: Array[String]): Unit ={

    print("Enter a year: ")
    val year = scala.io.StdIn.readInt()

    if(year%400 == 0||(year%4==0 && year%100!=0)){
      println(year + " is a leap year")
    }else{
      println(year + " is not a leap year")
    }
  }
}
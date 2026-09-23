object CountVowels{
  def main(args: Array[String]): Unit ={
    print("Enter a string: ")
    val str = scala.io.StdIn.readLine().toLowerCase

    var vowels = 0
    var consonants = 0

    for(ch<-str){
      if(ch.isLetter){
        if("aeiou".contains(ch)){
          vowels += 1
        }else{
          consonants += 1
        }
      }
    }
    println("Number of vowels: " + vowels)
    println("Number of consonants: " + consonants)
  }
}
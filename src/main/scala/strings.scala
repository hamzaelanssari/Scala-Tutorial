object strings {
  def main(args: Array[String]): Unit ={
    // str1 and str2 are two strings
    val str1 = "Welcome! Hamza"
    val str2 = " to Scala language"
    // concatenate str1 and str2 strings
    // using concat() function
    val Newstr = str1.concat(str2);

    // Display strings
    println("String 1:" +str1);
    println("String 2:" +str2);
    println("New String :" +Newstr);

    // Concatenate strings using '+' operator
    println("This is the tutorial" +
      " of Scala language")
  }
}

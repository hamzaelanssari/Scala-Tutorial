object exceptions {

  // Define function
  def validate(article:Int): Unit=
  {
    // Using throw keyword
    if(article < 20)
      throw new ArithmeticException("You are not eligible for internship")
    else println("You are eligible for internship")
  }

  // Main method
  def main(args: Array[String])
  {
    validate(19)
  }
}

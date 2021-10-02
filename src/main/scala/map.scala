object map {
  // Main method
  def main(args:Array[String])
  {

    val map = Map("Person_1" -> 30,
      "Person_2" -> 20,
      "Person_3" -> 50)

    // Accessing score of Ajay
    val age_1 = map("Person_1")
    println(age_1)
  }
}

object iterator {
  // Main method
  def main(args:Array[String])
  {
    val v = Array(5, 1, 2, 3, 6, 4)

    // defining an iterator
    // for a collection
    val i = v.iterator

    while (i.hasNext)
      print(i.next + " ")
  }
}

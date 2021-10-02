object arrays {

  def main(args: Array[String]): Unit = {
    val numbers = Array(1, 2, 3, 4, 5)
    println("Second element is : " + numbers(1))
    val chars = new Array[Char](4)
    println("Second element is : " + chars(1))
    val alphabets = List('a', 'b', 'c', 'd')
    for (i <- 0 to (alphabets.length-1)) {
      chars(i) = alphabets(i)
    }
    println("Second element is : " + chars(1))
    val concat_lists = numbers.concat(chars)
  for(item<-concat_lists)
    print(item)
  }
}

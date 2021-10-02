object functions {

  def main(args: Array[String]): Unit = {
    println(Add(2, 4))
    println(Add2(2, 4))
    var Add3 = (a: Int, b: Int) => a + b
    println(Add3(2, 4))
    var Add4 = (_: Int) + (_: Int)
    println(Add4(2, 4))
    println("Min and Max from 5, 7")
    maxAndMin(5, 7)
  }

  def Add(a: Int, b: Int): Int = {
    return a + b
  }
  def Add2(x: Int, y: Int) = x + y;

  // Function
  def maxAndMin(a: Int, b: Int) = {

    // Nested Function
    def maxValue() = {
      if (a > b) {
        println("Max is: " + a)
      }
      else {
        println("Max is: " + b)
      }
    }

    // Nested Function
    def minValue() = {
      if (a < b) {
        println("Min is: " + a)
      }
      else {
        println("Min is: " + b)
      }
    }
    maxValue()
    minValue()
  }
}

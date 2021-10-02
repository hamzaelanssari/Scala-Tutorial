import java.io.IOException

object try_catch {

  // Main method
  def main(args: Array[String]) {
    try {
      var N = 5 / 0

    }
    catch {
      // Catch block contain cases.
      case i: IOException => {
        println("IOException occurred.")
      }
      case a: ArithmeticException => {
        println("Arithmetic Exception occurred.")
      }

    }
  }
}
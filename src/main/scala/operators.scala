object operators {
  // Main method
  def main(args: Array[String]): Unit = {
    // Operands
    var a = 10
    var b = 4
    val c = true
    val d = false
    var result = 0

    // using Arithmetic operators
    println("Addition is: "+ (a + b))
    println("Subtraction is: "+ (a - b))

    // using Relational Operators
    if (a == b)
    {
      println ("Equal To Operator is True")
    }
    else
    {
      println ("Equal To Operator is False")
    }

    // using Logical Operator 'OR'
    println("Logical Or of a || b = " + (c || d))

    // using Bitwise AND Operator
    result = a & b
    println ("Bitwise AND: " + result);

    // using Assignment Operators
    println ("Addition Assignment Operator: " + (a += b) );

  }
}

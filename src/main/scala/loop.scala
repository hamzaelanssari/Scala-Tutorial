object loop {
  // Main Method
  def main(args: Array[String]): Unit ={

    // for loop execution with range
    for(y <- 0 to 2)
    {
      println("Value of y is: " + y);
    }
    // loop with the range i until j
    for(y <- 3 until 5)
    {
      println("Value of y is: " + y);
    }
    // for loop execution with two vars
    for(a <- 1 to 2; b <- 1 to 2){
      println("Value of a: " + a)
      println("Value of b: " + b)
    }

    val numList = List(1,2,3,4,5,6);

    // for loop execution with a collection
    for(a <- numList){
      println( "Value of a: " + a);
    }

    // for loop execution with multiple filters
    for(a <- numList
         if a != 3; if a < 4){
      println( "Value of a: " + a );
    }

    // for loop execution with a yield
    val retVal = for{ a <- numList if a != 3; if a < 4 }yield a

    // Now print returned values using another loop.
    for( a <- retVal){
      println( "Value of a: " + a );
    }

    var x = 1;

    // Exit when x becomes greater than 4
    while (x <= 4)
    {
      println("Value of x: " + x);

      // Increment the value of x for
      // next iteration
      x = x + 1;
    }

    // using do..while loop
    do
    {
      println(x + " ");
      x = x - 1;
    }while(x > 0);
}
}

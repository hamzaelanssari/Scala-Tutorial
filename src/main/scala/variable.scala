object variable {

  def main(args: Array[String]): Unit ={
    // Mutable Variable
    var mutable_var: String = "Mutable Variable"
    println(mutable_var)
    mutable_var = "We Can Change Mutable Variable"
    println(mutable_var)
    // Immutable Variable
    val immutable_var: String = "Immutable Variable"
    println(immutable_var)
    // immutable_var = "We Can't Change Immutable Variable"
  }
}

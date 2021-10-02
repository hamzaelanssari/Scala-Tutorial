abstract class Person {
  def display() : Unit
  def set_FirstName(FirstName: String) : Unit
  def set_LastName(LastName: String) : Unit
  def set_Age(Age: Int) : Unit
  def get_FirstName() : String
  def get_LastName() : String
  def get_Age() : Int
  def toString() : String
}
class User(FirstName:String, LastName:String) extends Person {
  var age:Int = 0
  var firstName : String = FirstName
  var lastName: String = LastName
  // Auxiliary Constructor
  def this(FirstName:String, LastName:String, Age:Int){
    // Invoking primary constructor
    this(FirstName, LastName)
    this.age = Age
  }

  def display(): Unit ={
    println("FirstName : " + this.firstName)
    println("LastName : " + this.lastName)
    println("Age : " + this.age)
  }

  def set_FirstName(FirstName: String): Unit = {
    this.firstName= FirstName
  }

  def set_LastName(LastName: String): Unit = {
    this.lastName = LastName
  }
  def set_Age(Age: Int): Unit ={
    this.age = Age
  }


  def get_FirstName(): String = {
    return this.firstName
  }

  def get_LastName(): String = {
    return this.lastName
  }
  def get_Age(): Int ={
    return this.age
  }
  override def toString(): String ={
    val str = "My Name is " + this.firstName + " " + this.lastName + ", I'm " + this.age + " years old"
    return str
  }
}

object Main{
  def main(args: Array[String]): Unit ={
    var user1 = new  User("Hamza", "Mizo")
    // var user2 = new  User("Hamza_2", "Mizo_2", 20)
    user1.display()
    // user2.display()
    user1.set_FirstName("Hamza_2")
    println(user1.toString())
    user1.set_Age(22)
    println("Age : " + user1.get_Age())
  }
}

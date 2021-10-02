trait Type_trait {
  var Type: String = "None"
  def set_type(Type: String): Unit
  def get_type(): String
}

trait Color_trait {
  var Color: String = "None"
  def set_color(Color: String): Unit
  def get_color(): String
}
trait Full_trait {
  def display(): Unit
}


class Animal extends Type_trait with Color_trait with Full_trait{

  def set_all(Type: String, Color: String): Unit ={
    this.Type = Type
    this.Color = Color
  }
  def set_type(Type: String): Unit ={
    this.Type = Type
  }
  def get_type(): String ={
    return this.Type
  }
  def set_color(Color: String): Unit ={
    this.Color = Color
  }

  def get_color(): String ={
    return this.Color
  }
  def display(): Unit ={
    println("Animal Type is : " + this.Type)
    println("Animal Color is : " + this.Color)
  }
}


object Trait{
  def main(args: Array[String]): Unit ={
    var animal = new Animal()
    animal.display()
    animal.set_all("Cat", "Black")
    println(animal.get_type())
    println(animal.get_color())
    animal.display()
  }
}
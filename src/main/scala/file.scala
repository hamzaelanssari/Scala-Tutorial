// Scala File handling program
import java.io.File
import java.io.PrintWriter
import scala.io.Source

object file {

  def write():Unit = {
    // Creating a file
    val file_Object = new File("src/main/scala/file.txt" )

    // Passing reference of file to the print writer
    val print_Writer = new PrintWriter(file_Object)

    // Writing to the file
    print_Writer.write("Hello, This is Scala Tutorial")

    // Closing print writer
    print_Writer.close()
  }

  def read(): Unit = {
    // file name
    val fname = "src/main/scala/file.txt"

    // creates iterable representation
    // of the source file
    val fSource = Source.fromFile(fname)
    for(line<-fSource.getLines())
    println(line)
    // closing file
    fSource.close()
  }
  // Main method
  def main(args:Array[String]): Unit =
  {
    write()
    read()
  }
}

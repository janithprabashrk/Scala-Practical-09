import scala.io.StdIn.readLine

object NumClassifier {
  def main(args: Array[String]): Unit = {
    val input = readLine("Please Enter a Numbert : ").toInt

    val classifyNum: Int => String = {
      case n if n <= 0 => "Negative/Zero is input"
      case n if n % 2 == 0 => "Even number is given"
      case _ => "Odd number is given"
    }

    println(classifyNum(input))
  }
}

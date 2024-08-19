object NumberClassifier {
  def main(args: Array[String]): Unit = {
    val input = args(0).toInt

    val classifyNumber: Int => String = {
      case n if n <= 0 => "Negative/Zero is input"
      case n if n % 2 == 0 => "Even number is given"
      case _ => "Odd number is given"
    }

    println(classifyNumber(input))
  }
}

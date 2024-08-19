import scala.io.StdIn.readLine

object interestCalc {
    def main(args : Array[String]) : Unit = {
        val depositAmount = readLine("Please Enter a Deposit Amount : ").toDouble
        val interest: Double => Double = deposit =>{
            if (deposit <= 20000) {
                deposit * 0.02
            } else if (deposit <= 200000) {
                deposit * 0.04
            } else if (deposit <= 2000000) {
                deposit * 0.035
            } else {
                deposit * 0.065
            }            
        }

        val interestAmount = interest(depositAmount)
        println(s"The interest earned for a deposit of LKR. $depositAmount is LKR. $interestAmount")

    }


}
/**
  * Created by philhannant on 27/01/2016.
  */
object Expressions {

  def main(args: Array[String]) {
    val sky = "sunny"
    val temp = 90
    var niceDay = {
      if (sky == "sunny" && temp > 80) true
      else false
    }
    println(niceDay)

    var notSoNice = {
      if((sky == "sunny" || sky == "partly cloudy") && temp > 80)
        true
      else false
    }
    println(notSoNice)

    var mixedBag = {
      if ((sky == "sunny" || sky == "partly cloudy") && (temp > 80 || temp < 20))
        true
      else false
    }
    println(mixedBag)
  }
}

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

    var notSoNice = {
      if((sky == "sunny" || sky == "partly cloudy") && temp > 80)
        true
      else false
    }


  }
}

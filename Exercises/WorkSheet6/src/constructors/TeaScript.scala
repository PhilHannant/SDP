package constructors

import atomic.AtomicTest._

/**
  * Created by philhannant on 12/02/2016.
  */
object TeaScript extends App{

  val tea = new Tea
  tea.describe is "Earl Grey"
  tea.calories is 0
  val lemonZinger = new Tea(decaf = true, name="Lemon Zinger")
  lemonZinger.describe is "Lemon Zinger decaf"
  lemonZinger.calories is 0
  val sweetGreen = new Tea( name="Jasmine Green", sugar=true)
  sweetGreen.describe is "Jasmine Green + sugar"
  sweetGreen.calories is 16
  val teaLatte = new Tea(sugar=true, milk=true)
  teaLatte.describe is "Earl Grey + milk + sugar"
  teaLatte.calories is 116

}

class Tea(val decaf: Boolean = false,
          val sugar: Boolean = false,
          val name: String = "Earl Grey",
          val milk: Boolean = false){

  def describe(): String = {
    name
  }

  def calories(): Int = {
    var totCal = 0
    if (sugar == true){
      totCal = totCal + 100
    }
    if (milk == true){
      totCal = totCal + 16
    }
    totCal
  }
}

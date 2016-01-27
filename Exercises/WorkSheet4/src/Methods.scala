/**
  * Created by philhannant on 27/01/2016.
  */
object Methods {

  def getSquare(a: Int) = {
    a*a
  }

  def isArg1GreaterThanArg2(a: Double, b: Double){

  }

  def main(args: Array[String]) {
    val a = getSquare(3)
    assert(a == 9)
    val b = getSquare(6)
    assert(b == 36)
    val c = getSquare(5)
    assert(c == 25)

    val t1 = isArg1GreaterThanArg2(4.1, 4.12)
    assert(false)
    val t2 = isArg1GreaterThanArg2(2.1, 1.2)
    assert(true)
  }
}

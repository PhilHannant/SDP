/**
  * Created by philhannant on 27/01/2016.
  */
object Methods {

  def getSquare(a: Int) = {
    a*a
  }

  def isArg1GreaterThanArg2(a: Double, b: Double) = {
    if (a > b) true
    else false
  }

  def manyTimesString(str: String, x: Int) = {
      str * x

    }


  def main(args: Array[String]) {
    val a = getSquare(3)
    assert(a == 9)
    val b = getSquare(6)
    assert(b == 36)
    val c = getSquare(5)
    assert(c == 25)

    val t1 = isArg1GreaterThanArg2(4.1, 4.12)
    assert(!t1)
    val t2 = isArg1GreaterThanArg2(2.1, 1.2)
    assert(t2)

    val m1 = manyTimesString("abc", 3)
    assert("abcabcabc" == m1, "Failure!")
    println(m1)
    val m2 = manyTimesString("123", 2)
    assert("123123" == m2, "Failure")
    println(m2)


  }
}

package mapreduce

import atomic.AtomicTest._


/**
  * Created by philhannant on 18/02/2016.
  */
object MandR extends App {

  val v1 = Vector(1, 2, 3, 4)
  v1.map(n => n + 1) is Vector(2, 3, 4, 5)

  v1.map(n => n * 11 + 10) is Vector(21, 32, 43, 54)


  val v2 = for (e <- v1) yield e * 11 + 10
  v2 is Vector(21, 32, 43, 54)


  val v = Vector(1, 2, 3, 4)
  v.map(n => n + 1) is Vector(2, 3, 4, 5)

  val v3 = for (e <- v) yield e +1
  v3 is Vector(2, 3, 4, 5)

  val v4 = Vector(1, 10, 100, 1000)
  v4.reduce((sum, n) => sum + n) is 1111

  var sum = 0
  v4.foreach(x => sum += x)
  sum is 1111

  def sumIt(x: Int*) = {
    x.reduce((sum, x) => sum + x)
  }

  sumIt(1, 2, 3) is 6
  sumIt(45, 45, 45, 60) is 195
}

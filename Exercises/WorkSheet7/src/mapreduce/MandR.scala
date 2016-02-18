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
}

package nameddefaultargs

import atomic.AtomicTest._
/**
  * Created by philhannant on 12/02/2016.
  */
object TestNamedDefaultArgs extends App {

  val t = new SimpleTime(hours=5, minutes=30)
  t.hours is 5
  t.minutes is 30

  val t2 = new SimpleTime2(hours=10)
  t2.hours is 10
  t2.minutes is 0
}

case class SimpleTime(hours: Int, minutes: Int){}

case class SimpleTime2(hours: Int, minutes: Int = 0){}

package nameddefaultargs

import atomic.AtomicTest._
/**
  * Created by philhannant on 12/02/2016.
  */
object TestNamedDefaultArgs extends App {

  val t = new SimpleTime(hours=5, minutes=30)
  t.hours is 5
  t.minutes is 30

}

case class SimpleTime(hours: Int, minutes: Int){

}

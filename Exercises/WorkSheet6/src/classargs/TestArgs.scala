package classargs

import atomic.AtomicTest._

/**
  * Created by philhannant on 11/02/2016.
  */
object TestArgs extends App {

    val family1 = new Family("Mum", "Dad", "Sally", "Dick")
    family1.familySize() is 4

    val family2 = new Family("Dad", "Mom", "Harry")
    family2.familySize() is 3
}

case class Family(args: String*){


  def familySize() = {
      args.size
  }

}
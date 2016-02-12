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

  squareThem(2) is 4
  squareThem(2, 4) is 20
  squareThem(1, 2, 4) is 21

  def squareThem(x:Int*):Int = {
    var sqr = 0
    for(i <- x){
      sqr = sqr + i*i
    }
    sqr
  }

}

case class Family(Mum: String, Dad: String, kids: String*){


  def familySize() = {
      2 + kids.size
  }


}


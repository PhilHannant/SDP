package classargs

import atomic.AtomicTest._

/**
  * Created by philhannant on 11/02/2016.
  */
object Squarer {
  squareThem(2) is 4
  squareThem(2, 4) is 20
  squareThem(1, 2, 4) is 21


  def squareThem(args: Number*) = {




  }
}
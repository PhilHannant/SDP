import atomicScala.AtomicTest._

/**
  * Created by philhannant on 28/01/2016.
  */
object FieldsInClasses {

  def main(args: Array[String]) {

    val cup = new Cup
    cup.add(45) is 45
    cup.add(-15) is 30
    cup.add(-50) is -20
    // no additonal code needed to run tests below, issue is cup will have a negative percentage

    //q2 tests

    val cup1 = new Cup2
    cup1.add(45) is 45
    cup1.add(-55) is 0
    cup1.add(10) is 10
    cup1.add(-9) is 1
    cup1.add(-2) is 0

    cup1.percentFull = 56
    cup1.percentFull is 56 //seemed to work

    val cup2 = new Cup2
    cup2.set(56)
    cup2.get() is 56

  }

  class Cup {
    var percentFull = 0
    val max = 100

    def add(increase:Int):Int = {

      percentFull += increase

      if(percentFull > max) {
        percentFull = max
      }


      percentFull // Return this value

    }
  }



  class Cup2 {
    var percentFull = 0
    val max = 100

    def add(increase:Int):Int = {

      percentFull += increase

      if(percentFull > max) {
        percentFull = max
      } else if (percentFull < 0){
        percentFull = 0
      }
      percentFull // Return this value
    }

    def set(x: Int) = {
      percentFull = x
    }

    def get() = {
      percentFull
    }

  }


}

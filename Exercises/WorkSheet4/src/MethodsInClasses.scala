/**
  * Created by philhannant on 28/01/2016.
  */
object MethodsInClasses {

  def main(args: Array[String]) {



    val sailboat = new Sailboat
    val r1 = sailboat.raise()
    assert(r1 == "Sails raised", "Expected Sails raised, Got " + r1)
    val r2 = sailboat.lower()
    assert(r2 == "Sails lowered", "Expected Sails lowered, Got " + r2)
    val motorboat = new Motorboat
    val s1 = motorboat.on()
    assert(s1 == "Motor on", "Expected Motor on, Got " + s1)
    val s2 = motorboat.off()
    assert(s2 == "Motor off", "Expected Motor off, Got " + s2)

    val flare = new Flare
    val f1 = flare.light
    assert(f1 == "Flare used!", "Expected Flare used!, Got " + f1)

    val sailboat2 = new Sailboat2
    val signal = sailboat2.signal()
    assert(signal == "Flare used!", "Expected Flare used! Got " + signal)

    val motorboat2 = new Motorboat2
    val flare2 = motorboat2.signal()
    assert(flare2 == "Flare used!", "Expected Flare used!, Got " + flare2)

  }

  class Sailboat{

    def raise() = {
      "Sails raised"
    }

    def lower() = {
      "Sails lowered"
    }
  }


  class Motorboat {
    def on() = {
      "Motor on"
    }

    def off() = {
      "Motor off"
    }
  }

  class Flare{
    def light() ={
      "Flare used!"
    }

  }

  class Sailboat2{

    def raise() = {
      "Sails raised"
    }

    def lower() = {
      "Sails lowered"
    }

    def signal() = {
      val flare = new Flare
      flare.light()
    }
  }


  class Motorboat2 {
    def on() = {
      "Motor on"
    }

    def off() = {
      "Motor off"
    }
    def signal() = {
      val flare = new Flare
      flare.light()
    }

  }

}

/**
  * Created by philhannant on 28/01/2016.
  */
object MethodsInClasses {

  def main(args: Array[String]) {

    class Sailboat{

      def raise() = {
        "Sails raised"
      }

      def lower() = {
        "Sails Lowered"
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



  }

}

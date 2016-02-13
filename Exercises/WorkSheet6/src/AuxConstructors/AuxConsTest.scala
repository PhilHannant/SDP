package AuxConstructors

/**
  * Created by philhannant on 13/02/2016.
  */
object AuxConsTest {

}

class ClothesWasher(val modelName: String, val capacity: Double){

  def this() = {
    this("", 0)
  }

  def this(modelName: String) = {
    this(modelName, 0)
  }
  
  def this(capacity: Double) = {
    this("", capacity)
  }

}

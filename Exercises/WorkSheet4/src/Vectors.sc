import atomicScala.AtomicTest._
val vector1 = Vector("this", "is", "a", "vector")
val vector2 = Vector(1,2,3,4,5)
val vector3 = Vector(vector1, vector2)
val vector4 = Vector(23.1, 22.1, 45.3, 78.0)
val vector5 = Vector.empty

val newVec = Vector("The", "dog", "visited", "the", "fire", "station" )
var sentence = ""
newVec.foreach((a)=> sentence += a + " ")
sentence.toString () is "The dog visited the fire station "
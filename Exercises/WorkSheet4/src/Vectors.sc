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

val vecInt = Vector(1,3,5,33,56,8,42,1)
val vecDou = Vector(3.4,56.7,20.0,100.9)

vecInt.max
vecInt.min
vecInt.sum

vecDou.max
vecDou.min
vecDou.sum

val myVector1 = Vector(1, 2, 3, 4, 5, 6)
val myVector2 = Vector(1, 2, 3, 4, 5, 6)

myVector1 is myVector2

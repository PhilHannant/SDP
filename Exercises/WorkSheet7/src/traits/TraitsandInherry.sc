trait Shape{
  def sides:Int
  def perimeter:Double
  def area:Double
}

class Circle(radius: Double) extends Shape{

  def sides: Int = 1
  def perimeter: Double =
    (2 * radius) * Math.PI
  def area: Double =
    Math.PI * (radius*radius)
}

class Rectangle(length: Double, height: Double) extends Shape{

  def sides: Int = 4
  def perimeter: Double =
    (2*length) + (2*height)
  def area: Double =
    length * height
}

class Square(side: Double) extends Shape{

  def sides: Int = 4
  def perimeter: Double =
    (4*side)
  def area: Double =
    side * side
}

abstract class Rectangular extends Shape {
  def sides: Int = 4
}

class Rectangle2(length: Double, height: Double) extends Rectangular{

  def perimeter: Double =
    (2*length) + (2*height)
  def area: Double =
    length * height
}

class Square2(side: Double) extends Rectangular{

  def perimeter: Double =
    (4*side)
  def area: Double =
    side * side
}
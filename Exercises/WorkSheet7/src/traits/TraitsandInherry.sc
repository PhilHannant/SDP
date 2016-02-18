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

  def sides: Int = 1
  def perimeter: Double =
    (2*length) + (2*height)
  def area: Double =
    length * height
}

class Square(side: Double) extends Shape{

  def sides: Int = 1
  def perimeter: Double =
    (4*side)
  def area: Double =
    side * side
}

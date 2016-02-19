import atomic.AtomicTest._

sealed trait Shape{
  def sides:Int
  def perimeter:Double
  def area:Double
}

case class Circle(radius: Int) extends Shape{

  def sides: Int = 1
  def perimeter: Double =
    (2 * radius) * Math.PI
  def area: Double =
    Math.PI * (radius*radius)
}

case class Rectangle(length: Int, height: Int) extends Shape{

  def sides: Int = 4
  def perimeter: Double =
    (2*length) + (2*height)
  def area: Double =
    length * height
}

case class Square(side: Int) extends Shape{

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

object Draw{
  def apply(shape: Shape): String = shape match {
    case cir:Circle => "A circle of radius " + cir.radius + "cm"
    case sq:Square => "A Square of width " + sq.side + "cm"
    case rec:Rectangle => "A Rectangle of height " + rec.height + "cm and length " + rec.length + "cm"
  }
  }

val d = Draw
d.apply(Circle(10)) is "A circle of radius 10cm"
d.apply(Square(12)) is "A Square of width 12cm"
d.apply(Rectangle(11, 9)) is "A Rectangle of height 9cm and length 11cm"

package u02lab

object Es7 extends App:
  enum Shape:
    case Rectangle (b: Double, h: Double)
    case Circle (r: Double)
    case Square (l: Double)

  object Shape:
    def perimeter(s: Shape): Double = s match
      case Rectangle(b,h) => (b+h)*2
      case Square(l) => l*4
      case Circle(r) => 2*3.14*r

    def area(s: Shape): Double = s match
      case Rectangle(b,h) => b*h
      case Square(l) => l*l
      case Circle(r) => 2*3.14*r*r


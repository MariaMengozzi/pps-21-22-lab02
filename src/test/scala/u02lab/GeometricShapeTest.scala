package u02lab
import org.junit.*
import org.junit.Assert.*
import Es7.Shape.*

class GeometricShapeTest:
  @Test def testRectangle2p()=
    val rect = Rectangle(10, 5);
    assertEquals(30, perimeter(rect), 0.001);

  @Test def testRectangleArea()=
    val rect = Rectangle(10, 5);
    assertEquals(50, area(rect), 0.001)

  @Test def testSquare2p()=
    val square = Square(5);
    assertEquals(20, perimeter(square), 0.001);

  @Test def testSquareArea()=
    val square = Square(5);
    assertEquals(25, area(square), 0.001)

  @Test def testCircle2p()=
    val circle = Circle(2)
    assertEquals(12.56, perimeter(circle), 0.001)

  @Test def testCircleArea()=
    val circle = Circle(2)
    assertEquals(25.12, area(circle), 0.001)
package u02lab
import org.junit.*
import org.junit.Assert.*
import Es6.Fibonacci.*

class FibonacciTest:
  @Test def testFibonacci0(): Unit =
    assertEquals(0, fib(0));

  @Test def testFibonacci1(): Unit =
    assertEquals(1, fib(1));

  @Test def testFibonacci4(): Unit =
    assertEquals(3, fib(4));

  @Test def testFibonacciTail0(): Unit =
      assertEquals(0, tailFib(0));

  @Test def testFibonacciTail1(): Unit =
    assertEquals(1, tailFib(1));

  @Test def testFibonacciTail4(): Unit =
    assertEquals(3, tailFib(4));

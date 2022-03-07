package u02lab
import org.junit.*
import org.junit.Assert.*
import Es6.Fibonacci.*

class FibonacciTest:
  @Test def testFibonacci()=
    assertEquals(0, fib(0));
    assertEquals(1, fib(1));
    assertEquals(1, fib(2));
    assertEquals(2, fib(3));
    assertEquals(3, fib(4));

  @Test def testFibonacciTail() =
    assertEquals(0, tailFib(0));
    assertEquals(1, tailFib(1));
    assertEquals(1, tailFib(2));
    assertEquals(2, tailFib(3));
    assertEquals(3, tailFib(4));

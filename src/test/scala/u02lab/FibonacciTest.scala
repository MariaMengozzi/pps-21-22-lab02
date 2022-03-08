package u02lab
import org.junit.*
import org.junit.Assert.*
import Es6.Fibonacci.*

class FibonacciTest:
  @Test def testFibonacci0()=
    assertEquals(0, fib(0));

  @Test def testFibonacci1()=
    assertEquals(1, fib(1));

  @Test def testFibonacci4()=
    assertEquals(3, fib(4));

  @Test def testFibonacciTail0()=
      assertEquals(0, tailFib(0));

  @Test def testFibonacciTail1()=
    assertEquals(1, tailFib(1));

  @Test def testFibonacciTail4()=
    assertEquals(3, tailFib(4));

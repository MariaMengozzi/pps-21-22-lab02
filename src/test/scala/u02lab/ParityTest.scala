package u02lab

import org.junit.*
import org.junit.Assert.*
import Es3.Parity.*

class ParityTest {
  @Test def testOdd() =
    assertEquals("odd", parity(5))

  @Test def testEven() =
    assertEquals("even", parity(2))
}

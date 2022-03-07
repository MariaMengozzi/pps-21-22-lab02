package u02lab

import org.junit.*
import org.junit.Assert.*
import Es5.FunctionComposition.*

class FunctionCompositionTest:
  @Test def testComposition()=
    //f(g(5)) = f(5*2) = f(10) = 10-1
    assertEquals(9, compose(_ - 1, _ * 2)(5));
    assertNotEquals(9, compose(_ - 1, _ * 2)(6)) //expected 11
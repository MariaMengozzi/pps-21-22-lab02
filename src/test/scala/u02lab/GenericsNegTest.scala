package u02lab

import org.junit.Assert.{assertFalse, assertTrue}
import org.junit.Test
import Es3.GenericsNeg.negGen

class GenericsNegTest:
  val empty: String => Boolean = _ == "" // predicate on strings
  val notEmpty = negGen(empty)
  val int: Int => Boolean = _ == 0 // predicate on strings
  val notZero = negGen(int)

  @Test def testGenericsNegEmpty1() =
    assertTrue(notEmpty("foo"));

  @Test def testGenericsNegEmpty2() =
    assertFalse(notEmpty(""));

  @Test def testGenericsNegEmpty3() =
    assertTrue(notEmpty("foo") && !notEmpty(""));

  @Test def testGenericsNegInt1() =
    assertTrue(notZero(2));

  @Test def testGenericsNegInt2() =
    assertFalse(notZero(0));

  @Test def testGenericsNegInt3() =
    assertTrue(notZero(3) && !notZero(0));

package u02lab

import org.junit.Assert.{assertFalse, assertTrue}
import org.junit.Test
import Es3.GenericsNeg.negGen

class GenericsNegTest:
  val empty: String => Boolean = _ == "" // predicate on strings
  val notEmpty = negGen(empty)
  val int: Int => Boolean = _ == 0 // predicate on strings
  val notZero = negGen(int)

  @Test def testGenericsNegEmpty1(): Unit =
    assertTrue(notEmpty("foo"));

  @Test def testGenericsNegEmpty2(): Unit =
    assertFalse(notEmpty(""));

  @Test def testGenericsNegEmpty3(): Unit =
    assertTrue(notEmpty("foo") && !notEmpty(""));

  @Test def testGenericsNegInt1(): Unit =
    assertTrue(notZero(2));

  @Test def testGenericsNegInt2(): Unit =
    assertFalse(notZero(0));

  @Test def testGenericsNegInt3(): Unit =
    assertTrue(notZero(3) && !notZero(0));

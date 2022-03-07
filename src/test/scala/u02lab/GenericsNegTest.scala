package u02lab

import org.junit.Assert.{assertFalse, assertTrue}
import org.junit.Test
import Es3.GenericsNeg.negGen

class GenericsNegTest:

  @Test def testGenericsNegEmpty() =
    val empty: String => Boolean = _ == "" // predicate on strings
    val notEmpty = negGen(empty)
    assertTrue(notEmpty("foo"));
    assertFalse(notEmpty(""));
    assertTrue(notEmpty("foo") && !notEmpty(""));

  @Test def testGenericsNegInt() =
    val int: Int => Boolean = _ == 0 // predicate on strings
    val notZero = negGen(int)
    assertTrue(notZero(2));
    assertFalse(notZero(0));
    assertTrue(notZero(3) && !notZero(0));

package u02lab

import org.junit.*
import org.junit.Assert.*
import Es3.Neg.*

class NegTest:
  val empty: String => Boolean = _ == "" // predicate on strings
  @Test def testEmpty() =
    val notEmpty = neg(empty)
    assertTrue(notEmpty("foo"));
    assertFalse(notEmpty(""));
    assertTrue(notEmpty("foo") && !notEmpty(""));

  @Test def testEmptyWithMethod() =
    val notEmptyMethod = negMethod(empty)
    assertTrue(notEmptyMethod("foo"));
    assertFalse(notEmptyMethod(""));
    assertTrue(notEmptyMethod("foo") && !notEmptyMethod(""))


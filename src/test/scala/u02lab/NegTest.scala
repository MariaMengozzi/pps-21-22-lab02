package u02lab

import org.junit.*
import org.junit.Assert.*
import Es3.Neg.*

class NegTest:
  val empty: String => Boolean = _ == "" // predicate on strings
  val notEmpty = neg(empty)
  val notEmptyMethod = negMethod(empty)

  @Test def testEmpty1(): Unit =
    assertTrue(notEmpty("foo"));

  @Test def testEmpty2(): Unit =
    assertFalse(notEmpty(""));

  @Test def testEmpty3() =
    assertTrue(notEmpty("foo") && !notEmpty(""));

  @Test def testEmptyWithMethod1(): Unit =
    assertTrue(notEmptyMethod("foo"));

  @Test def testEmptyWithMethod2(): Unit =
    assertFalse(notEmptyMethod(""));

  @Test def testEmptyWithMethod3(): Unit =
    assertTrue(notEmptyMethod("foo") && !notEmptyMethod(""))


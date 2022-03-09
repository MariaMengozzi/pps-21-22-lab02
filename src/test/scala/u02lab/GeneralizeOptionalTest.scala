package u02lab

import org.junit.Assert.assertEquals
import org.junit.Test
import u02lab.Es8.Option.*

class GeneralizeOptionalTest:
  @Test def testDobleWithSome(): Unit =
    assertEquals(Some(4), double(Some(2)))

  @Test def testDobleWithNone(): Unit =
    assertEquals(None(), double(None()))

  @Test def testInvertWithSome(): Unit =
    assertEquals(Some(false), ìnvert(Some(true)))

  @Test def testInverWithNone(): Unit =
    assertEquals(None(), ìnvert(None()))

  @Test def testDobleGenWithSome(): Unit =
    val f: Int => Int = x => x*2
    assertEquals(Some(4), generalizeDoubleAndInvert(Some(2))(f))

  @Test def testDobleGenWithNone(): Unit =
    val f: Int => Int = x => x*2
    assertEquals(None(), generalizeDoubleAndInvert(None())(f))

  @Test def testInvertGenWithSome(): Unit =
    val f: Boolean => Boolean = x => !x
    assertEquals(Some(false), generalizeDoubleAndInvert(Some(true))(f))

  @Test def testInverGenWithNone(): Unit =
    val f: Boolean => Boolean = x => !x
    assertEquals(None(), generalizeDoubleAndInvert(None())(f))
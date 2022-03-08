package u02lab

import org.junit.Assert.assertEquals
import org.junit.Test
import u02lab.Es8.Option.*

class GeneralizeOptionalTest:
  @Test def testDobleWithSome()=
    assertEquals(Some(4), double(Some(2)))

  @Test def testDobleWithNone()=
    assertEquals(None(), double(None()))

  @Test def testInvertWithSome()=
    assertEquals(Some(false), ìnvert(Some(true)))

  @Test def testInverWithNone()=
    assertEquals(None(), ìnvert(None()))

  @Test def testDobleGenWithSome()=
      val f: Int => Int = x => x*2
      assertEquals(Some(4), generalizeDoubleAndInvert(Some(2))(f))

  @Test def testDobleGenWithNone()=
    val f: Int => Int = x => x*2
    assertEquals(None(), generalizeDoubleAndInvert(None())(f))

  @Test def testInvertGenWithSome()=
    val f: Boolean => Boolean = x => !x
    assertEquals(Some(false), generalizeDoubleAndInvert(Some(true))(f))

  @Test def testInverGenWithNone()=
    val f: Boolean => Boolean = x => !x
    assertEquals(None(), generalizeDoubleAndInvert(None())(f))
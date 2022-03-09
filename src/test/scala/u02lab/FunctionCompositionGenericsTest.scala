package u02lab

import org.junit.*
import org.junit.Assert.*
import u02lab.Es5.FunctionComposition.*

class FunctionCompositionGenericsTest:

  @Test def testGenericCompositionEquals(): Unit =
    val f: Int => Int = x => x-1
    val g: Int => Int = x => x * 2
    assertEquals(9, genericCompose(f,g)(5))

  @Test def testGenericCompositionNotEquals(): Unit =
    val f: Int => Int = x => x-1
    val g: Int => Int = x => x * 2
    assertNotEquals(9, genericCompose(f,g)(6))//expected 11

  @Test def testGenericCompositionMixedEquals(): Unit =
    val f: Int => String = x => "f(" + x + ")"
    val g: Int => Int = x => x*2
    assertEquals("f(10)", genericCompose(f,g)(5))

  @Test def testGenericCompositionMixedNotEquals(): Unit =
    val f: Int => String = x => "f(" + x + ")"
    val g: Int => Int = x => x*2
    assertNotEquals("f(f(x))", genericCompose(f,g)(5))


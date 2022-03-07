package u02lab

import org.junit.*
import org.junit.Assert.*
import FunctionComposition.FunctionComposition.*

class FunctionCompositionTest:
  @Test def testComposition()=
    //f(g(5)) = f(5*2) = f(10) = 10-1
    assertEquals(9, compose(_ - 1, _ * 2)(5));
    assertNotEquals(9, compose(_ - 1, _ * 2)(6)) //expected 11

  @Test def testGenericComposition()=
    val f: Int => Int = x => x-1
    val g: Int => Int = x => x * 2
    assertEquals(9, genericCompose(f,g)(5));
    assertNotEquals(9, genericCompose(f,g)(6)) //expected 11

  @Test def testGenericCompositionWithString()=
    val f: String => String = x => "f(" + x + ")";
    val g: String => String = x => "g(" + x + ")";
    assertEquals("f(g(x))", genericCompose(f,g)("x"));
    assertNotEquals("f(f(x))", genericCompose(f,g)("x"))

  @Test def testGenericCompositionMixed()=
    val f: Int => String = x => "f(" + x + ")";
    val g: Int => Int = x => x*2;
    assertEquals("f(10)", genericCompose(f,g)(5));
    assertNotEquals("f(f(x))", genericCompose(f,g)(5))


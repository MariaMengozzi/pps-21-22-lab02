package u02lab

import org.junit.*
import org.junit.Assert.*
import Es4.CurrierEx.*

class CurrierExTest:
  @Test def testP1True(): Unit =
    assertTrue(p1(5)(10)(15));

  @Test def testP1False(): Unit =
    assertFalse(p1(20)(10)(15));

  @Test def testP2True(): Unit =
    assertTrue(p2(5,10,15));

  @Test def testP2False(): Unit =
    assertFalse(p2(20,10,15));

  @Test def testP3True(): Unit =
    assertTrue(p3(5)(10)(15));

  @Test def testP3False(): Unit =
    assertFalse(p3(20)(10)(15));
    
  @Test def testP4True(): Unit =
    assertTrue(p4(5,10,15));

  @Test def testP4False(): Unit =
    assertFalse(p4(20,10,15));
    

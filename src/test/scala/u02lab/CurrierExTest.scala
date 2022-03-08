package u02lab

import org.junit.*
import org.junit.Assert.*
import Es4.CurrierEx.*

class CurrierExTest:
  @Test def testP1True() =
    assertTrue(p1(5)(10)(15));

  @Test def testP1False() =
    assertFalse(p1(20)(10)(15));

  @Test def testP2True() =
    assertTrue(p2(5,10,15));

  @Test def testP2False()=
    assertFalse(p2(20,10,15));

  @Test def testP3True() =
    assertTrue(p3(5)(10)(15));

  @Test def testP3False()=
    assertFalse(p3(20)(10)(15));
    
  @Test def testP4True()=
    assertTrue(p4(5,10,15));

  @Test def testP4False()=
    assertFalse(p4(20,10,15));
    

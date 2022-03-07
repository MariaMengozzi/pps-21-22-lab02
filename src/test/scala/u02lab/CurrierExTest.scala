package u02lab

import org.junit.*
import org.junit.Assert.*
import Es4.CurrierEx.*

class CurrierExTest:
  @Test def testP1() =
    assertTrue(p1(5)(10)(15));
    assertFalse(p1(20)(10)(15));

  @Test def testP2() =
    assertTrue(p2(5,10,15));
    assertFalse(p2(20,10,15));

  @Test def testP3() =
    assertTrue(p3(5)(10)(15));
    assertFalse(p3(20)(10)(15));
    
  @Test def testP4()=
    assertTrue(p4(5,10,15));
    assertFalse(p4(20,10,15));
    

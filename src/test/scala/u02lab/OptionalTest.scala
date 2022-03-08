package u02lab
import org.junit.*
import org.junit.Assert.*
import Es8.Option.*

class OptionalTest:

  @Test def testFilter1()=
    assertEquals(Some(5), filter(Some(5))(_ > 2))

  @Test def testFilter2()=
    assertEquals(None(), filter(Some(5))(_ > 8))

  @Test def testFilter3()=
    assertEquals(None(), filter(None[Int]())(_ > 2))

  @Test def testMap_1()=
    assertEquals(Some(true), map(Some(5))(_ > 2))

  @Test def testMap_2()=
    assertEquals(Some(false), map(Some(5))(_ > 8))

  @Test def testMap_3()=
    assertEquals(None(), map(None[Int]())(_ > 2))

  @Test def testMap2_1()=
    assertEquals(Some(5), map2(Some(2), Some(3))((x,y) => x+y))

  @Test def testMap2_2()=
    assertEquals(Some("ciao"), map2(Some("ci"), Some("ao"))((x,y) => x+y))

  @Test def testMap2_3()=
    assertEquals(None(), map2(None[Int](), Some(5))(_ > _))

  @Test def testMap2_4()=
    assertEquals(Some(true), map2(Some(8), Some(5))(_ > _))


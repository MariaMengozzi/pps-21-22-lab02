package u02lab
import org.junit.*
import org.junit.Assert.*
import Es8.Option.*

class OptionalTest:

  @Test def testFilter()=
    assertEquals(Some(5), filter(Some(5))(_ > 2))
    assertEquals(None(), filter(Some(5))(_ > 8))
    assertEquals(None(), filter(None[Int]())(_ > 2))

  @Test def testMap()=
    assertEquals(Some(true), map(Some(5))(_ > 2))
    assertEquals(Some(false), map(Some(5))(_ > 8))
    assertEquals(None(), map(None[Int]())(_ > 2))

  @Test def testMap2()=
    assertEquals(Some(5), map2(Some(2), Some(3))((x,y) => x+y))
    assertEquals(Some("ciao"), map2(Some("ci"), Some("ao"))((x,y) => x+y))
    assertEquals(None(), map2(None[Int](), Some(5))(_ > _))
    assertEquals(Some(true), map2(Some(8), Some(5))(_ > _))


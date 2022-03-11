package u02lab

import org.junit.*
import org.junit.Assert.*
import u02lab.Es9.Tree.*

class BTreeTest:
  val tree = Branch(Branch(Leaf(1), Leaf(2)), Leaf(1))
  @Test def testBTreeGeneralisationSize(): Unit=
    val p: (Int, Int) => Int = (x,y) => _+_;
    val pL: (Int) => Int = _ => 1
    assertEquals(3, generalisation (tree, p, pL))

  @Test def testBTreeGeneralisationFind(): Unit=
    val p: (Boolean, Boolean) => Boolean = (x,y) => _ || _;
    val pL: (Int) => Boolean = e => e == 1
    assertTrue(generalisation (tree, p, pL))

  @Test def testBTreeGeneralisationFind2(): Unit=
    val p: (Boolean, Boolean) => Boolean = (x,y) => _ || _;
    val pL: (Int) => Boolean = e => e == 4
    assertFalse(generalisation (tree,p, pL))

  @Test def testBTreeGeneralisationCount(): Unit=
    val p: (Int, Int) => Int = (x,y) => _+_;
    val pL: (Int) => Int = e => e match
      case x if (x == 1) => 1
      case _ => 0
    assertEquals(2, generalisation (tree, p, pL))
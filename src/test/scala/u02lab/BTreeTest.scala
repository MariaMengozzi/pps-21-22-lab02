package u02lab

import org.junit.*
import org.junit.Assert.*
import u02lab.Es9.Tree.*

class BTreeTest:
  val tree = Branch(Branch(Leaf(1), Leaf(2)), Leaf(1))
  @Test def testBTreeGeneralisationSize(): Unit=
    val p: (Int, Int, Int) => Int = (x,y,_) => x+y;
    val pL: (Int, Int) => Int = (_,_) => 1
    assertEquals(3, generalisation (tree, 0, p, pL))

  @Test def testBTreeGeneralisationFind(): Unit=
    val p: (Boolean, Boolean, Int) => Boolean = (x,y,_) => x || y;
    val pL: (Int, Int) => Boolean = (e, elem)=> e == elem
    assertTrue(generalisation (tree, 1, p, pL))

  @Test def testBTreeGeneralisationFind2(): Unit=
    val p: (Boolean, Boolean, Int) => Boolean = (x,y,_) => x || y;
    val pL: (Int, Int) => Boolean = (e, elem)=> e == elem
    assertFalse(generalisation (tree,4, p, pL))

  @Test def testBTreeGeneralisationCount(): Unit=
    val p: (Int, Int, Int) => Int = (x,y,_) => x+y;
    val pL: (Int, Int) => Int = (e, elem)=> (e, elem) match
      case (x,y) if x == y => 1
      case _ => 0
    assertEquals(2, generalisation (tree,1, p, pL))
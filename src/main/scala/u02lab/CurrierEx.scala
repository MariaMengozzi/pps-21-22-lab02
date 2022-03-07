package u02lab

object CurrierEx extends App:
  object CurrierEx:

    val p1: (Int) => (Int) => (Int) => Boolean = x => y => z => x<=y && y<=z;

    val p2: (Int, Int, Int)=> Boolean = (x,y,z) => x <= y && y<= z;

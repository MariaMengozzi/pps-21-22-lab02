package u02lab

object Es3 extends App:
  object Parity:
    val parity: Int => String = _ match
      case n if n%2 == 0 => "even"
      case _ => "odd"

    //println(parity(5)) //"odd"
    //println(parity(2)) //"even"

    def parityMethod(x:Int): String = x match
      case n if n%2 == 0 => "even"
      case _ => "odd"

  object Neg:
    val neg: (String => Boolean) => (String => Boolean) = f => x => !f(x);

    def negMethod (f: (s : String)=> Boolean) : String=>Boolean = s => !f(s);

  object GenericsNeg:
    def negGen[X] (f: (s : X)=> Boolean) : X=>Boolean = s => !f(s);

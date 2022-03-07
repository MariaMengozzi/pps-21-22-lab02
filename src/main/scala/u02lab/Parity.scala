package u02lab

object Parity extends App:
  object Parity:
    val parity: Int => String = _ match
      case n if n%2 == 0 => "even"
      case _ => "odd"

    //println(parity(5)) //"odd"
    //println(parity(2)) //"even"

    def parityMethod(x:Int): String = x match
      case n if n%2 == 0 => "even"
      case _ => "odd"

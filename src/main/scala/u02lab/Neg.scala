package u02lab

object Neg extends App:

  object Neg:
    val neg: (String => Boolean) => (String => Boolean) = f => x => !f(x);

    def negMethod (f: (s : String)=> Boolean) : String=>Boolean = s => !f(s);


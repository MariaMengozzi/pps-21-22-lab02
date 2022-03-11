package u02lab

object Es5:
  object FunctionComposition:
    val compose: (f: Int => Int, g: Int => Int)=> Int => Int = (f,g) => i => f(g(i));

    def genericCompose[T, X, Y] (f: X => Y, g: T => X): T => Y = i => f(g(i));


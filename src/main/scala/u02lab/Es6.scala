package u02lab

object Es6 extends App:
  object Fibonacci:
    def fib (n: Int): Int = n match
      case 0 | 1 => n
      case _ => fib(n-1) + fib(n-2);


    def tailFib(n: Int): Int =
      @annotation.tailrec
      def _tailFib (n: Int, prevSum: Int, sum: Int): Int = n match
        case 0 => prev
        case 1 => sum
        case _ => _tailFib(n-1, sum , sum + prevSum)
      _tailFib(n, 0, 1)

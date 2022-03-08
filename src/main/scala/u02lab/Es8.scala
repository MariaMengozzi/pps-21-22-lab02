package u02lab

object Es8 extends App:
  enum Option[A]:
    case Some(a: A)
    case None() // here parens are needed because of genericity

  object Option:

    def isEmpty[A](opt: Option[A]): Boolean = opt match
      case None() => true
      case _ => false

    def orElse[A, B >: A](opt: Option[A], orElse: B): B = opt match
      case Some(a) => a
      case _ => orElse

    def flatMap[A, B](opt: Option[A])(f: A => Option[B]): Option[B] = opt match
      case Some(a) => f(a)
      case _ => None()

    def filter[A](opt: Option[A])(p: A => Boolean): Option[A] = opt match
      case Some(i) if p(i) => Some(i)
      case _ => None()

    def map[A](opt: Option[A])(p: A => Boolean): Option[Boolean] = opt match
      case Some(i) => Some(p(i))
      case _ => None()

    def map2[A,A1,B](opt1: Option[A], opt2: Option[A1])(p: (A,A1) => B): Option[B] = (opt1, opt2) match
      case (Some(i), Some(j)) => Some(p(i,j))
      case _ => None()

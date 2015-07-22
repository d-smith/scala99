package lists


object P26 {

  def processSublists[A,B](l: List[A])(f: (List[A]) => List[B]) : List[B] = {
    l match {
      case Nil => Nil
      case sl@(_ :: t) => f(sl) ::: processSublists(t)(f)
    }
  }

  def combinations[A](k: Int, l: List[A]): List[List[A]] = {
    if (k == 0) List(Nil)
    else processSublists(l) { l =>
      combinations(k - 1, l.tail) map {l.head :: _}
    }
  }
}

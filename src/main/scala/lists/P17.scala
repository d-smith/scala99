package lists


object P17 {
  def split[A](n: Int, l:List[A]) : (List[A], List[A]) =
    (n,l) match {
      case (_, Nil) => (Nil, Nil)
      case (0,list) => (Nil, list)
      case (n, h :: tail) =>
        val (p1, p2) = split(n - 1, tail)
        (h :: p1, p2)
    }
}

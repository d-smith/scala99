package lists


object P18 {
  def slice[A](s: Int, e:Int, l: List[A]) : List[A] = {
    (s,e,l) match {
      case (_, _, Nil) => Nil
      case (_, e, _) if e <= 0  => Nil
      case (s, e, h :: tail) if s <= 0 => h :: slice(0, e - 1, tail)
      case (s, e, h :: tail) => slice(s - 1, e - 1, tail )
    }
  }
}

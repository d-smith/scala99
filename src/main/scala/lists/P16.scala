package lists


object P16 {
  def drop[A](n: Int, l : List[A]) : List[A] = {
    l.zipWithIndex filter { p => (p._2 + 1) %n  != 0} map { _._1}
  }
}

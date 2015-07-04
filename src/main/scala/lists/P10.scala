package lists

object P10 {
  import P09.pack
  def encode[A](l: List[A]) : List[(Int, A)] = {
    pack(l) map { e => (e.length, e.head)}
  }
}

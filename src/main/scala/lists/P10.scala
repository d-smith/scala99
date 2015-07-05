package lists

object P10 {
  import P09.pack
  def encode[A](l: List[A]) : List[(Int, A)] = {
    pack(l) map { e => (e.length, e.head)}
  }
}

object P11 {
  import P10.encode

  def encodeModified[A](l : List[A]) : List[Any] = {
    encode(l) map { e => if (e._1 == 1) e._2 else e }
  }
}
package lists


object P09 {
  def pack[A](l : List[A]) : List[List[A]] = {
    if (l.isEmpty) List(List())
    else  {
      val (prefix,suffix) = l.span(_ == l.head)
      if (suffix == Nil) List(prefix)
      else prefix :: pack(suffix)
    }
  }
}

package lists


object P14 {
  def duplicate[A](l: List[A]) : List[A] =
    l.flatMap(e => List(e,e))
}

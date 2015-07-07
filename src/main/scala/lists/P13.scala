package lists


object P13 {
  def encodeDirect[A](l: List[A]) : List[(Int, A)] =
    if (l.isEmpty) Nil
    else {
      val (front, back) = l.span(_ == l.head)
      (front.length, front.head) :: encodeDirect(back)
    }
}

package lists


object P20 {
  def removeAt[A](n: Int, l: List[A]) : (List[A], A) = l.splitAt(n) match {
    case (Nil,_) => throw new NoSuchElementException
    case (front, h :: t) => (front ::: t, h)
    case (front ,Nil) => throw new NoSuchElementException
  }
}

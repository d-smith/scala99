package lists

object P01 {
  def last[A](l: List[A]) : A = {
    l match {
      case h :: Nil => h
      case _ :: tail => last(tail)
      case _ => throw new NoSuchElementException
    }
  }
}
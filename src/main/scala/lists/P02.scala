package lists


object P02 {
  def nextToLast[A](l: List[A]) : A = {
    l match {
      case h :: _ :: Nil => h
      case _ :: tail => nextToLast(tail)
      case _ => throw new NoSuchElementException
    }
  }
}

package lists

object P21 {
  def insertAt[A](e: A, n : Int, l:List[A]) : List[A] = l.splitAt(n) match {
    case (front, back) => front ::: (e :: back)
  }
}

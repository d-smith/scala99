package lists


object P15 {
  def duplicateN[A](n: Int, l : List[A]) : List[A] = {
    l flatMap { List.fill(n)(_)}
  }
}

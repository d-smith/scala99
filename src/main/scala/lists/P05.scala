package lists


object P05 {
  def reverse[A](l : List[A]) : List[A] = l.foldLeft(List[A]()){(rl, e) => e :: rl}
}

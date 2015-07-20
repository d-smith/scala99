package lists


object P25 {
  import P23.randomSelect
  def randomPermute[A](l: List[A]) : List[A] = randomSelect(l.length, l)
}

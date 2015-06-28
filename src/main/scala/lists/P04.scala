package lists


object P04 {
  def length[A](l: List[A]) : Int = l.foldLeft(0) { (t,_) => t + 1}
}

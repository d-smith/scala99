package lists


object P12 {
  def decode[A](l:List[(Int,A)]) : List[A] = l flatMap {
    (e) => {
      List.make(e._1, e._2)
    }
  }
}

package lists


object P08 {
  def compress[A](l : List[A]) : List[A] = l.foldRight(List[A]()) {
    (current, result) =>
      if (result.isEmpty || result.head != current) current :: result
      else result
  }
}

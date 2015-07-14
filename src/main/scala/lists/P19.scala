package lists


object P19 {
  def rotate[A](n: Int, l: List[A]) : List[A] = {
    val adjustedN = if (l.isEmpty)  0 else n % l.length
    if (adjustedN < 0 ) rotate(adjustedN + l.length, l)
    else (l drop adjustedN) ::: (l take adjustedN)
  }
}

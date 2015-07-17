package lists

object P22 {
  def range(start: Int, end: Int) : List[Int] = {
    def rangeR(end: Int, result: List[Int]) : List[Int] = {
      if (end < start) result
      else rangeR(end - 1, end :: result)
    }

    rangeR(end, List[Int]())
  }
}

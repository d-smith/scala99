package lists

object P24 {
  import P23.randomSelect
  def lotto(n: Int, m: Int) : List[Int] = {
      randomSelect(n, List.range(1,m+1))
  }
}

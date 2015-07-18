package lists


object P23 {
  import util.Random
  import P20.removeAt
  def randomSelect[A](n: Int, l:List[A]) : List[A] = {
    def randomSelectR(n: Int, l:List[A], random: Random): List[A] = {
      if(n <= 0)  Nil
      else {
        val (rest,e) = removeAt(random.nextInt(l.length),l)
        e :: randomSelectR(n - 1, rest, random)
      }
    }
    randomSelectR(n,l, new Random)
  }
}

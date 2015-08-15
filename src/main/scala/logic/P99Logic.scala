package logic

object P99Logic {
  def and(a: Boolean, b: Boolean): Boolean = (a, b) match {
    case (true, true) => true
    case _ => false
  }


  def or(a: Boolean, b: Boolean): Boolean = (a, b) match {
    case (true, _) => true
    case (_, true) => true
    case _ => false
  }


  def not(a: Boolean): Boolean = a match {
    case true => false
    case false => true
  }

  def nand(a: Boolean, b: Boolean) = not(and(a,b))

  def nor(a:Boolean, b: Boolean) = not(or(a,b))

  def equ(a: Boolean, b: Boolean) = or(and(a,b), and(not(a), not(b)))

  def xor(a: Boolean, b: Boolean) = not(equ(a,b))

  def impl(a: Boolean, b: Boolean) = or(not(a),b)

  def table(f:(Boolean, Boolean) => Boolean) {
    printf("%-5s %-5s %-5s\n","A", "B", "Result")
    for {
      a <- List(false, true)
      b <- List(false, true)
    } {
      printf("%-5s %-5s %-5s\n", a, b, f(a,b))
    }
  }

  def gray(n: Int) : List[String] = {
    if (n == 0) List("")
    else {
      val lower = gray(n - 1)
      (lower map { "0" + _}) ::: (lower.reverse map {"1" + _})
    }
  }
}

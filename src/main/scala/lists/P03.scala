package lists

import java.util.NoSuchElementException


object P03 {
  def kthElement[A](n: Int, l: List[A]) : A = {
    (n, l) match {
      case (0, h :: _) => h
      case (n, _ :: tail) => kthElement(n - 1, tail)
      case (_, Nil) => throw new NoSuchElementException
    }
  }
}

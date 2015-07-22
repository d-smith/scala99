package lists

import org.scalatest.FunSuite

import scala.annotation.tailrec


object CombosUtil {
  def factorial(n: Int) : Int = {
    @tailrec def factorialWithAccumulator(n: Int, acc: Int) : Int = {
      n match {
        case 1 => acc
        case _ => factorialWithAccumulator(n - 1,n * acc)
      }
    }
    factorialWithAccumulator(n,1)
  }

  def combosNchooseK(n: Int, k: Int) : Int = {
    return factorial(n)/((factorial(k)*factorial(n - k)))
  }
}

class P26Test extends FunSuite {
  import P26.combinations
  import CombosUtil.{factorial,combosNchooseK}

  test("chose all combinations of k elements from a list of n elements") {
    val l = List(1,2,3,4,5)
    val combos = combinations(3,l)
    assert(combos.length === combosNchooseK(l.length,3))
    assert(combos.distinct === combos)
  }
}

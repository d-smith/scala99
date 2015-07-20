package lists

import org.scalatest.FunSuite

class P25Test extends FunSuite {
  import P25.randomPermute
  test("we can generate a random permutation of a list") {
    val l = List(1,2,3,4,5,6,7,8,9,10)
    val p = randomPermute(l)
    assert(p.length === l.length)
    p.foreach {
      e => assert(l.contains(e))
    }

    assert(p.distinct === p)
  }
}

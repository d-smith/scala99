package lists

import org.scalatest.FunSuite


class P24Test extends FunSuite {
  import P24.lotto
  test("we can draw random elements from a specified range") {
    val pool = List.range(1,60 + 1)
    val balls = lotto(6,60)
    assert(balls.length === 6)
    balls.foreach {
      b => assert(pool.contains(b))
    }
    assert(balls === balls.distinct)
  }
}

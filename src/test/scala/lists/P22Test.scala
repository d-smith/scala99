package lists

import org.scalatest.FunSuite


class P22Test extends FunSuite {
  import P22.range
  test("we can generate a list that contains a given range of integers") {
    assert(range(4,9) === List(4,5,6,7,8,9))
  }
}

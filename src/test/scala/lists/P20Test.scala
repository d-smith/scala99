package lists

import org.scalatest.FunSuite


class P20Test extends FunSuite {
  import P20.removeAt
  test("the nth element in a list can be extract") {
    val l = List(1,2,3,4,5,6,7,8)
    assert(removeAt(3,l) === (List(1,2,3,5,6,7,8),4))
  }
}

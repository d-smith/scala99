package lists

import org.scalatest.FunSuite


class P14Test extends FunSuite {
  import P14.duplicate
  test("each element in a list is duplicated") {
    val l = List('a, 'b, 'c, 'd)
    assert(duplicate(l) === List('a, 'a, 'b,'b,'c, 'c, 'd, 'd))
  }
}

package lists

import org.scalatest.FunSuite


class P10Test extends FunSuite {
  import P10.encode
  test("the content of a list can be run-length encoded") {
    val l = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    assert(encode(l) === List((4,'a),(1,'b),(2,'c), (2,'a), (1,'d), (4,'e)))
  }
}

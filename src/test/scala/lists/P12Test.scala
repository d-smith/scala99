package lists

import org.scalatest.FunSuite


class P12Test extends FunSuite {
  import P12.decode

  test("run length encoded lists can be decoded") {
    val l = List((4,'a),(1,'b),(2,'c), (2,'a), (1,'d), (4,'e))
    assert(decode(l) === List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  }

}

package lists

import org.scalatest.FunSuite


class P13Test extends FunSuite {

  import P13.encodeDirect

  test("consecutive values are packed into sublists") {
    val l = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    assert(encodeDirect(l) === List((4,'a),(1,'b),(2,'c), (2,'a), (1,'d), (4,'e)))
  }


}

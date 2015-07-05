package lists

import org.scalatest.FunSuite


class P10Test extends FunSuite {
  import P10.encode
  test("the content of a list can be run-length encoded") {
    val l = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    assert(encode(l) === List((4,'a),(1,'b),(2,'c), (2,'a), (1,'d), (4,'e)))
  }
}

class P11Test extends FunSuite {
  import P11.encodeModified

  test("single elements in run-length encoded lists are copied directly") {
    val l = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    assert(encodeModified(l) === List((4,'a),'b,(2,'c), (2,'a), 'd, (4,'e)))
  }
}

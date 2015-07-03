package lists

import org.scalatest.FunSuite


class P09Test extends FunSuite {
  import P09.pack

  test("consecutive values are packed into sublists") {
    val l = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    assert(pack(l) === List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
  }
}

package lists

import org.scalatest.FunSuite


class P08Test extends FunSuite {
  import P08.compress

  test("compress removes consecutive elements") {
    val l = List('a, 'b, 'b, 'c, 'c, 'c, 'd, 'd, 'd, 'd)
    assert(compress(l) === List('a, 'b, 'c, 'd))

    val l2 = List(1,2,3,4,1,2,3,4)
    assert(compress(l2) === l2)
  }
}

package lists

import org.scalatest.FunSuite


class P18Test extends FunSuite {
  import P18.slice
  test("slice extracts a portion of a list") {
    val l = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    assert(slice(3,7,l) === List('d, 'e, 'f, 'g))
  }
}

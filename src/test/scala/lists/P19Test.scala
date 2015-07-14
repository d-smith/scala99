package lists

import org.scalatest.FunSuite


class P19Test extends FunSuite {
  import P19.rotate
  test("lists can be rotated by a given number of places to the left") {
    val l = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    assert(rotate(3,l) === List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c))
  }

  test("rotating negative places to the left rotates to the right") {
    val l = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    assert(rotate(-2,l) === List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i))
  }

}

package lists

import org.scalatest.FunSuite


class P02Test extends FunSuite{
  import P02.nextToLast
  test("return the next to last element from a multielement list") {
    val l = List(1,2,3,4,5)
    assert(nextToLast(l) == 4)
  }

  test("return middle element in a three element list") {
    val l = List(1,2,3)
    assert(nextToLast(l) == 2)
  }

  test("throw an exception if there is no next to last element") {
    intercept[NoSuchElementException] {
      nextToLast(List(1))
    }
  }
}

package lists

import org.scalatest.FunSuite

class P07Test extends FunSuite {
  import P07.flatten
  test("A list with list and non list elements can be flattend into a single list") {
    val l = List(List(1, 1), 2, List(3, List(5, 8)))
    assert(flatten(l) === List(1,1,2,3,5,8))
  }

  test("a deeply nested list can be flattend to a single level") {
    val l = List(List(List(List(List(List(1))))))
    assert(flatten(l) === List(1))
  }
}

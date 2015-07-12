package lists

import org.scalatest.FunSuite


class P17Test extends FunSuite {
  import P17.split
  test("we can split a list at a given position") {
    val l = List(1,2,3,4,5,6,7)
    assert(split(3,l) === (List(1,2,3),List(4,5,6,7)))
  }

  test("splitting with out of bounds indices yields no split") {
    val l = List(1,2,3,4,5,6,7)
    assert(split(100,l) ===(l,List()))
    assert(split(-1,l) === (l,List()))
  }
}

package lists

import org.scalatest.FunSuite


class P15Test extends FunSuite {
  import P15.duplicateN
  test("duplicateN produce a list with each element duplicated N times") {
    val l = List(1,2,3)
    assert(duplicateN(3,l) === List(1,1,1,2,2,2,3,3,3))
  }
}

package lists

import org.scalatest.FunSuite


class P16Test extends FunSuite {
  import P16.drop
  test("we can drop every third element") {
    val l = List(1,2,3,4,5,6,7,8,9)
    assert(drop(3,l) === List(1,2,4,5,7,8))
  }

  test("we can drop every element") {
    val l = List(1,2,3)
    assert(drop(1,l) === List[Int]())
  }

  test("dropping on an empty list just returns an empty list") {
    val l = List[Int]()
    assert(drop(2,l) === List[Int]())
  }
}

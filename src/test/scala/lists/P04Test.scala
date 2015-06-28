package lists

import org.scalatest.FlatSpec


class P04Test extends FlatSpec {
  import P04.length
  "The length function" should "return the number of elements in a non empty list" in {
    val l = List(1,2,3,4,5,6)
    assert(length(l) == 6)
  }

  "The length function" should "return 0 for an empty list" in {
    val l = List[Int]()
    assert(length(l) == 0)
  }

  "The length function" should "return 0 for a Nil list" in {
    val l = Nil
    assert(length(l) == 0)
  }
}

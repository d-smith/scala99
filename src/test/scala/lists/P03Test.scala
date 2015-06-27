package lists

import org.scalatest.FlatSpec


class P03Test extends FlatSpec {
  import P03.kthElement
  "kthElement" should "extract the specified element with a list of sufficient length" in {
    val l = List(1,2,3,4,5,6,7,8,9)
    assert(kthElement(5, l) == 6)
    assert(kthElement(0,l) == 1)
    assert(kthElement(8,l) == 9)
  }

  "kthElement" should "throw a no such element exception for indices outside the list boundaries" in {
    val l = List(1)
    intercept[NoSuchElementException] {
      kthElement(1, l)
    }

    intercept[NoSuchElementException] {
      kthElement(-1, l)
    }
  }
}

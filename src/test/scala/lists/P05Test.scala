package lists

import org.scalatest.FlatSpec


class P05Test extends FlatSpec  {
  import P05.reverse
  "The reverse function given a list" should "produce a list with the elements in reverse order" in {
    val l = List(1,2,3,4,5)
    assert(reverse(l) == List(5,4,3,2,1))
  }
}

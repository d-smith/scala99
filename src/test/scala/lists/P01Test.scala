package lists

import org.scalatest.FunSuite
import P01._

class P01Test extends FunSuite {
  test("A list with several values produces the correct last value")  {
    val l = List(1,2,3,4,5)
    assert(last(l) == 5)
  }

  test("The last element of a single elements list is the list element") {
    val l = List(1)
    assert(last(l) == 1)
  }
}

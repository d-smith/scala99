package lists

import org.scalatest.FunSuite

class P23Test extends FunSuite {
  import P23.randomSelect
  test("a number of random elements can be removed from a list") {
    val l = List(1,2,3,4,5,6,7,8,9)
    val newList = randomSelect(3, l)
    assert(newList.length === 3)
    newList.foreach {
      e => assert(l.contains(e) == true)
    }
  }
}

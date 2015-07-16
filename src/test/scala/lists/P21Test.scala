package lists

import org.scalatest.FunSuite


class P21Test extends FunSuite
{
  import P21.insertAt

  test("an item can be inserted at a specific position in a list") {
    assert(insertAt('new, 1, List('a, 'b, 'c, 'd)) === List('a, 'new, 'b, 'c, 'd))
  }
}

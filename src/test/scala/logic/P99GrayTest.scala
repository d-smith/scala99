package logic

import org.scalatest.FunSuite


class P99GrayTest extends FunSuite {

  import P99Logic._

  def checkCodePairs(front: List[String], back: List[String]): Unit = {
    (front, back) match {
      case (h :: t, bh :: bt) =>
        assert("1" + h.splitAt(1)._2 === bh)
        checkCodePairs(t, bt)
      case (_,_) => ()
    }
  }

  test("gray code is a reflected code") {
    //Check some values say n=8 on down
    var n = 0
    for (n <- 1 to 8) {
      val codes = gray(n)
      val (front, back) = codes splitAt (codes.length / 2)
      checkCodePairs(front, back.reverse)
    }


  }
}

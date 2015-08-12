package logic

import org.scalatest.FunSuite


class P99LogicTest extends FunSuite {

  import P99Logic._

  val input = List(
    (false, false, false),
    (false, true, false),
    (true, false, false),
    (true, true, true)
  )

  input.foreach{i =>
    test(s"Test of and(${i._1}, ${i._2})") {
      assert(and(i._1, i._2) === i._3)
    }
  }
}

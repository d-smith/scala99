package logic

import org.scalatest.FunSuite


class P99LogicTest extends FunSuite {
  import P99Logic._
  
  val andTable = List(
    (false, false, false),
    (false, true, false),
    (true, false, false),
    (true, true, true)
  )

  val orTable = List(
    (false, false, false),
    (false, true, true),
    (true, false, true),
    (true, true, true)
  )


  val andFn: (Boolean, Boolean) => Boolean = and
  val orFn: (Boolean, Boolean) => Boolean = or

  val testData = List(
    ("and", andFn, andTable),
    ("or", orFn, orTable)
  )

  testData.foreach{ td =>
    val (testName, testFn, testTable) = td
    testTable.foreach{ tt =>
      val testcase = s"Test of $testName(${tt._1}, ${tt._2})"
      println(testcase)
      test(testcase) {
        assert(testFn(tt._1,tt._2) === tt._3)
      }
    }
  }
}

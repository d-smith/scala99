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

  val nandTable = List(
    (false, false, true),
    (false, true, true),
    (true, false, true),
    (true, true, false)
  )

  val norTable = List(
    (false, false, true),
    (false, true, false),
    (true, false, false),
    (true, true, false)
  )

  val equTable = List(
    (false, false, true),
    (false, true, false),
    (true, false, false),
    (true, true, true)
  )

  val xorTable = List(
    (false, false, false),
    (false, true, true),
    (true, false, true),
    (true, true, false)
  )

  val implTable = List(
    (false, false, true),
    (false, true, true),
    (true, false, false),
    (true, true, true)
  )


  val andFn: (Boolean, Boolean) => Boolean = and
  val orFn: (Boolean, Boolean) => Boolean = or
  val nandFn: (Boolean, Boolean) => Boolean = nand
  val norFn:(Boolean,Boolean) => Boolean = nor
  val equFn:(Boolean, Boolean) => Boolean = equ
  val xorFn:(Boolean,Boolean) => Boolean = xor
  val implFn:(Boolean,Boolean) => Boolean = impl

  val testData = List(
    ("and", andFn, andTable),
    ("or", orFn, orTable),
    ("nand", nandFn, nandTable),
    ("nor", norFn, norTable),
    ("equ",equFn, equTable),
    ("xor",xorFn, xorTable),
    ("impl", implFn, implTable)
  )

  testData.foreach { td =>
    val (testName, testFn, testTable) = td
    testTable.foreach { tt =>
      val testcase = s"Test of $testName(${tt._1}, ${tt._2})"
      test(testcase) {
        assert(testFn(tt._1, tt._2) === tt._3)
      }
    }
  }
}

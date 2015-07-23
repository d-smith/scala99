package arithmetic

import org.scalatest.FunSuite


class P99IntTest extends FunSuite {
  import P99Int._
  test("we can call methods on P99Int using normal ints") {
    assert(7.foo === "foo")
  }

  test("five, seven, and thirteen are prime") {
    assert(5.isPrime === true)
    assert(7.isPrime === true)
    assert(13.isPrime === true)
  }

  test("nine, twenty-seven, and forty-nine are not prime") {
    assert(9.isPrime === false)
    assert(27.isPrime === false)
    assert(49.isPrime === false)
  }
}

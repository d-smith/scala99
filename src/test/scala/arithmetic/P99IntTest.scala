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

  test("gcd of 36 and 63") {
    assert(gcd(36,63) === 9)
  }

  test("coprimes") {
    assert(35.isCoprimeTo(64))
    assert(!2.isCoprimeTo(4))
  }

  test("Euler's totient function of 10 count 4 coprimes") {
    assert(4 === 10.totient)
  }

  test("The prime factors of 315 are 3,3,5,7") {
    assert(315.primeFactors() === List(3,3,5,7))
  }
}

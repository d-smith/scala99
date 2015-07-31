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

  test("Euler's totient function for 10 counts 4 coprimes") {
    assert(4 === 10.totient)
  }

  test("The prime factors of 315 are 3,3,5,7") {
    assert(315.primeFactors() === List(3,3,5,7))
  }

  test("We can calculate the multiplicity of a number's prime factors") {
    assert(315.primeFactorsMultiplicity() === List((3,2),(5,1),(7,1)))
  }

  test("The improved totient function for 10 counts 4 coprimes") {
    assert(4 === 10.totientImproved)
  }

  test("execute totient benchmarks") {
    TotientTimer.timeTotient(10090)
  }
}

package arithmetic


class P99Int(n: Int) {
  import P99Int._

  //Used to bootstrap the class/object for testing implicit conversion. TODO - remove method and test
  def foo(): String = "foo"

  def isPrime: Boolean =
    (n > 1) && (primes takeWhile { _ <= Math.sqrt(n) } forall { n % _ != 0 })

  def isCoprimeTo(x: Int) : Boolean = gcd(n,x) == 1

  def totient() : Int = (1 to 10) filter { isCoprimeTo _} length

  def primeFactors() : List[Int] = {
    def primeFactorsR(i: Int, primeStream: Stream[Int]) : List[Int] = {
      if (i.isPrime)  List(i)
      else if(i % primeStream.head == 0) primeStream.head :: primeFactorsR(i / primeStream.head, primeStream)
      else primeFactorsR(i, primeStream.tail)

    }
    primeFactorsR(n, primes)
  }
}

object P99Int {
  implicit def intToP99Int(i: Int) = new P99Int(i)

  val primes = Stream.cons(2, Stream.from(3,2) filter { _.isPrime })

  def gcd(m: Int, n: Int) : Int =
    if(n == 0) m else gcd(n, m % n)
}

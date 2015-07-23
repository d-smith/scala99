package arithmetic


class P99Int(n: Int) {
  import P99Int._

  //Used to bootstrap the class/object for testing implicit conversion. TODO - remove method and test
  def foo(): String = "foo"

  def isPrime: Boolean =
    (n > 1) && (primes takeWhile { _ <= Math.sqrt(n) } forall { n % _ != 0 })


}

object P99Int {
  implicit def intToP99Int(i: Int) = new P99Int(i)

  val primes = Stream.cons(2, Stream.from(3,2) filter { _.isPrime })
}

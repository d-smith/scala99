package lists

import org.scalatest.FlatSpec


class P06Test extends FlatSpec {
  import P06.isPalindrome

  "The isPalindrome function" should "return true when the list is a palindrome" in {
    val l = List(1,2,3,4,5,4,3,2,1)
    assert(isPalindrome(l) == true)
  }

  "The isPalindrome function" should "return false when the list is not a palindrome" in {
    val l = List(1,2,3,4,5)
    assert(isPalindrome(l) == false)
  }
}

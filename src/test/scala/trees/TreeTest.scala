package trees

import org.scalatest.FunSuite


class TreeTest extends FunSuite {


  test("cBalanced generates balanced trees") {
    for (n <- 1 to 8) {
      val trees = Tree.cBalanced(n, "x")
      println(trees)
      //TODO - write and invoke a func to check the trees are actuall balanced
      assert(trees.distinct === trees)
    }
  }
}

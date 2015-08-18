package trees

import org.scalatest.FunSuite


class TreeTest extends FunSuite {

  def countLeft[T](t: Tree[T]) : Int = t match {
    case End => 0
    case Node(_,l,_) => 1 + countLeft(l)
   }

  def countRight[T](t: Tree[T]) : Int = t match {
    case End => 0
    case Node(_,_,r) => 1 + countLeft(r)
  }

  test("cBalanced generates balanced trees") {
    for (n <- 1 to 8) {
      val trees = Tree.cBalanced(n, "x")
      trees foreach { t =>
        assert(Math.abs(countRight(t) - countLeft(t)) <= 1)
      }
      assert(trees.distinct === trees)
    }
  }

  test("we can assess if a tree is symmetric or not") {
    assert(Node('a', Node('b'), Node('c')).isSymmetric === true)


    val b = Node('b',End,Node('d'))
    val f = Node('f',Node('h'),Node('i'))
    val c = Node('c', Node('e',Node('g'),End),f)
    val a = Node('a', b,c)

    assert(a.isSymmetric === false)
  }
}

package trees

sealed abstract class Tree[+T] {
  def isMirrorOf[V](tree: Tree[V]) : Boolean
  def isSymmetric: Boolean
}

case class Node[+T](value: T, left: Tree[T], right: Tree[T]) extends Tree[T] {
  override def toString = "T(" + value.toString + " " + left.toString + " " + right.toString + ")"
  def isMirrorOf[V](tree: Tree[V]) : Boolean = tree match {
    case t: Node[V] => left.isMirrorOf(t.right) && right.isMirrorOf(t.left)
    case _ => false
  }
  def isSymmetric: Boolean = left.isMirrorOf(right)
}

case object End extends Tree[Nothing] {
  override def toString = "."
  def isMirrorOf[V](tree: Tree[V]) : Boolean = tree == End
  def isSymmetric: Boolean = true
}

object Node {
  def apply[T](value: T): Node[T] = Node(value, End, End)
}

object Tree {
  def cBalanced[T](nodes: Int, value: T): List[Tree[T]] = nodes match {
    case n if n < 1 => List(End)
    case n if n % 2 == 1 =>
      val subtrees = cBalanced(n / 2, value)
      subtrees.flatMap(l => subtrees.map(r => Node(value,l,r)))
    case n if n % 2 == 0 =>
      val t1 = cBalanced((n - 1) / 2, value)
      val t2 = cBalanced((n - 1) / 2 + 1, value)
      t1.flatMap(l => t2.flatMap(t => List(Node(value,l,t),Node(value,t,l))))
  }

}

package lists


object P07 {
  def flatten(l: List[Any]) : List[Any] = l flatMap {
    case listElement: List[_] => flatten(listElement)
    case element => List(element)
  }
}

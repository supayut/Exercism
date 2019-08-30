object FlattenArray {
  def flatten(list: List[Any]): List[Int] = {
    list.flatMap(x => {
      x match {
        case i: Int => List(i)
        case l: List[Any] => flatten(l)
        case _ => List()
      }
    })
  }
}
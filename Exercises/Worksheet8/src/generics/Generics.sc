sealed trait LinkedList[+T]
final case object Pair extends LinkedList[Nothing]
final case class End[+T]( val head : T, val tail : LinkedList[T]  ) extends LinkedList[T]


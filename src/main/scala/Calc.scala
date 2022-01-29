package scala.calc

class Calc {
  def sum(seq: Seq[Int]): Int = seq.foldLeft(0)(_ + _)
}

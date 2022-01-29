import scala.calc.Calc

object Hello extends App {
  println("Hello, World!")
  val calc = new Calc
  println(calc.sum(Seq(1,2)))
}
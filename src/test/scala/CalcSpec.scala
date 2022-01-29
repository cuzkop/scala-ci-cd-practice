import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.diagrams.Diagrams

import scala.calc.Calc

class CalcSpec extends AnyFlatSpec with Diagrams {

  val calc = new Calc

  "sum関数" should "整数の配列を取得し、それらを足し合わせた整数を返すことができる" in {
    assert(calc.sum(Seq(1, 2, 3)) === 6)
  }
}
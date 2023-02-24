package suprnation

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers
import suprnation.MinTrianglePath._

class MinTrianglePathTest extends AnyFunSuite with Matchers {

  private val triangle: Triangle = Vector(
    Vector(7),
    Vector(6, 3),
    Vector(3, 8, 5),
    Vector(11, 2, 10, 9)
  )

  private val invalidTriangleData: List[String] = List("1", "1 2", "1 2 hi")

  test("The algorithm should return expected result") {
    val path = findMinTrianglePath(triangle)
    val expectedResult = Some(Path(18, List(7, 6, 3, 2)))

    path.shouldBe(expectedResult)
  }

  test("Test with empty Triangle") {
    val path = findMinTrianglePath(Vector())
    path.shouldBe(None)
  }

  test("parsing invalid triangle data") {
    val res = buildTriangle(invalidTriangleData)
    res.isFailure.shouldBe(true)
  }

  test("path printout") {
    val path = findMinTrianglePath(triangle)
    val expectedResult = "Minimal path is: 7 + 6 + 3 + 2 = 18"

    path.get.prettyText().shouldBe(expectedResult)
  }

}

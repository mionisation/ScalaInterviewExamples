// from: https://github.com/cjdev/interview-preparation/blob/master/coderpad-testing.md
import org.scalatest.{FunSuite, Matchers}

class Testable extends FunSuite with Matchers {
  test("check boolean") {
    assert(true, "boolean value is true");
  }

  test("compare numbers") {
    assert(2 === 2);
  }

  test("compare strings") {
    assert("abc" === "abc");
  }

  test("compare lists") {
    assert(Seq(1,2,3) === Seq(1,2,3));
  }
}

object Solution extends App {
  new Testable().execute()
}

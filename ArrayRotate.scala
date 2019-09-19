/*
 Given: Array: arr, int: steps
 Expected: Rotate arr steps amounts to the right
 https://github.com/codingforinterviews/practice-problems/tree/master/array_rotate
*/

import org.scalatest.{FunSuite, Matchers}

class Testable extends FunSuite with Matchers {

    def rotate_inplace[T](arr:List[T], steps: Int) = {
        arr.slice(arr.length - steps, arr.length) ++ arr.slice(0, arr.length - steps)
    }

  test("compare lists") {
    val array = List[Int](1, 2, 3)
    val result = rotate_inplace[Int](array, 2)
    val expected = List[Int](2, 3, 1)
    assert(result === expected);
  }    
}

object ArrayRotate extends App {
  new Testable().execute()
}

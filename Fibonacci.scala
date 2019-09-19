// Given input n, print the n-th element of the Fibonacci Sequence
object Solution extends App {
  private def fibonacciRec(a: Int, b: Int, n: Int): Int = {
    if(n < 0) {
      a
    } else {
      fibonacci(b, a+b, n-1)
    }  
  }
  private def fibonacci(n: Int) {
    n match {
      case 0:
        0
      case 1:
        1
      case _:
  }
  
  val res = fibonacci(0, 1, 3)
  print(res)
}


object session {
  1 + 3

  def sqrt(x: Double) = {
    def abs(x: Double) = if (x < 0) -x else x


    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double) =
      (guess + x / guess) / 2

    sqrtIter(1)
  }

  sqrt(2)
  sqrt(4)
  sqrt(0.001)
  sqrt(0.1e-6)
  sqrt(1e20)
  sqrt(1e50)
}
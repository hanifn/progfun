package week4

object exprs extends App {
  def show(e: Expr): String = e match {
    case Number(x) => x.toString
    case Sum(l, r) => show(l) + " + " + show(r)
  }

  def main = {
    println(show(Sum(Number(1), Number(2))))
  }
}

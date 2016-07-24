package week4

/**
  * Created by hanifnorman on 24/7/16.
  */
trait Expr {

}

case class Number(n: Int) extends Expr
case class Sum(e1: Expr, e2: Expr) extends Expr

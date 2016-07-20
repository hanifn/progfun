package week4

/**
  * Created by 2359hanif on 18/7/16.
  */
trait List[T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false
}

class Nil[T] extends List[T] {
  def isEmpty = true
  def head = throw new NoSuchElementException("Nil.head")
  def tail = throw new NoSuchElementException("Nil.tail")
}

object List {
  def apply[T]: List[T] = new Nil
  def apply[T](a: T): List[T] = new Cons(a, new Nil)
  def apply[T](a: T, b: T): List[T] = new Cons(a, new Cons(b, new Nil))
  def apply[T](a: T, b: T, c: T): List[T] = new Cons(a, new Cons(b, new Cons(c, new Nil)))
}

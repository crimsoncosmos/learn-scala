package scala.lang.java

/**
  *
  *
  * @author <a href="mailto:dan.andrei.carp@gmail.com">Dan Andrei Carp</a>
  */
class Reference[T] {
  private var contents: T = _

  def set(value: T) {
    contents = value
  }

  def get: T = contents
}

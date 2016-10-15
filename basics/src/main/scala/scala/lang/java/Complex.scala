package scala.lang.java

/**
  *
  *
  * @author <a href="mailto:dan.andrei.carp@gmail.com">Dan Andrei Carp</a>
  */
class Complex(real: Double, imaginary: Double) {
  def re() = real

  def im() = imaginary

  override def toString() = "" + re + (if (im < 0) "" else "+") + im + "i"
}

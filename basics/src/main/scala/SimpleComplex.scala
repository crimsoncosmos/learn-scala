/**
  *
  *
  * @author <a href="mailto:dan.andrei.carp@gmail.com">Dan Andrei Carp</a>
  */
class SimpleComplex(real: Double, imaginary: Double) {
  def re = real

  def im = imaginary

  override def toString = "" + re + (if (im < 0) "" else "+") + im + "i"
}

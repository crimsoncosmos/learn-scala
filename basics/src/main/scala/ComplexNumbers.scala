/**
  *
  *
  * @author <a href="mailto:dan.andrei.carp@gmail.com">Dan Andrei Carp</a>
  */
object ComplexNumbers {
  def main(args: Array[String]): Unit = {
    val c = new Complex(1.2, 3.4)
    println("imaginary part: ", c.im())

    val cs = new SimpleComplex(1.2, -3.4)
    println("imaginary part: ", cs.im)

    println(c)
    println(cs)
  }
}

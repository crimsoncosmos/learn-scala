package scala.lang.java

/**
  *
  *
  * @author <a href="mailto:dan.andrei.carp@gmail.com">Dan Andrei Carp</a>
  */
trait Ord {
  def <(that: Any): Boolean

  def <=(that: Any): Boolean = (this < that) || (this == that)

  def >(that: Any): Boolean = !(this <= that)

  def >=(that: Any): Boolean = !(this < that)

}

class MyDate(y: Int, m: Int, d: Int) extends Ord {
  def year = y

  def month = m

  def day = d

  override def toString = year + "-" + month + "-" + day

  override def equals(that: Any): Boolean =
    that.isInstanceOf[MyDate] && {
      val o = that.asInstanceOf[MyDate]
      o.day == day && o.month == month && o.year == year
    }

  override def <(that: Any): Boolean = {
    if (!that.isInstanceOf[MyDate])
      sys.error("cannot compare " + that + " and a Date")

    val o = that.asInstanceOf[MyDate]
    (year < o.year) ||
      (year == o.year && (month < o.month ||
        (month == o.month && day < o.day)))
  }
}
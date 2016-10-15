package scala.lang.java

import java.text.DateFormat._
import java.util.{Date, Locale}
/**
  *
  *
  * @author <a href="mailto:dan.andrei.carp@gmail.com">Dan Andrei Carp</a>
  */
object FrenchDate {
  def main(args: Array[String]): Unit = {
    val now = new Date
    val dateFormat = getDateInstance(LONG, Locale.FRANCE)
    println(dateFormat format now)
  }
}

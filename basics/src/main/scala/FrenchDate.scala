import java.util.{Date, Locale}
import java.text.DateFormat._
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

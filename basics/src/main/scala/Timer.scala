/**
  *
  *
  * @author <a href="mailto:dan.andrei.carp@gmail.com">Dan Andrei Carp</a>
  */
object Timer {
  def oncePerSecond(callback: () => Unit): Unit = {
    while (true) {
      callback(); Thread sleep 1000
    }
  }

  def timeFlies(): Unit = {
    println("time flies like an arrow...")
  }

  def main(args: Array[String]): Unit = {
    oncePerSecond(timeFlies)
  }
}

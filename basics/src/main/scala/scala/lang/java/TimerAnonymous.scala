package scala.lang.java

/**
  *
  *
  * @author <a href="mailto:dan.andrei.carp@gmail.com">Dan Andrei Carp</a>
  */
object TimerAnonymous {
  def oncePerSecond(callback: () => Unit): Unit = {
    while (true) {
      callback(); Thread sleep 1000
    }
  }

  def main(args: Array[String]): Unit = {
    oncePerSecond(() => println("time flies like an arrow..."))
  }
}

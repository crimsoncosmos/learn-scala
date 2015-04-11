val breakException = new RuntimeException("break exception")
def breakable(op: => Unit) {
  try {
    op
  } catch { case _:Exception => }
}
def break = throw breakException
def install() = {
  val env = System.getenv("SCALA_HOME")
  if(env == null) break
  println("found scala home lets do the real work")
}

breakable {
  val env = System.getenv("SCALA_HOME")
  if(env == null) break
  println("found scala home lets do the real work")
} // equivalent to breakable(install)

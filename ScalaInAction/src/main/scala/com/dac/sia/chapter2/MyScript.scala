package com.dac.sia.chapter2

/**
 *
 *
 * @author <a href="mailto:dan.andrei.carp@gmail.com">Dan Andrei Carp</a>
 */
class MyScript(host: String) {
  require(host != null, "Have to provide host name")
  if (host == "127.0.0.1") println("host = localhost")
  else println("host = " + host)
}

package com.dac.sia.chapter2

import com.mongodb.Mongo

/**
 *
 *
 * @author <a href="mailto:dan.andrei.carp@gmail.com">Dan Andrei Carp</a>
 */
class MongoClientV2(val host:String, val port: Int) extends Mongo(host, port) {
  require(host != null, "You have to provide a host name")
  def this() = this("127.0.0.1", 27017)
}

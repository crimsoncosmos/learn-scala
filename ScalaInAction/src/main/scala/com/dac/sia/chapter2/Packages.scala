/**
 * Package-scoping approach. In Scala you can have multiple packages defined in a single file.
 *
 * @author <a href="mailto:dan.andrei.carp@gmail.com">Dan Andrei Carp</a>
 */
package com.dac.sia.chapter2.persistence {
  package mongo {
    class MongoClient
  }
  package riak {
    class RiakClient
  }
  package hadoop {
    class HadoopClient
  }
}

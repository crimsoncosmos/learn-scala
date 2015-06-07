package com.dac.sia.chapter2

// remapping class to avoid name clash
import com.mongodb.{DB => MongoDB}

import scala.collection.convert.Wrappers._
/**
 *
 *
 * @author <a href="mailto:dan.andrei.carp@gmail.com">Dan Andrei Carp</a>
 */
// private constructor so that only the companion object can use it
class DB private(val underlying: MongoDB) {
  private def collection(name: String) = underlying getCollection(name)

  def readOnlyCollection(name: String) = new DBCollection(collection(name)) with Memoizer
  def administrableCollection(name: String) = new DBCollection(collection(name)) with Administrable with Memoizer
  def updateableCollection(name: String) = new DBCollection(collection(name)) with Updateable with Memoizer
  def collectionNames = for(name <- new JSetWrapper(underlying.getCollectionNames)) yield name
}

object DB {
  def apply(underlying: MongoDB) = new DB(underlying)
}
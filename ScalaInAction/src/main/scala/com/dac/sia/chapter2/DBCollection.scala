package com.dac.sia.chapter2

import com.mongodb.{DBCollection => MongoDBCollection, DBObject}
/**
 *
 *
 * @author <a href="mailto:dan.andrei.carp@gmail.com">Dan Andrei Carp</a>
 */
// override mandatory when overriding members of a super class
class DBCollection(override val underlying: MongoDBCollection) extends ReadOnly

trait ReadOnly {
  // this is an abstract field that needs to be inherited by subclasses
  // val is evaluated when an object is created
  val underlying: MongoDBCollection

  // def is evaluated every time a method is called
  def name = underlying getName
  def fullName = underlying getFullName
  def find(doc: DBObject) = underlying find doc
  def findOne(doc: DBObject) = underlying findOne doc
  def findOne = underlying findOne
  def getCount(doc: DBObject) = underlying getCount doc
}

trait Administrable extends ReadOnly {
  def drop(): Unit = underlying drop()
  def dropIndexes(): Unit = underlying dropIndexes()
}

trait Updateable extends ReadOnly {
  def -= (doc: DBObject): Unit = underlying remove doc
  def += (doc: DBObject): Unit = underlying save doc
}

trait Memoizer extends ReadOnly {
  val history = scala.collection.mutable.Map[Int, DBObject] ()
  override def findOne = {
    history.getOrElseUpdate(-1, {super.findOne})
  }
  override def findOne(doc: DBObject) = {
    history.getOrElseUpdate(doc.hashCode(), {super.findOne(doc)})
  }
}

trait LocaleAware extends ReadOnly {
  override def findOne(doc: DBObject) = {
    doc.put("locale", java.util.Locale.getDefault.getLanguage)
    super.findOne(doc)
  }
  override def find(doc: DBObject) = {
    doc.put("locale", java.util.Locale.getDefault.getLanguage)
    super.find(doc)
  }
}

sealed trait QueryOption

case object NoOption extends QueryOption
case class Sort(sorting: DBObject, anotherOption: QueryOption) extends QueryOption
case class Skip(number: Int, anotherOption: QueryOption) extends QueryOption
case class Limit(limit: Int, anotherOption: QueryOption) extends QueryOption
package com.dac.sia.chapter2

import com.mongodb.BasicDBObject

/**
 * Object used for testing the MongoDB client.
 *
 * @author <a href="mailto:dan.andrei.carp@gmail.com">Dan Andrei Carp</a>
 */
object QuickTour {
  def testClient = {
    def client = new MongoClient
    def db = client.db("mydb")
    for (name <- db.collectionNames) println(name)

    val col = db.readOnlyCollection("test")
    println(col.name)

    val adminCol = db.administrableCollection("test")
    adminCol.drop

    val updateableCol = db.updateableCollection("test")

    val doc = new BasicDBObject
    doc.put("name", "MongoDB")
    doc.put("type", "database")
    doc.put("count", 1)

    val info = new BasicDBObject
    info.put("x", 203)
    info.put("y", 102)
    doc.put("info", info)
    updateableCol += doc

    println(updateableCol.findOne)

    updateableCol -= doc
    println(updateableCol.findOne)

    for (i <- 1 to 100) updateableCol += new BasicDBObject("i", i)

    val query = new BasicDBObject
    query.put("i", 71)
    val cursor = col.find(query)
    while (cursor.hasNext) {
      println(cursor.next())
    }
  }
}
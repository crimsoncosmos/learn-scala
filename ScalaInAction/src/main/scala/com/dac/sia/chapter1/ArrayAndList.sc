val array = new Array[String](3)
array(0) = "This"
array(1) = "is"
array(2) = "mutable"
array

array.foreach(println)

val myList = List("This", "is", "immutable")
myList

val oldList = List(1,2)
val newList = 3 :: oldList
oldList
val newerList = oldList :+ 3

val myOtherList = "This" :: "is" :: "immutable" :: Nil

newList.filterNot(_ == 3)
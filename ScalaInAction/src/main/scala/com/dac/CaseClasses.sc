// parameters are automatically prefixed with val
// they can be prefixed with var explicitly to allow setters too
case class Person(firstName: String, lastName: String)

val me = Person("Dan Andrei", "Carp")
val myself = Person ("Dan Andrei", "Carp")

me.equals(myself)

me.hashCode()
myself.hashCode()

me.toString

val I = me.copy("firstName")
me
I
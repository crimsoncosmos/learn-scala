val constant = 87
var variable = 42
variable = 87

var a = 1
lazy val b = a + 1
a = 5
b // will evaluate to 6 in REPL

// var willKnowLater:String = _ // works in REPL
// val willKnowLater:String = _ // throws unbound placeholder parameter in REPL

val first :: rest = List(1,2,3)

def myFirstMethod():String = { "exciting times ahead" }
myFirstMethod()

def mySecond() {"something"} // without '=' the type isn't inferred
mySecond()

myFirstMethod // can also be called without '()' but not recommended
              // by convention, use '()' for functions that have side effects, even if they don't take any parameters

def max(a: Int, b: Int) = if(a > b) a else b
max(5, 4)
max(5, 7)

def toList[A](value:A) = List(value)
toList(1)
toList("Scala rocks")

// by convention, scala parametrized types start at 'A' and go through to 'Z'

val evenNumbers = List(2, 4, 6, 8, 10)
evenNumbers.foldLeft(0) {(a: Int, b: Int) => a + b}
// 0 is the initial value. 'Int' is optional for the parameters in this case

evenNumbers.foldLeft(0)(_ + _) // here '(' works as well as '{'

// def breakable(op: => Unit) { ... }
// op is the parameter name. no '()' means that it doesn't take a parameter. The return type is 'Unit'.

// def foldLeft(initialValue: Int, operator: (Int, Int) => Int)= { ... }
// operator is a function that takes 2 Int parameters and returns an Int

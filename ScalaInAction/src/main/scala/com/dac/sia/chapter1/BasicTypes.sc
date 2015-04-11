val byte:Byte = 127
val short:Short = 32767
val int:Int = Int.MaxValue
val long:Long = Long.MaxValue

val float:Float = 1.0f
val double:Double = 2.0
val simpleDouble:Double = 1
// 1. toString (space required for methods starting with a letter)
val hexa = 0x23

val capB = '\102'
val newLine = '\n'
// val \u0061\u006e\u0073 = 42 // this works in the REPL
val ? = scala.math.Pi

val bookName = "Scala in \"Action\""
val multiLine = """This is a
    multi line
    string"""
val multiLineStripped = multiLine.stripMargin

val name = "Nilanjan"
s"My name $name"

val height = 1.9d
f"$name%s is $height%2.2f meters tall"

val book = <book>
  <title>Scala in Action</title>
  <author>Nilanjan Raychaudhuri</author>
</book>

val message = "I didn't know xml could be so much fun"
val code = "1"
val alert = <alert>
  <message priority={code}>{message}</message>
  <date>{new java.util.Date()}</date>
</alert>

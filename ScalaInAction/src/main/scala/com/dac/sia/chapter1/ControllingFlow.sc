val test = true
val someValue = if (test) 1 else 0

var i = 0
while (i < 5) { println(i); i = i + 1}
do {println(i); i = i + 1} while (i < 10)
val directory = "./workspace/learn-scala/ScalaInAction/src/main/scala/com/dac/sia/chapter1"
var files = new java.io.File(directory).listFiles
for (file <- files) {
  val filename = file.getName
  if (filename.endsWith(".sc")) println(file)
}
for (
  file <- files;
  filename = file.getName
  if filename.endsWith(".sc")
) println(file) // equivalent to the above

val aList = List(1,2,3)
val bList = List(4,5,6)
for {a <- aList; b <- bList} println(a + b)

// by convention use '{' when there is more than one generator and guard clause

val result = for {a <- aList; b <- bList} yield a + b
for (r <- result) println(r)

val xmlNode = <result>{result.mkString(",")}</result>

for {a <- aList; b <- bList} yield {println(a + b)}
// import all packages under mongodb

import com.mongodb._

// import inside a scope
val randomValue = {import scala.util.Random
  new Random().nextInt()
}

// import all the members of the System class
import java.lang.System._
nanoTime

// layered imports
import java.lang._
import System._
nanoTime

// map an import to another name to prevent confusion
import java.util.Date
import java.sql.{ Date => SqlDate }
import com.dac.sia.chapter2.RichConsole._

val now = new Date
p(now)
val sqlDate = new SqlDate(now.getTime)
p(sqlDate)

// hide a class
import java.sql.{ Date => _ }
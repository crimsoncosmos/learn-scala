List(1,2,3,4) match {
  case f :: s :: rest => List(f, s)
  case _ => Nil
}

def rangeMatcher(num:Int) = num match {
  case within10 if within10 <= 10 => println("with in 0 to 10")
  case within100 if within100 <= 100 => println("with in 11 to 100")
  case beyond100 if beyond100 < Integer.MAX_VALUE => println("beyond 100")
}

def rangeMatcherEx(num: Int) = num match {
  case within10 if within10 <= 10 => println("within 0 to 10")
  case within100 if within100 <= 100 => println("within 11 to 100")
  case _ => throw new IllegalArgumentException("Only values between 0 and 100 are allowed")
}

try {
  rangeMatcherEx(101)
} catch {
  case e: IllegalArgumentException => e.getMessage
}

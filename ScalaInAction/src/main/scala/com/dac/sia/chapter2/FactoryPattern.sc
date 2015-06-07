abstract class Role { def canAccess(page: String): Boolean }

class Root extends Role {
  override def canAccess(page: String) = true
}

class SuperAnalyst extends Role {
  override def canAccess(page: String) = page != "Admin"
}

class Analyst extends Role {
  override def canAccess(page: String): Boolean = false
}

object Role {
  def apply(roleName: String) = roleName match {
    case "root" => new Root
    case "superAnalyst" => new SuperAnalyst
    case "analyst" => new Analyst
  }
}

val root = Role("root")
val analyst = Role("analyst")
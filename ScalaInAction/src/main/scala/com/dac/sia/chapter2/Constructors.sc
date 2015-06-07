// var here generates both getters and setters
class AddressBean (var address1: String,  var address2: String,
                   var city: String, var zipCode: Int)

var localAddress = new AddressBean("230 43rd street", "", "Columbus", 43233)
localAddress.city
localAddress.city = "Memphis"
localAddress.city

// val here generates getters
class MongoClientA(val host:String, val port: Int) {
  def this() = this("127.0.0.1", 27017)
}
val clientA = new MongoClientA()
clientA.port
clientA.host
// reassignment to val
//clientA.port = 1234

// equivalent to
class MongoClientB(private val _host: String, private val _port: Int) {
 def host = _host
 def port = _port
}
val clientB = new MongoClientB("127.0.0.1", 27017)
clientB.port
clientB.host
// reassignment to val
//clientB.port = 1234

class NoAccessors(host: String, port: Int)
val noAccessors = new NoAccessors("host", 1234)
// cannot resolve symbol 'host'
// noAccessors.host

class AddSetter(var firstName: String, var lastName: String, private var _age: Int) {
  def age = _age
  def age_= (newAge: Int) = _age = newAge
}

import demo.person.{Team, Role, Person}
import org.apache.thrift.protocol.TCompactProtocol
import org.apache.thrift.transport.TMemoryBuffer

object Main extends App {

  println("Hi")

  val berty = Person(name = "Roberto Tyley", role = Some(Role.Engineer))
  val grant = Person(name = "Grant Klopper", role = Some(Role.Overhead))

  val theAteam = Team(name = "The Dream Team", members = Some(Seq(berty, grant)))
  println(berty)
  println(grant)

  val buf = new TMemoryBuffer(50)
  val proto = new TCompactProtocol(buf)

  theAteam.write(proto)

  println(buf.inspect())

  val whoIsThis = Team.decode(proto)

  println(whoIsThis)

}
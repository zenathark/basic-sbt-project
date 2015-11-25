import org.scalatest._
import java.io.ByteArrayOutputStream

class MainSpec extends FlatSpec with Matchers {
  it should "print hello world" in {
    val stream = new java.io.ByteArrayOutputStream()
    Console.withOut(stream) {
      Main.main(Array(""))
    }
    assert(stream.toString().equalsIgnoreCase("Hello World!\n"))
  }
}

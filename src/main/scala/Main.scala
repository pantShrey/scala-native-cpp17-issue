import scala.scalanative.unsafe._

@extern
object Native {
  def callUseStructuredBinding(): Unit = extern
}

object Main {
  def main(args: Array[String]): Unit = {
    println("Calling structured binding example...")
    Native.callUseStructuredBinding()
  }
}


import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Main extends App {
  Foo("Hello, Foo")
  Bar.bar("Hello, Bar")
}

/// facade

@js.native
@JSImport("foo.js", JSImport.Default)
object Foo extends js.Object {
  def apply(obj: js.Any): Unit = js.native
}

@js.native
@JSImport("bar.js", JSImport.Namespace)
object Bar extends js.Object {
  def bar(obj: js.Any): Unit = js.native
}

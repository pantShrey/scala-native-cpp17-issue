scalaVersion := "3.3.3" // A Long Term Support version.

enablePlugins(ScalaNativePlugin)

// set to Debug for compilation details (Info is default)
logLevel := Level.Info

// import to add Scala Native options
import scala.scalanative.build._

/*
nativeConfig ~= { c =>
  c.withCompileOptions(c.compileOptions ++ Seq("-std=c++17"))   // this causes "[error] error: invalid argument '-std=c++17' not allowed with 'C'"
}
*/
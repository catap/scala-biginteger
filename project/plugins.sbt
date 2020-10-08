addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject"      % "1.0.0")
addSbtPlugin("org.portable-scala" % "sbt-scala-native-crossproject" % "1.0.0")

val scalaJSVersion =
  Option(System.getenv("SCALAJS_VERSION")).getOrElse("1.2.0")
val scalaNativeJSVersion =
  Option(System.getenv("SCALANATIVE_VERSION")).getOrElse("0.4.0-M2")

addSbtPlugin("org.scala-js"       % "sbt-scalajs"                   % scalaJSVersion)
addSbtPlugin("org.scala-native"   % "sbt-scala-native"              % scalaNativeJSVersion)
addSbtPlugin("ch.epfl.lamp"       % "sbt-dotty"                     % "0.4.2")

addSbtPlugin("pl.project13.scala" % "sbt-jmh"                       % "0.3.7")
addSbtPlugin("com.eed3si9n"       % "sbt-assembly"                  % "0.14.10")
addSbtPlugin("com.typesafe.sbt"   % "sbt-native-packager"           % "1.7.3")
addSbtPlugin("com.eed3si9n"       % "sbt-buildinfo"                 % "0.9.0")
addSbtPlugin("com.jsuereth"       % "sbt-pgp"                       % "2.0.1")
addSbtPlugin("org.xerial.sbt"     % "sbt-sonatype"                  % "3.8.1")

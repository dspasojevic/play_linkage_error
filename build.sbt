lazy val root = project
  .copy(id = "linkageerrortest")
  .in(file("."))
  .enablePlugins(PlayScala)

scalaVersion := "2.11.8"

name := "linkageerrortest"

libraryDependencies ++= Vector(
  "org.aspectj" % "aspectjweaver" % "1.8.9"
)

fork := true
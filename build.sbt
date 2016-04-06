lazy val root = project
  .copy(id = "linkageerrortest")
  .in(file("."))
  .enablePlugins(PlayScala)

scalaVersion := "2.11.8"

javaOptions += "-J-javaagent:target/universal/stage/lib/org.aspectj.aspectjweaver-1.8.9.jar"

name := "linkageerrortest"

libraryDependencies ++= Vector(
  "org.aspectj" % "aspectjweaver" % "1.8.9"
)

fork := true

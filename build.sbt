lazy val root = project
  .copy(id = "linkageerrortest")
  .in(file("."))
  .enablePlugins(PlayScala)
  .disablePlugins(PlayLogback)

scalaVersion := "2.11.8"

javaOptions += "-J-javaagent:target/universal/stage/lib/org.aspectj.aspectjweaver-1.8.9.jar"

bashScriptExtraDefines ++= Seq( """addJava "-javaagent:${lib_dir}/org.aspectj.aspectjweaver-1.8.9.jar"""")

name := "linkageerrortest"

libraryDependencies ++= Vector(
  "org.aspectj" % "aspectjweaver" % "1.8.9",
  "ch.qos.logback" % "logback-classic" % "1.1.7"
)

fork := true

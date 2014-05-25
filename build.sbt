name := "GoogleShortenUrl"

organization := "api.hiraq.google.shortenurl"

version := "1.0.0"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.10" % "2.0" % "test" withSources() withJavadoc(),
  "org.scalacheck" %% "scalacheck" % "1.10.0" % "test" withSources() withJavadoc()
)

initialCommands := "import api.hiraq.google.shortenurl._"

packSettings

packMain := Map("shorten" -> "api.hiraq.google.shortenurl.Shorten")
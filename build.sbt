name := "moth"
version := "0.1"
organization := "com.moth"

crossPaths := false
autoScalaLibrary := false

javacOptions ++= Seq("-source", "21", "-target", "21")

mainClass := Some("moth.MothApp")

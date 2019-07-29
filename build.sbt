name := """crud"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.0"

libraryDependencies ++= Seq(
  guice,
  javaJpa,
  "org.hibernate" % "hibernate-entitymanager" % "5.3.7.Final",
  "org.postgresql" % "postgresql" % "9.4-1200-jdbc41",
  // replace by your jpa implementation
)

PlayKeys.externalizeResources := false

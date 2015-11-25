import Resolver._

name := "Main"
version := "0.0.1"
scalaVersion := "2.11.7"

resolvers += Resolver.jcenterRepo

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.5" % "test"
libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.13"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.3"
organization := ""

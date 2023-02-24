ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"
ThisBuild / organization := "suprnation.majd"
ThisBuild / organizationName := "majd"

lazy val ScalaTestVersion = "3.2.15"

lazy val root = (project in file("."))
  .settings(
    name := "MinTrianglePath"
  )

libraryDependencies ++= Seq(
  "org.scalatest"     %% "scalatest"           % ScalaTestVersion
)
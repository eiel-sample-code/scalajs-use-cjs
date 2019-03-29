ThisBuild / organization := "info.eiel"
ThisBuild / scalaVersion := "2.12.8"

ThisBuild / scalacOptions ++= ScalacOptions.basic
ThisBuild / scalacOptions ++= ScalacOptions.forScalaJS

lazy val root = (project in file(".")).
  enablePlugins(ScalaJSPlugin).
  settings(
    name := "scalajs-use-cjs",
    scalaJSUseMainModuleInitializer := true,
    scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.CommonJSModule) },
  )

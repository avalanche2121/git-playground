lazy val root =
  (project in file("."))
    .settings(
      name         := "git-playground",
      version      := "0.1.1",
      organization := "com.danielyli",
      scalaVersion := "2.12.6"
    )

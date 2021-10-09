lazy val root = (project in file("."))
  .settings(
    name := "zio-x",
    // https://mvnrepository.com/artifact/dev.zio/zio
    libraryDependencies += "dev.zio" %% "zio" % "1.0.12"
  )

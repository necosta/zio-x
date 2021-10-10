
val ZioVersion = "1.0.12"

lazy val root = (project in file("."))
  .settings(
    name := "zio-x",
    // https://mvnrepository.com/artifact/dev.zio/zio
    libraryDependencies += "dev.zio" %% "zio" % ZioVersion,
    libraryDependencies += "dev.zio" %% "zio-test" % ZioVersion % Test,
    libraryDependencies += "dev.zio" %% "zio-test-sbt" % ZioVersion % Test,
    testFrameworks := Seq(new TestFramework("zio.test.sbt.ZTestFramework"))
  )

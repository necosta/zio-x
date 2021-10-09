import zio._, zio.console._

object Main extends App {
  def run(args: List[String]): URIO[Console, ExitCode] =
    putStrLn("Hello, World!").exitCode
}

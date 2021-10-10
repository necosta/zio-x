import zio._
import zio.console._

import scala.util.Try

object Main extends App {
  def run(args: List[String]): URIO[Console, ExitCode] = {
    val program : ZIO[Console, Throwable, Unit] = for {
      _ <- putStrLn("Insert a number")
      input <- getStrLn
      _ <- validateNumber(input)
      _ <- putStrLn(s"You inserted the number: $input")
    } yield ()
    program.exitCode
  }

  def validateNumber(str: String): Task[Int] = {
    ZIO.fromTry(Try(str.trim.toInt))
  }
}

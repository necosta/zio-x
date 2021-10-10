import zio.test._
import zio.test.Assertion._
import zio.test.DefaultRunnableSpec

object MainSpec extends DefaultRunnableSpec {

  def spec =
    suite("Validations")(
      testM("Test positive integer") {
        val output = Main.validateNumber("5")
        assertM(output)(equalTo(5))
      },
      testM("Test negative integer") {
        val output = Main.validateNumber("-1")
        assertM(output)(equalTo(-1))
      },
      testM("Test string value") {
        val output = Main.validateNumber("zio")
        assertM(output.run)(fails(isSubtype[NumberFormatException](anything)))
      },
      testM("Test empty value") {
        val output = Main.validateNumber("")
        assertM(output.run)(fails(isSubtype[NumberFormatException](anything)))
      },
      testM("Test positive integer with spaces") {
        val output = Main.validateNumber(" 5 ")
        assertM(output)(equalTo(5))
      })
}

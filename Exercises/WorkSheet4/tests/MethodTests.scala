
import Methods.getSquare
import org.junit.Test


/**
  * Created by philhannant on 27/01/2016.
  */
object MethodTests {

  @Test
  def test1() {
    val a = getSquare(3)
    assert(a == 9)
  }
  //@Test
  //def test2 {
    //val a = getSquare(6)
    //assert(a == 36)
  //}

  //@Test
  //def test3 {
    //val a = getSquare(5)
    //assert(a == 25)
  //}

}

/**
  * Created by philhannant on 27/01/2016.
  */
object ClassesObjects {

  def main(args: Array[String]) {
    val rn1 = 1 to 10
    println(rn1.step)

    val rn2 = 1 to 10 by 2
    println(rn2.step)

    //step value automatically will be 1 unless set to another number, rn2 will go up in 2s

    var s1 = "Sally"
    var s2 = "Sally"

    if (s1.equals(s2))
      println("s1 and s2 are equal")
    else
      println("s1 and s2 are not equal")

    class Hippo{}
    class Lion{}
    class Tiger{}
    class Monkey{}
    class Girafe{}

    val hippo = new Hippo()
    println(hippo)
    val lion = new Lion()
    println(lion)
    val tiger = new Tiger()
    println(tiger)
    val monkey = new Monkey()
    println(monkey)
    val girafe = new Girafe()
    println(girafe)

    //yes lot's of ugly strings

    println()
    val lion2 = new Lion()
    println(lion2)
    val girafe2 = new Girafe()
    val girafe3 = new Girafe()
    println(girafe2)
    println(girafe3)

    //they have a different hexadecimal




  }



}

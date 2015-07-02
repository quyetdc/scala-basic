package HelloWorld

/**
 * Created by colin on 02/07/2015.
 */

import scala.math._

object helloworld {
  def main(args: Array[String]) {
//    we can use var or val
//    val is final variable (cannot be reassigned)
    val x: Int = 1 + 2

    val Tau = Pi * 2

    val range1 = 1 to 10

    val range2 = 1 until 10

    val range3 = 2 until 10 by 3

    println("hello world")
    println(x)
    println(s"happy $Tau day")

    println("range 1 -- " + range1)
    println("range 2 -- " + range2)
    println("range 3 -- " + range3)

  }
}

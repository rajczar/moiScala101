object HereWeGoAgain extends App {

  def myAdditionFunction(x: Int, y: Int): Int = {
    val mySum = x + y
    mySum
  }

  val a = 1
  val b = 2
  val c = myAdditionFunction(a, b)
  println(c)

  val d = myAdditionFunction(a, b) // val inside a function is re-assignable as its is local scoped variable
  println(d)

  var v1 = a + b
  println(v1)
  v1 = a - b
  println(v1)
}

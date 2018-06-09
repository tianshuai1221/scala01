import scala.math._

object hello {

  def main(args: Array[String]): Unit = {
     // fun1()
    //fun7(-2)
   // fun05("hello")
   // fun03;
    //println(mi(10,0))
    fun06();

  }
  def fun06(): Unit ={
    val i=10d;
    println(i.isInstanceOf[Double])

    val ma=for(i <- 4 until  10)
      yield i

    println(ma)
  }
  def mi(x:Double,n:Int):Double={
    if(n == 0) 1
    else if(n>0) x * mi(x,n-1)
    else 1/mi(x,-n)


  }

  def fun04(str:String): Unit ={
    var s:Long=1
      for(i <- str)
        s=s.*(i.toLong)
    println(s)

  }
  def fun03(): Unit ={
    var sum:Long=1;
    val str="hello"
    str.foreach(sum*=_.hashCode())
    print(sum)
  }

  def fun02(name:String): Unit ={
    val len=name.length
    var sum=1
    for ( i <- 0 until  len )
      sum=name.charAt(i).hashCode().*(sum)
//     sum=name.indexOf(i).hashCode().+(sum)
    println(sum.toLong)

  }
  def fun01(i:Int): Unit ={
    (0 to i).reverse.foreach(println)
  }
  def fun9(): Unit ={
    for {i <- 1 to 9
         j <- 1 to 9
         } {
      if (i == j)
        println()
      print(i * j+"\t")
    }
  }
  def fun1(): Unit ={
    val i:Double=3;
    val j:Double=sqrt(i);
    val j1:Double=j.*(j);
    println("j="+j);
    println("j1="+j1)

  }
  def fun3(): Unit ={
    println("scala"*3)
  }
  def fun4(): Unit ={
    //scala.math.Max
    println(10 max 2)
  }
  def  fun5(): Unit ={
    val i=BigInt(2).pow(1024)
    println(i)
  }
  def fun6(): Unit ={
    val i="hello".take(1)
    val j="hello".reverse(0)
    val j1="hello".takeRight(1)
    println("i="+i+","+"j="+j+"j1="+j1)
  }
  def fun7(i:Int): Unit ={
    if(i<0) println("负数") else if(i>0) println("正数") else println("0")
  }
  def fun8(): Unit ={
    val i={}
    println(i.getClass+"\t"+i)
  }

}

object BasicDataStructuresAndCombinators extends App {
    // Arrays: mutable, order, can have duplicates
    val array = Array(1, 2, 3, 4, 5, 1, 2)
    array(3) =  10
    // Lists: immutable, order, can have duplicates
    val list = List(1, 2, 3)
    println(list)
    println(list :+ 7)
    println(list :: List(4))
    println(list ++ List(5))
    println(list + "List(6)")
    println(list ::: List(4))
    println(list.slice(0, 2))
    // Sets: immutable, no order, no duplicates
    val set = Set(1, 99, 5, 3)
    print(set)
    // Tuple: group together any values
    val tuple = ("something", 180)
    val triple = (1234, "here it is", 1.0)
    println(triple)
    println(triple._1)
    triple match {
        case(1234, something, _) => println(something)
        case _ => println("error")
    }
    val tuple2 = "something" -> 180
    println(tuple2)
    // Maps: dict
    val map = Map(1 -> 2, 2 -> 3, 3 -> 4)
    println(map(2))
    // Option
    private def checkOption(maybeNumber: Option[Int]) = maybeNumber match {
        case Some(n) => println("A number: " + n)
        case None => println("Nothing")
    }
    checkOption(Option(4))
    checkOption(None)

    val vList = List(1, 2, 3, 4)
    // map
    val squareList = vList.map(i => i*i)
    println(squareList)
    // foreach
    vList.foreach(i => print(i*i + " "))
    print("\n")
    // filter
    val even = vList.filter(_ % 2 == 0)
    val odd = vList.filter(_ % 2 == 1)
    println(even)
    println(odd)
    // zip
    val combined = odd.zip(even)
    println(combined)
    //flattened zip
    val flatZip = combined.flatMap { case (a:Int, b: Int) => List(a, b) }
    println(flatZip)
    // partition
    

    // find
    // drop and dropWhile
    // foldRight and foldLeft
    // flatten
    // flatMap
    // Generalized functional combinators

}
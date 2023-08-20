fun main() {
    //println("Hello World")

    //println(sum(1, 2))
    //println(sumOne(1, 2))

    //Can also be written as a lambda expression:
    //println({ string: String -> string.uppercase() }("hello"))

    //If you declare a lambda without parameters, then there is no need to use ->. For example:
    //println({ println("Log message") }())

    //Assign to variable
    /*val upperCaseString = { string: String -> string.uppercase() }
    println(upperCaseString("hello"))*/

    //Pass to another function
    /*val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { x -> x < 0 }
    println(positives)
    println(negatives)*/

    //You must declare parameter and return types either in the lambda expression or as a function type.
    //val upperCaseString = { str -> str.uppercase() } this won't work
    /*val upperCaseString: (String) -> String = { string -> string.uppercase() }
    println(upperCaseString("hello"))*/

    //Return from a function
    /*val timesInMinutes = listOf(2, 10, 15, 1)
    val min2sec = toSeconds("minute")
    val totalTimeInSeconds = timesInMinutes.map(min2sec).sum()
    println("Total time is $totalTimeInSeconds secs")*/

    //Invoke separately
    //println({ string: String -> string.uppercase() }("hello"))

    //Trailing lambdas
    //if a lambda expression is the only function parameter, you can drop the function parentheses ()
    // The operation sums the initial value with every item in the list cumulatively.
    //println(listOf(1, 2, 3).fold(0, { x, item -> x + item })) // 6

    // Alternatively, in the form of a trailing lambda
    //println(listOf(1, 2, 3).fold(0) { x, item -> x + item })  // 6


    //#Exercise 1
    /*val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map({ action: String -> "$prefix/$id/$action" })
    //val urls = actions.map(){ action -> "$prefix/$id/$action" }
    println(urls)*/

    //#Exercise 2
    /*repeatN(5) {
        println("Hello")
    }*/
    //repeatN(5, { println("Hello") })
    //repeatN(5, { () -> println("Hello") })

    //test({ println("Hello") })
    //greet({ println("Hello") })

}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun sumOne(x: Int, y: Int) = x + y

fun test(action: () -> Unit) = "Test"
val greet: (() -> Unit) -> Unit = { println("Good day!") }

//Lambda expressions can be returned from a function.
fun toSeconds(time: String): (Int) -> Int = when (time) {
    "hour" -> { value -> value * 60 * 60 }
    "minute" -> { value -> value * 60 }
    "second" -> { value -> value }
    else -> { value -> value }
}

fun repeatN(n: Int, action: () -> Unit) {
    for (i in 1..n) {
        action()
    }
}
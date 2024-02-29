fun greet(greeting: String, itemsToGreet: List<String>) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun main() {

    // Array
//    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")

//    println(interestingThings.size)
//    println(interestingThings[0])
//    println(interestingThings.get(0))

//    for (interestingThing in interestingThings) {
//        println(interestingThing)
//    }

//    interestingThings.forEach {interestingThing ->
//        println(interestingThing)
//    }
//    interestingThings.forEachIndexed{ index, interestingThing ->
//        println("$interestingThing is at index $index")
//    }

    // List
    // listOf() - Default is immutable
    // mutableListOf - Mutable
    val interestingThings = listOf("Kotlin", "Programming", "Comic Books")


//    interestingThings.forEach { interestingThing ->
//        println(interestingThing)
//    }

    // Map
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")

//    map.forEach { key, value -> println("$key -> $value") }

    greet("Hello", interestingThings);
}
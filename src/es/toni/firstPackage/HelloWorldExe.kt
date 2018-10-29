package es.toni.firstPackage

fun main(args: Array<String>) = try {
    println(args[0])
    println(args[1])
    println(args[2])
} catch (e: Exception) {
    println("Big error in program. Self-destruction started: " + e.toString())
} finally {
    println("Press enter to continue")
    System.`in`.read()
}
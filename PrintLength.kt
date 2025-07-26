fun printLength(str: String?) {
    if (str != null) {
        println("Length: ${str.length}")
    } else {
        println("String is null")
    }
}
fun main() {
    val nullableString: String? = "Kotlin"
    val nullValue: String? = null

    printLength(nullableString)  // Output: Length: 6
    printLength(nullValue)       // Output: String is null
}
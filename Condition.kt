fun checkNumber(num: Int) {
    if (num > 0) {
        println("Positive")
    } else if (num < 0) {
        println("Negative")
    } else {
        println("Zero")
    }
}

fun main() {
    checkNumber(20)
    checkNumber(-234)
    checkNumber(0)
    checkNumber(34)
    checkNumber(-2435)
    checkNumber(3637)
    checkNumber(2345)
    checkNumber(-76545)
    checkNumber(3432)

}

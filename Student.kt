class Student(val name: String, val roll: Int, val marks: Int) {

    fun calculateGrade(): String {
        return when {
            marks >= 75 -> "A"
            marks >= 50 -> "B"
            else -> "C"
        }
    }

    fun printDetails() {
        println("Name: $name, Roll: $roll, Marks: $marks, Grade: ${calculateGrade()}")
    }
}
fun main() {
    val student1 = Student("Alice", 1, 82)
    val student2 = Student("Bob", 2, 68)
    val student3 = Student("Charlie", 3, 45)

    student1.printDetails()
    student2.printDetails()
    student3.printDetails()
}
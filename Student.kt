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
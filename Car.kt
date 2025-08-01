class Car(val make: String, val model: String, val year: Int, var mileage: Double) {

    fun details() {
        println("Car Details:")
        println("Make: $make")
        println("Model: $model")
        println("Year: $year")
        println("Mileage: $mileage km")
    }

    fun drive(miles: Double) {
        mileage += miles
        println("Driven $miles km.")
    }
}
fun main() {
    val myCar = Car("Toyota", "Corolla", 2050, 200.0)

    myCar.details()
    myCar.drive(123.5)
    myCar.details()
}

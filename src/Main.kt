import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Select a shape:")
    println("1. Rectangle")
    println("2. Circle")
    println("3. Triangle")
    println("4. Square")
    print("Enter your choice: ")
    val choice = scanner.nextInt()

    when (choice) {
        1 -> calculateRectangleArea()
        2 -> calculateCircleArea()
        3 -> calculateTriangleArea()
        4 -> calculateSquareArea()
        else -> println("Invalid choice")
    }
}

fun calculateRectangleArea() {
    val scanner = Scanner(System.`in`)
    print("Enter the length: ")
    val length = scanner.nextDouble()
    print("Enter the width: ")
    val width = scanner.nextDouble()
    val area = length * width
    println("The area of the rectangle is: $area")
}

fun calculateCircleArea() {
    val scanner = Scanner(System.`in`)
    print("Enter the radius: ")
    val radius = scanner.nextDouble()
    val area = Math.PI * radius * radius
    println("The area of the circle is: $area")
}

fun calculateTriangleArea() {
    val scanner = Scanner(System.`in`)
    print("Enter the base: ")
    val base = scanner.nextDouble()
    print("Enter the height: ")
    val height = scanner.nextDouble()
    val area = 0.5 * base * height
    println("The area of the triangle is: $area")
}

fun calculateSquareArea() {
    val scanner = Scanner(System.`in`)
    print("Enter the side length: ")
    val sideLength = scanner.nextDouble()
    val area = sideLength * sideLength
    println("The area of the square is: $area")
}
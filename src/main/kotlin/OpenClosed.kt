package org.example

class ShapeCal {
    fun calculateArea(shape: Shape, width: Double, height: Double): Double {
        return when(shape){
            is Rectangle -> width * height
            is Circle    -> Math.PI * width * height
            else -> throw NotImplementedError("not Not Implemented -> $shape")
        }
    }
}

interface Shape {
    fun calculateArea(): Double
}

class Rectangle(var width: Double, var height: Double) : Shape {
    override fun calculateArea(): Double = width * height
}

class Circle(var radius: Double) : Shape {
    override fun calculateArea(): Double = Math.PI * radius * radius
}

public fun Rectangle.resizeRectangle(width: Double, height: Double) {
    this.width  = width
    this.height = height
}

public fun Circle.resizeCircle(radius: Double) {
    this.radius = radius
}

class ShapeAreaCal {
    fun calculateArea(shape: Shape) = shape.calculateArea()
    fun calculateArea(shapes: List<Shape>) = shapes.sumOf { it.calculateArea() }
}

fun main() {
    /*************** Open Closed principle ********/
    val rectangle  = Rectangle(10.0, 10.0)
    val circle     = Circle(10.0)
    val rectArea   = ShapeAreaCal().calculateArea(shape = rectangle)
    val circleArea = ShapeAreaCal().calculateArea(shape = circle)

    println("area rectangle -> $rectArea")
    println("area circle -> $circleArea")

    rectangle.resizeRectangle(20.0, 20.0)
    circle.resizeCircle(20.0)

    println("area rectangle -> ${rectangle.calculateArea()}")
    println("area rectangle -> ${circle.calculateArea()}")
}
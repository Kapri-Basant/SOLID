package org.example

open class Bird {
    open fun walk() = println("Hey, I'm walking!")
    open fun fly()  = println("Hey, I'm flying!")
    open fun swim() = println("Hey, I'm swimming!")
}

class Crow : Bird() {
    override fun walk() = println("Hey, I'm walking!")
    override fun fly()  = println("Hey, I'm flying!")
    override fun swim() = throw UnsupportedOperationException("Hey, I can't swim!")
}

class Penguin : Bird() {
    override fun walk() = println("Hey, I'm walking!")
    override fun fly()  = throw UnsupportedOperationException("Hey, I can't fly!")
    override fun swim() = println("Hey, I'm swimming!")
}

/*
interface Bird {  fun walk() }
interface FlyingBird : Bird { fun fly() }
interface SwimmingBird : Bird { fun swim() }

class Crow : FlyingBird {
    override fun walk()  = println("Hey, I'm walking!")
    override fun fly()   = println("Hey, I'm flying!")
}

class Penguin : SwimmingBird {
    override fun walk() =  println("Hey, I'm walking!")
    override fun swim() =  println("Hey, I'm swimming!")
}*/
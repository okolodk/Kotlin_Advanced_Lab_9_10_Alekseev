package example

var age :  Int = 18
    set(value) {
        if ((value > 0) and (value <110))
            field = value
    }

data class Item(
    val id: Int,
    val name: String,
    val quantity: Int
) {
    override fun toString(): String {
        return "Id предмета: $id\nName: $name\nCount: $quantity\n"
    }
}
abstract  class Human(val name: String) {
    abstract  var age: Int

    abstract fun hello()

}
class Person(name: String) : Human(name) {
    override var age: Int = 1
    override fun hello() {
        println("My name is $name")

    }
}
class Rectangle(val width : Float, val height: Float) : Figure() {
    override fun perimieter(): Float {
        return 2 * (width + height)
    }

    override fun area(): Float {
        return width * height
    }
}
abstract class Figure {
    abstract fun perimieter() : Float

    abstract  fun area(): Float
}
fun main() {
//    println(example.age)
//    example.age = 45
//    println(example.age)
//    example.age = -345
//    println(example.age)

//    val sword = example.Item(1, "Sword", 1)
//    val betterSword = sword.copy(quantity = 2)
//    println(sword.toString())
//    println(betterSword.toString())
//    val(id, name, quantity) = betterSword
//    println("Id предмета: $id\nName: $name\nCount: $quantity\n")

    val denis: Person = Person("Denis")
    val maksim : Human = Person("Maksim")
    denis.hello()
    maksim.hello()
//    val pavel: example.Human = example.Human("Pavel")
}
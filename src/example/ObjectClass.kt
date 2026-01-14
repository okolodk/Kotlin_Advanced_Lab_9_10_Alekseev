package example

object GameSession {
    init {
        println("Игровая сесия создана")
    }
    var isActive: Boolean = false
    fun start() {
        isActive = true
        println("Game start")
    }
    fun end() {
        isActive = false
        println("Game end")
    }

}
object Logger {
    var count = 0

    fun log(message : String) {
        count++
        println("[$count] $message")
    }
}
class MyCar(val model : String) {
    fun drive() = println("$model едет")
}
object TrafficController {
    var carCount = 0
    fun carPassed() {
        carCount++
    }
}
fun main() {
//    println("Программа запущена")
//    println("Проверяем состояние, но не трогаем GameSession")
//    println("Теперь запускаем игру")
//    GameSession.start()
//    println("Проверяем состояние ещё раз")
//    println("Активна ли сессия: ${GameSession.isActive}")

//    Logger.log("Первое сообщение")
//    Logger.log("Второе сообщение")
//    val logger1 = Logger
//    val logger2 = Logger
//
//    println(logger1 === logger2)

    MyCar("Toyota")
    MyCar("BMW")
    TrafficController.carPassed()
}
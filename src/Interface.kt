interface Movable {
    var speed: Int
    val model: String
    val number: String
    fun move()
    fun stop() {
        println("Stop...")
    }
}
class Car(override val model: String,
          override val number: String ) : Movable {
    override var speed: Int = 60


    override fun move() {
        println("Едем на машине со скоростью $speed км/ч")
    }
}
class Aircraft(override val model: String,
               override val number: String) : Movable {
    override var speed: Int = 600

    override fun move() {
        println("Летим на самолёте со скоростью $speed км/ч")
    }

    override fun stop() {
        println("Приземляемся...")
    }
}
fun travel(obj: Movable) = obj.move()

interface Worker {
    fun work()
}
interface  Student {
    fun study()
}
class WorkingStudent(val name: String) : Worker, Student {
    override fun work() {
        println("$name работает")
    }

    override fun study() {
        println("$name учиться")
    }
}

interface  VideoPlayable {
    fun play() = println("Play video")
}
interface  AudioPlayable {
    fun play() = println("Play audio")
}
class MediaPlayer : VideoPlayable, AudioPlayable {
    override fun play() {
        println("Play playing")
        super<AudioPlayable>.play()
        super<AudioPlayable>.play()
    }
}
fun main() {
//    val car = Car("LADA", "134LAD")
//    val aircraft = Aircraft("Boeing", "737")
//    travel(car)
//    travel(aircraft)
//    aircraft.stop()
//    val pavel = WorkingStudent("Pavel")
//    pavel.work()
//    pavel.study()

    val player = MediaPlayer()
    player.play()
}
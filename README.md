# Лабораторная работа №9-10: Продвинутое ООП на Kotlin

## Описание
Лабораторная работа посвящена изучению продвинутых концепций объектно-ориентированного программирования в Kotlin.

## Структура проекта
Проект содержит примеры реализации продвинутых механизмов ООП, а также пояснения к ключевым концепциям.

## Как запустить проект
1. Клонируйте репозиторий:
```bash
git clone <https://github.com/okolodk/Kotlin_Advanced_Lab_9_10_Alekseevhttps://github.com/okolodk/Kotlin_Advanced_Lab_9_10_Alekseev>
```
2. Откройте проект в Intellij IDEA.
3. Запустите любой пример через контекстное меню или напряую из `main`.

## Автор
Алексеев Григорий Сергеевич

## Лицензия
Проект создан в учебных целях.
## Инкапсуляция
Инкапсуляция — это принцип ООП, который скрывает внутреннее состояние объекта и предоставляет контролируемый доступ к нему через публичные методы и свойства.
### Содержит:

1. Использование модификаторов доступа (private, protected, internal, public).
2. Кастомные геттеры и сеттеры для контроля над изменениями.
3. Приватные сеттеры (private set) для свойств, которые должны изменяться только внутри класса.

### Пример

```bash
class OutpostWorker(val name: String) {
    private var _level: Int = 1
    val level: Int
        get() = _level
        private set(value) { // Запрещаем изменение извне
            _level = value
        }

    fun levelUp() {
        _level++ // Увеличиваем уровень только через публичный метод
    }
}
```
## Data-классы
Data-классы предназначены для хранения данных. Kotlin автоматически генерирует стандартные методы: equals(), hashCode(), toString() и copy().

### Содержит:

1. Обязательный параметр в первичном конструкторе.
2. Автоматическую генерацию toString(), equals(), hashCode(), copy().
3. Функции декомпозиции (componentN()).

### Пример
```bash
data class OutpostResource(val id: Int, val name: String, var amount: Int)

// Используем сгенерированный метод copy()
val minerals = OutpostResource(1, "Minerals", 100)
val bonusMinerals = minerals.copy(amount = minerals.amount + 50)

println(minerals) // Вывод: OutpostResource(id=1, name=Minerals, amount=100)
println(bonusMinerals) // Вывод: OutpostResource(id=1, name=Minerals, amount=150)
```

## Абстрактные классы

Абстрактный класс — это базовый класс, от которого нельзя создать объект напрямую. Он может содержать как абстрактные, так и реализованные методы и свойства.

### Содержит:

1. Абстрактные методы (без реализации).
2. Абстрактные свойства (без значения).
3. Обычные методы и свойства с реализацией.
4. Наследование (только одно).
### Пример

```bash
abstract class OutpostModule(val name: String, var level: Int) {
    abstract fun performAction()

    fun upgrade() {
        level++
        println("$name upgraded to level $level")
    }
}

// Наследник должен реализовать абстрактный метод
class EnergyGenerator(name: String, level: Int) : OutpostModule(name, level) {
    override fun performAction() {
        println("Energy generator is producing energy...")
    }
}abstract class OutpostModule(val name: String, var level: Int) {
    abstract fun performAction()

    fun upgrade() {
        level++
        println("$name upgraded to level $level")
    }
}

// Наследник должен реализовать абстрактный метод
class EnergyGenerator(name: String, level: Int) : OutpostModule(name, level) {
    override fun performAction() {
        println("Energy generator is producing energy...")
    }
}
```

## Интерфейсы

Интерфейс — это контракт поведения, который класс обязуется реализовать. Может содержать объявления методов и свойств, а также их реализацию по умолчанию.

### Содержит:

1. Абстрактные методы и свойства без реализации.
2. Реализацию по умолчанию для методов.
3. Возможность множественной реализации интерфейсов.

### Пример

```bash
    interface Movable {
    val speed: Int
    fun move()
    fun stop() = println("Stopped.")
}

class Car(override val speed: Int) : Movable {
    override fun move() {
        println("Car is moving at $speed km/h")
    }
}

class Aircraft(override val speed: Int) : Movable {
    override fun move() {
        println("Aircraft is flying at $speed km/h")
    }

    override fun stop() {
        println("Aircraft has landed and stopped.")
    }
}

fun travel(vehicle: Movable) {
    vehicle.move()
    vehicle.stop()
}

fun main() {
    travel(Car(60))
    travel(Aircraft(900))
}
```
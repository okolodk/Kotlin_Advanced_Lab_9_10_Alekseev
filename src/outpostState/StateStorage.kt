package outpostState

import java.io.File

object StateStorage{
    private const val FILE_NAME = "observable_resource.txt"

    fun save(resource: List<ObservableResource>) {
        val file = File(FILE_NAME)
        file.writeText(
            resource.joinToString( "\n" ) {
                "${it.name.padEnd(10)} | " +
                        "${it.quantity}"
            }
        )
        println("SAVE")
    }

    fun load() : List<ObservableResource> {
        val file = File(FILE_NAME)
        if (!file.exists()) return emptyList()

        println("Загрузка состояния базы из файла")
        return file.readLines().map {
            val (name, quantity) = it.split("| ")
            ObservableResource(name, quantity.toInt())
        }

    }
}
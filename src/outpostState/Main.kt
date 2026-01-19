package outpostState

fun main() {
    val manager = OutpostManager()
    val minerals = ObservableResource("minerals", 100)
    val gas = ObservableResource("gas", 100)
    manager.resources.add(minerals)
    manager.resources.add(gas)

    minerals.quantity = 150
    gas.quantity = 30
    manager.resources = mutableListOf<ObservableResource>()
    val loadedResources = StateStorage.load()
    loadedResources.forEach { manager.resources.add(it) }

    manager.resources.forEach { println("${it.name} ${it.count}") }
    StateStorage.save(manager.getAll())

}
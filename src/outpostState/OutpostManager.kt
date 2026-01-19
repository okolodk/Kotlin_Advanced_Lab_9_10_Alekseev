package outpostState

import resources.OutpostResource

class OutpostManager
 {
     var resources: MutableList<ObservableResource> = mutableListOf<ObservableResource>()
     val outpostManager by lazy {
        println("Менеджер создан")
        OutpostManager()
    }
    fun getAll() : List<ObservableResource> = resources.toList()
}
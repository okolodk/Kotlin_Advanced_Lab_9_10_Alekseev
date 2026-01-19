package outpostState

class ResourceObserver {
    fun changingResources(name : String, old : Int, new : Int) {
        println("[наблюдатель] Изменение кол-во ресурса $name. Было $old, стало $new")
    }
}
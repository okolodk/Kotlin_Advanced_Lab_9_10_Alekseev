package outpostState
import kotlin.properties.Delegates

class ObservableResource(
    val name : String,
    var count: Int

){
    val observer = ResourceObserver()
    var quantity: Int by Delegates.observable(count) {
            _, old, new ->
        println("«Ресурс Minerals изменён: $old → $new»")
        observer.changingResources(name, old, new)
    }
}

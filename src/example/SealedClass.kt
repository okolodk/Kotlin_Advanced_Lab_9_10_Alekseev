package example

sealed class  OrderStatus {
    object  Created: OrderStatus()
    object  Paid : OrderStatus()
    object  Shipped : OrderStatus()

    data class  Cancelled(val reason: String) : OrderStatus()
}
sealed class NetworkResult {
    data class Success(val data: String) : NetworkResult()
    data class  Error(val message: String, val code: Int): NetworkResult()
    object Loading : NetworkResult()
}
fun handleOrder(status: OrderStatus) {
    when ( status ) {
        OrderStatus.Created -> println("Заказ создан")
        OrderStatus.Paid -> println("Заказ оплачен")
        OrderStatus.Shipped -> println("Заказ отправлен")
        is OrderStatus.Cancelled -> println("Отменён: ${status.reason}")
    }
}
fun handleResult(result: NetworkResult) {
    when (result) {
        is NetworkResult.Success -> {
                println("Успех: ${result.data}")
        }
        is NetworkResult.Error -> {
            println("Ошибка ${result.code}: ${result.message}")
        }
        is NetworkResult.Loading -> {
            println("Loading ...")
        }
    }
}
fun main() {
//    val success = NetworkResult.Success("Данные получены")
//    val error = NetworkResult.Error("Сервер не отвичает", 500)
//    val loading = NetworkResult.Loading
//
//    handleResult(success)
//    handleResult(error)
//    handleResult(loading)

    handleOrder(status = OrderStatus.Created)
    handleOrder(status = OrderStatus.Paid)
    handleOrder(status = OrderStatus.Shipped)
    handleOrder(status = OrderStatus.Cancelled(reason = "Нет товара на складе"))
}
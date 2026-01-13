fun main() {
    val manager = ResourceManager()
    val minerrals = OutpostResource(1, "Minerals", 300)
    val gas  = OutpostResource(2, "Gas", 100)
    manager.add(minerrals)
    manager.add(gas)
    manager.printAll()

    val bonus = minerrals.copy(amount = minerrals.amount + 50)

    println("Копия миниралов с бонусом: $bonus")
}
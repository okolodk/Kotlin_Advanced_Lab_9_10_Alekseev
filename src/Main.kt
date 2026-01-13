fun main() {
//    val manager = ResourceManager()
//    val minerrals = OutpostResource(1, "Minerals", 300)
//    val gas  = OutpostResource(2, "Gas", 100)
//    manager.add(minerrals)
//    manager.add(gas)
//    manager.printAll()
//
//    val bonus = minerrals.copy(amount = minerrals.amount + 50)
//
//    println("Копия миниралов с бонусом: $bonus")
    val manager = ResourceManager()
    manager.add(OutpostResource(1, "Minerals", 120))
    manager.add(OutpostResource(2, "Gas", 40))

    val generator = EnergyGenerator()
    val lab = ResearchLab()

    generator.performAction(manager)
    lab.performAction(manager)

    println()
    manager.printAll()
}
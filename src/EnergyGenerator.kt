class EnergyGenerator : OutpostModule("Генератор энергии") {
    override fun performAction(manager: ResourceManager) {
        println("генератор работает ... Производит 20 энергии")
        val energy = manager.get("Energy")

        if (energy != null) {
            energy.amount +=20
        } else {
            manager.add(OutpostResource(id=99, "Energy",20))
        }
    }
}
package modules

class ResearchLab : OutpostModule("Иследовательская лаборатория") {
    override fun performAction(manager: ResourceManager) {
        val minerals = manager.get("Minerals")

        if (minerals == null || minerals.amount < 30) {
            println("Недостаточно минералов для исследования")
            return
        } else {
            minerals.amount -= 30
            println("Лаборатория проводит исследование (минералов -30)")
        }
    }
}
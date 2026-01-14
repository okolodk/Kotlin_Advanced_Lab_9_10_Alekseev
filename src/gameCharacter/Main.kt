package gameCharacter
fun handleCharcterState(state : CharacterState) {
    when (state) {
        is CharacterState.Inaction -> println("Персонаж бездействует")
        is CharacterState.Runing -> println("Персонаж бежит")
        is CharacterState.Dead -> println("Персонаж погиб: ${state.reason}")
        is CharacterState.Attack -> println("Персонаж атакует с уроном ${state.damage}")
    }
}
fun main() {
    val hero1 = Hero("AAA")
    handleCharcterState((hero1.condition))

    hero1.statusChanges(CharacterState.Runing)
    handleCharcterState((hero1.condition))

    hero1.statusChanges(CharacterState.Attack(20))
    handleCharcterState((hero1.condition))

    hero1.statusChanges(CharacterState.Dead("Подения"))
    handleCharcterState((hero1.condition))


}
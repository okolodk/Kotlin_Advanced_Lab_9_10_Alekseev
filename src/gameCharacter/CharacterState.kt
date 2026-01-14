package gameCharacter

sealed class CharacterState {
    object Inaction : CharacterState()
    object  Runing : CharacterState()
    data class Attack(var damage : Int) : CharacterState()
    data class  Dead(val reason : String) : CharacterState()
}
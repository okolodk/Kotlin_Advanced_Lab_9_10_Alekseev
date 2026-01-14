package gameCharacter

class Hero(
    val name : String,
    var condition : CharacterState = CharacterState.Inaction
) {
    fun statusChanges(newCondition : CharacterState) {
        this.condition = newCondition
    }
}
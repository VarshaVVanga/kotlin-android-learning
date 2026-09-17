fun main() {
    val developerName = "Varsha"
    var studyMinutes = 30
    val learningTopic = "Kotlin variables and basic types"

    println("Developer: $developerName")
    println("Today's topic: $learningTopic")
    println("Study target: $studyMinutes minutes")

    studyMinutes = 20 // ✅ var can be reassigned
    println("Actual study time: $studyMinutes minutes")

    //developerName = "Srikanth" // ❌ Cannot reassign val
}

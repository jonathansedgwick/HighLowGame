import kotlin.random.Random

fun main() {
    val answer = Random.nextInt(1,100)
    var guess = 0
    var highGuess = 0
    var lowGuess = 0
    while (guess != answer) {
        print("Enter a number: ")
        guess = readln()!!.toInt()
        if (guess > answer) {
            println("Too big")
            highGuess++
        }
        else if (guess < answer) {
            println("Too small")
            lowGuess++
        }
    }
    println("Correct\nNumber of high guesses: $highGuess\nNumber of low guesses: $lowGuess")
}
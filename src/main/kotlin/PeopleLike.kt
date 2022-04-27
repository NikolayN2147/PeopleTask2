

fun main() {
    val likes = 61
    var people = "человеку"
    if ((likes % 10 == 1) && (likes % 100 != 11)) people else people = "людям"
        println("Понравилось $likes $people")
}
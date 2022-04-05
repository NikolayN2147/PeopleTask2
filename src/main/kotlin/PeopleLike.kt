fun main() {
    print("Введите кол-во лайков: ")
    val likes = readLine()?.toUInt() ?: return
    if(likes % 10U == 1U){
        println("Понравилось $likes человеку")
    }else {
        println("Понравилось $likes людям")
    }
}
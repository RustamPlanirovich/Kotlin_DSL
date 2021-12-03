operator fun Int.times(s: String): Unit {
    repeat(this) {
        println(s)
    }
}
infix fun Int.abc(s:String):Unit{
    repeat(this){
        println(s)
    }
}
fun main() {
    5 * "Rustam"
    5 abc "Hello"
}
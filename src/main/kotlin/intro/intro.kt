package intro

import org.w3c.dom.css.CSSStyleRule

class Student(var name: String, var age: Int) {
    var nick: MutableList<String> = mutableListOf()

    operator fun String.unaryPlus() {
        nick.add(this)
    }
}

fun Student.add(i: Int): Student {
    age += i
    return this
}

operator fun Student.plus(i: Int): Student {
    age += i
    return this
}


fun abc(f: () -> Unit): Unit = f.invoke()
fun addd() {
    println("IIInvoke")
}

//fun student(block: Student.() -> Unit): Student {
//    var ret = Student("", 0)
//    ret.block()
//    return ret
//}
fun student(block: Student.() -> Unit): Student = Student(name = "", age = 0).apply(block)
fun main() {


    val st = student {
        name = "Jhon Smith"
        age = 28

        +"Herl"
    }
    println("${st.name} ${st.age} ${st.nick[0]}")
//    abc { addd() }


//    val s = Student("Jhon Smith", 17)
//    val ss = s.add(12).age
//    println(ss)
//
//    s.plus(6)
//    println(s.age)
}
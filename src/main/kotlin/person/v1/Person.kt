package person.v1

class Person(var name: String? = null, var age: Int? = null, var address: Address? = null)
class Address(var street: String? = null, var number: Int? = null, var city: String? = null)

fun Person.address(block: Address.() -> Unit) {
    val address = Address().apply(block)
    this.address = address

}
fun person(block: Person.() -> Unit): Person = Person().apply(block)

fun main() {

    val person = person {
        name = "John"
        age = 25

        address{
            this.street = "Hello"
            this.number = 25
            this.city = "world"
        }
    }
    println("${person.name} ${person.age} ${person.address?.street}")

//    val person = person {
//        name = "John"
//        age = 25
//        adress {
//            street = "Leninsky pros"
//            number = 42
//            city = "Moscow"
//        }
//    }
}
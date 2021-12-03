package person.v2


class Person(val name: String? = null, val age: Int? = null, val address: Address? = null)
class Address(val street: String? = null, val number: Int? = null, val city: String? = null)


fun personBuilder(block: personBuilder.() -> Unit): Person = personBuilder().apply(block).build()


class personBuilder {
    var name: String? = ""
    var age: Int? = 0
    var address: Address? = null

    fun address(block: addressBuilder.() -> Unit) {
        this.address = addressBuilder().apply(block).build()
    }
    fun build(): Person = Person(name, age, address)
}

class addressBuilder {
    var street: String? = null
    var number: Int? = null
    var city: String? = null
    fun build(): Address = Address(street, number, city)
}

fun main() {

    val personBuilder = personBuilder {
        name = "John"
        age = 25

        address {
            street = "Hello 2"
            number = 25
            city = "world"
        }
    }
    println("${personBuilder.name} ${personBuilder.age} ${personBuilder.address?.street}")

}
package br.com.alura

fun main() {

    Address("rua vergueiro", 3185).let { address ->
        "${address.street}, ${address.number}".toUpperCase()

    }.let(::println)

    listOf(
        Address("home", 3185),
        Address("aartment", 3185),
        Address("house", 3185),
        Address("rua vergueiro", 3185),
        Address("rua vergueiro", 3185)
    ).filter {
        it.street.isNotEmpty()
    }.map { it.number + 10 }
        .forEach { each ->
            each.let(::println)
        }

    sumPlus(1, 2) {
        println(it)
    }

    authentication(1234) {

        if (it) {
            println("authorized")
        } else {
            println("non authorized ")
        }
    }
}

fun authentication(password: Int, authorized: (Boolean) -> Unit) {

    val pass = 1234

    if (password == pass) {
        authorized.invoke(true)
    } else {
        authorized.invoke(false)
    }
}

fun sumPlus(a: Int, b: Int, result: (Int) -> Unit) {
    println("before the sum")
    result(a + b)
    println("after the sum")
}

data class Address(val street: String, val number: Int)



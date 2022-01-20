package br.com.alura.course07


fun testScopedFunctions(){


    val numbers = mutableListOf(1, 2, 3)
    numbers.run {
        add(4)
        add(5)
        count { it >= 3 }
    }.let(::println)

    listOf(
        Address("home", 3185),
        Address("aartment", 3185),
        Address("house", 3185),
        Address("rua vergueiro", 3185),
        Address("rua vergueiro", 3185)
    ).filter {
        it.street.isEmpty()
    }.map { it.number + 10 }
        .forEach { each ->
            each.let(::println)
        }

    sumPlus(1, 2) {
        println(it)
    }

    Address("rua vergueiro", 3185).let { address ->
        "let block ${address.street}, ${address.number}".toUpperCase()
    }.let(::println)

    Address("rua vergueiro", 3185).apply {
        "apply block $street, $number".toUpperCase()
    }.let(::println)

    Address("rua vergueiro", 3185).run {
        "run block $street, $number".toUpperCase()
    }.let(::println)

    with(Address("rua vergueiro", 3185)) {
        " with block $street, $number".toUpperCase()
    }.let(::println)

    Address()
        .also { println("creating address") }
        .apply {
            street = "rua vergueiro"
            number = 15451
        }
        .also { println("address created") }
        .let(::println)
}

fun sumPlus(a: Int, b: Int, result: (Int) -> Unit) {
    println("before the sum")
    result(a + b)
    println("after the sum")
}

data class Address(var street: String = "", var number: Int = 0)



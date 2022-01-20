package br.com.alura.course07

fun testHOFWithReceivers(){

    plusReceiver(1, 2) {value ->
        println("$value $this ")
    }
}

fun plusReceiver(a: Int, b: Int, result: Int.(String) -> Unit) {
    val total = a + b
    total.result("hello world")
}

fun testRun() {

    val taxes = 0.05
    val monthlyTax = taxes / 12
    monthlyTax.let(::println)

    val client = Client("Alex", "123.456.789-55", 1234)
    val savingAccount = SavingAccount(client, 1000)

    savingAccount.run {
        val withTaxes = deposit(this, 1000.0) * monthlyTax
        println(withTaxes + balance)
    }

    run {
        var balance = savingAccount.balance

        repeat(12) {
            balance += balance * monthlyTax
        }
        balance
    }.let(::println)
}

data class Client(val name: String, val cpf: String, val password: Int)

data class SavingAccount(val client: Client, val number: Int, var balance: Double = 0.0)

fun deposit(from: SavingAccount, value: Double): Double {
    from.balance = from.balance + value
    return from.balance
}

fun testWith() {
    with(Address()) {
        street = "street vergeueiro "
        number = 1548

        """
          $street - $number
        """.trimIndent()
    }.let(::println)
}
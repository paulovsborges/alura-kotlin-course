package br.com.alura

fun main() {

    val orders = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 14.0),
        3 to 50.0,
    )

    println(orders)

    val order = orders[1]
    order?.let {
        println("Pedido : $it")
    }

    for (orderr in orders) {
        println("Pedido: ${orderr.key}")
        println("Valor: ${orderr.value}")
    }

    orders[4] = 70.0
    orders.put(5, 80.0)
    orders[1] = 100.0
    println(orders)

    orders.putIfAbsent(6, 200.0)
    println(orders)
    orders.putIfAbsent(6, 300.0)
    println(orders)

    orders.remove(6, 200.0)
    println(orders)
}


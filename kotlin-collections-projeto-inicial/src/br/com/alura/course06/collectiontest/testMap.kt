package br.com.alura.course06.collectiontest

fun testMap(){


//    val orders = mapOf(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0)
    val orders = mutableMapOf(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0)

    println(orders)

    val order = orders[1]

    order?.let {
        println("order: $it")
    }

    orders.forEach {
        println("-----------------------")
        println("Order: ${it.key}")
        println("Price: ${it.value}")
    }

    orders[4] = 70.0
    orders.put(5, 80.0)
    println(orders)
    orders.put(1, 100.0)
    println(orders)
    orders.putIfAbsent(6, 200.0)
    println(orders)
    orders.putIfAbsent(6, 300.0)
    println(orders)

    orders.remove(6)
    println(orders)

    val filteredMap = orders.filter { it.value < 100.0 }
    println(filteredMap)

    val containsInTheMap = orders.contains(8)
    println(containsInTheMap)

}
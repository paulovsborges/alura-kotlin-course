package br.com.alura.collectiontest

fun testMapBehaviors(){

    val orders = mutableMapOf<Int, Double>(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0, 4 to 100.0, 5 to 100.0, 6 to 80.0)

    val getOrder = orders.get(5)
    println(getOrder)

    val getOrElseOrders = orders.getOrElse(
            0,
    ) {
        "there was an error"
    }
    val getOrDefaultOrders = orders.getOrElse(
            0,
    ) {
        -1.0
    }

    println(getOrElseOrders)
    println(getOrDefaultOrders)

    println(orders.keys)
    println(orders.values)

    orders.keys.forEach {
        println("Orders: $it")
    }

    orders.values.forEach {
        println("values: $it")
    }

    val pairsNumbers = orders.filter {(key, value) ->
        key % 2 == 0 && value > 50.0
    }

    println(pairsNumbers)

    val filterValues = orders.filterValues {
        it > 50.0
    }

    println(filterValues)

    val filterKeys = orders.filterKeys {
        it % 2 == 0
    }

    println(filterKeys)

    println("-==========================================")
    println(orders + Pair(7, 90.0))
    println(orders + mapOf(7 to 90.0, 8 to 20.0))
    println(orders)

    println(orders - 6)
    println(orders - listOf(6, 5))
    println(orders)

    orders.putAll(setOf(7 to 90.0, 8 to 20.0))
    println(orders)

    orders += setOf(7 to 50.0, 8 to 30.0)
    println(orders)


    orders.keys.remove(1)
    println(orders)

    orders.values.remove(50.0)
    println(orders)

    orders.values.remove(100.0)
    println(orders)

    orders -= 6
    println(orders)


}

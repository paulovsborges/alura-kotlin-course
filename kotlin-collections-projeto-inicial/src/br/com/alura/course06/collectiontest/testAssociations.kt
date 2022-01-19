package br.com.alura.course06.collectiontest

data class Order(val number: Int, val value: Double)

fun testAssociations (){

    val orders = listOf(

            Order(1, 20.0),
            Order(2, 60.0),
            Order(3, 30.0),
            Order(4, 70.0),
            Order(5, 40.0),
    )

//    val ordersMapped : Map<Int, Order> = orders.associate { order ->
//
//        Pair(order.number, order)
//
////        or
////        order.number to order
//    }

    val ordersMapped: Map<Int, Order> = orders.associateBy { order ->
        order.number
    }

    println(orders)
    println(ordersMapped)

    val orderFreeShipping: Map<Order, Boolean> = orders.associateWith { order ->
        order.value > 50.0
    }

    println("free shipping or not")
    println(orderFreeShipping)

    println("This order has free shipping? ${orderFreeShipping[Order(1, 20.0)]}")


    /**
     * This will return just the last element that matches with each return type,
     * meaning that will give us just the last matched with true and false
     */
    val map: Map<Boolean, Order> = orders.associateBy { order ->

        order.value > 50.0
    }
//    println(map)

    val ordersFreeShippingGrouped: Map<Boolean, List<Order>> = orders.groupBy { order ->

        order.value > 50.0

    }

    println(ordersFreeShippingGrouped)
    println(ordersFreeShippingGrouped[true])

    val names = listOf("Alex", "Fran", "Gui", "Ana", "Paulo", "Maria", "Mario", "Gisele")

    val schedule: Map<Char, List<String>> = names.groupBy { name ->
        name.first()
    }

    println(schedule)
    println(schedule['A'])

}
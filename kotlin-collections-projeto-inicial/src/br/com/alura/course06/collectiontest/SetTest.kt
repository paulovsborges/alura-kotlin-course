package br.com.alura.course06.collectiontest

fun testSet() {

    val listWatchedAndroid: Set<String> = setOf("Alex", "Gui", "Fran", "Maria")
    val listWatchedKotlin: Set<String> = setOf("Alex", "Paulo", "Maria")

    val watchedBoth = mutableSetOf<String>()
    watchedBoth.addAll(listWatchedAndroid)
    watchedBoth.addAll(listWatchedKotlin)
    watchedBoth.add("Gui")
    watchedBoth.add("Ana")
    watchedBoth.add("Ana")

    println(watchedBoth)

    println(listWatchedAndroid union listWatchedKotlin)
    println(listWatchedAndroid subtract listWatchedKotlin)

    println(listWatchedKotlin intersect listWatchedAndroid)

    val watchedList = watchedBoth.toMutableList()

    watchedList.add("Alex")
    println(watchedList.toSet())

}
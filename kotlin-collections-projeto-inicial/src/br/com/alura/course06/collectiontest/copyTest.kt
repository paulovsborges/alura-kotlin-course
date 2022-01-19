package br.com.alura.course06.collectiontest

fun copyTest() {
    val bank = NamesBank()

    val nameSaved = bank.names

    bank.save(listOf("Alex", "Paulo", "Gui"))

    println(nameSaved)
}

class NamesBank {

    val names: Collection<String> = data

    fun save(name: List<String>) {

        name.forEach {
            data.add(it)
            println(it)
        }
    }

    companion object{
        private val data = mutableListOf<String>()
    }
}

fun collectionsTest() {
    val names: Collection<String> = mutableListOf("Alex", "Fran", "Gui")

    for (name in names.iterator()) {
        println(name)
    }
    println("tem o nome alex? ${names.contains("Alex")}")
    println("Tamanho da lista: ${names.size}")
}
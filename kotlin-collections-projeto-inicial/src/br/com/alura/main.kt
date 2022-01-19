package br.com.alura

fun main() {
    val myFunctionLambda : () -> Unit = {
        println("execute as lambda")
    }

    println(myFunctionLambda())

    val anonymousFunction : () -> Unit = fun () { println("execute as anonymous")}
    println(anonymousFunction())
}


fun testFunctionClass() {

    val myFunctionClass: () -> Unit = Test()
    println(myFunctionClass())

}

fun testFunctionReference() {

    val myFunction: () -> Unit = ::test

    println(myFunction())
}

fun test() {
    println("execute test")

}

class Test : () -> Unit {

    override fun invoke() {
        println("execute test invoke")
    }
}


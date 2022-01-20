package br.com.alura

fun main() {
//
//    testFunctionClass()
//    testFunctionReference()


    val myFunctionLambda: (Int, Int) -> Int = { a, b ->
        a + b
    }

    println(myFunctionLambda(15, 10))

    val anonymousFunction: (Int, Int) -> Int = fun(a, b): Int {
        println("execute as anonymous")
        return a + b
    }
    println(anonymousFunction(20, 10))

    val calculateBonus: (salary: Double) -> Double = lambda@{salary ->

        if (salary > 1000.0) {
            return@lambda salary + 50
        }
        salary + 100.0
    }

    println(calculateBonus(1100.0))

    val calculateBonusAnonymous : (salary: Double ) -> Double = fun(salary): Double{
        if(salary > 1000.0) return salary + 50
        return salary + 100.0
    }

    println(calculateBonusAnonymous(1100.0))
}

fun testFunctionClass() {

    val myFunctionClass: (Int, Int) -> Int = PlusSum()
    println(myFunctionClass(10, 10))

}

fun testFunctionReference() {

//    val myFunction: () -> Unit = ::plusSum
    val myFunction: (Int, Int) -> Int = ::plusSum

    println(myFunction(5, 10))
}

fun plusSum(a: Int, b: Int): Int {
    return a + b
}

class PlusSum : (Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int): Int {
        return p1 + p2
    }
}


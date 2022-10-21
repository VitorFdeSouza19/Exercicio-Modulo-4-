package com.example.exerciciomodulo4

import kotlin.time.DurationUnit

class FuncaoSoma {
}

fun main() {
    soma(5,6)
    val resultado = multiplicaCompacta(5,5)
    println(resultado)
    calculadora(4, 4, ::somaCalculadora)
    calculadora(4,4, ::multiplicaCalculadora)

}

fun soma(valor1: Int, valor2: Int) {
    var resultadoSoma = valor1 + valor2
    println(resultadoSoma)

}

fun multiplicaCompacta(val1: Int, val2: Int) = val1 * val2

fun somaCalculadora(soma1: Int, soma2: Int) = println(soma1 + soma2)
fun multiplicaCalculadora(mult1: Int, mult2: Int) = println(mult1 * mult2)
fun calculadora(numero1: Int, numero2: Int, adicao: (Int, Int) -> Unit) {
    adicao(numero1, numero2)


}
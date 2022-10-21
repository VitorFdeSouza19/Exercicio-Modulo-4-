package com.example.exerciciomodulo4

class ExercicioListaFiltro {
}

fun main() {
    val listNumber = listOf(1,2,3,4,5,6,7,8,9)
    val filtered = listNumber.filter{ it % 2 == 0 }
    println(filtered)

    val listaNomes = listOf("Vitor", "Vinicius", "Bianca", "Luiza")
    val saudacoes = listaNomes.map { "Olá $it" }
    println(saudacoes)

    listaNomes.forEach(){
        println(it)
    }

}









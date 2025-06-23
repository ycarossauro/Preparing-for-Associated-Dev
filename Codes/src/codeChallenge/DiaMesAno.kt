package codeChallenge

import java.time.LocalDate

fun main() {
    val entrada: String = readln()
    val (dia, mes, ano) = entrada.split("/").map { it.trim() }
    val hoje = LocalDate.now().year



    val mesPorExtenso  = when (mes.toInt()) {
        1 ->"Janeiro"
        2 ->"Fevereiro"
        3 ->"Março"
        4 ->"Abril"
        5 ->"Maio"
        6 ->"Junho"
        7 ->"Julho"
        8 ->"Agosto"
        9 ->"Setembro"
        10 ->"Outubro"
        11 ->"Novembro"
        12 ->"Dezembro"
        else -> "Mês Inválido!"
    }

try {
    if(ano.toInt() > hoje){
        throw IllegalArgumentException("Ano não pode ser maior que o atual")
    }

    println("${dia.padStart(2, '0')} de $mesPorExtenso de $ano")
}   catch (e: Exception){
    throw IllegalArgumentException("Data Inválida")
}

}
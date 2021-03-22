package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {
    // para digitar nome do banco colocar dentro do parentese ""
    val digiOneBank = Banco("DigiOne",12)

    //Podemos criar assim com atribuição direta do nome ( argumentos nomeados)
    //  val digiOneBank = Banco(nome = "DigiOne", numero = 12)

    // não conseguimos fazer set do nome em data class -  erro, pois uma vez instaciada espera ser imutavel
    // só poder ser mutada se alterar para var ( variavel) no caso data class Banco
    // digiOneBank.nome = "teste"

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    // podemos alterar com uma cópia o que queremos, no caso só nome do banco
    val banco2 = digiOneBank.copy(nome = "Banco2")
    // print normal com informações nome e  numero
    println(banco2.nome)
    println(banco2.numero)


    // print com funcão criada em banco com informações
    println(banco2.info())

}
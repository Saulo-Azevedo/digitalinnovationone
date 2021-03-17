package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "jether"
    var cpf: String = "123.456.789-11"
    private set

    constructor()

    fun pessoainfo() = "$nome e $cpf"
}

fun main(){
    val jether = Pessoa()

    println(jether.nome)
    println(jether.cpf)
    println(jether.pessoainfo())
}


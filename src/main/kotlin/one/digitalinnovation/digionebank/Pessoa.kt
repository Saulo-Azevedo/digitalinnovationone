package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "jether"
    var cpf: String = "123.456.789-11"
        private set
}

fun main(){
    val jether = Pessoa()
    var cpf = "1254"

    println(cpf)
    println(jether.nome)
    println(jether.cpf)
}

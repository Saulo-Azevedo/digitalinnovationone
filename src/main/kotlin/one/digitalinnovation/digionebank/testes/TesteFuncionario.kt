package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
    val jether = Pessoa(nome = "Jetther Rodrigues", cpf = "123.456.789-11")
    println(jether.nome)
    println(jether.cpf)

    val joao = Funcionario("Joao Silva","123456987-12", BigDecimal.valueOf(2000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}

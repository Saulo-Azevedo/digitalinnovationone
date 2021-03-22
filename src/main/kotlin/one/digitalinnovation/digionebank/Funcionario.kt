package one.digitalinnovation.digionebank

import java.math.BigDecimal
// usado quando temos val declarado na classe pessoa
/*
class Funcionario(
    override val nome: String,
    override val cpf: String,
    val salario: BigDecimal
):Pessoa(nome, cpf) {

}*/

class Funcionario(
    nome: String,
    cpf: String,
    val salario: BigDecimal
):Pessoa(nome, cpf) {

}
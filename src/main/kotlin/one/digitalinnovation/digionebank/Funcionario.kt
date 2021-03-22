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
// transformando uma classe em abstrata , aqui funcionario não uma isntancia , mas sim uma representação
// de funcionario
abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: BigDecimal
):Pessoa(nome, cpf) {
    // adicionado uma funcao de calculo de salario
    abstract fun calculoAuxilio():
}
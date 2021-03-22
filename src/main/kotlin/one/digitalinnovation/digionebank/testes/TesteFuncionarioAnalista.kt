package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main(){
    val joao = Analista("Joao Silva","123456987-12",2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}



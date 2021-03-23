package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val maria = Gerente("Maria do Carmo","123456987-12",5000.0,"senha123" )

    ImprimeRelatorioFuncionario.imprime(maria)

    TestAutenitcacao().autentica(maria)
}

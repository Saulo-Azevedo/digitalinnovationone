package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "Jose de Silva",
        cpf = "232.656.989-77",
        clienteTipo = ClienteTipo.PF ,
        senha = "123456"
    )
    println(jose)
    TestAutenitcacao().autentica(jose)
}
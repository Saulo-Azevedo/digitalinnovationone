package one.digitalinnovation.digionebank

// usar open para abrir a classe, permite que classe extenda e funcionario herde
/* usar open nas variaveis quandofor val
open class Pessoa(
    open val nome: String,
    open val cpf: String
)
*/
// com abstract ela passa ser uma classe mae
abstract class Pessoa(
    val nome: String,
    val cpf: String
)


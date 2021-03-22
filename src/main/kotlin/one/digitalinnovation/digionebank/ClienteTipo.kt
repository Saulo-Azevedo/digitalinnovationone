package one.digitalinnovation.digionebank

// com val dentrp de Cliente tipo consigo usar get em TestClienteTipoEnum passando ser uma propriedade
enum class ClienteTipo(val descricao: String) {
    PF("Pessoa Fisica"),
    PJ("Pessoa Juridica")

    // tipo companion object que nos dá opcao de funcoes estaticas acessadas via classe
    // e não via instancia de objeto

    //companion object {
    //
    //}
}
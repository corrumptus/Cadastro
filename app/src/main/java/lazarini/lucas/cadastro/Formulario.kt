package lazarini.lucas.cadastro

class Formulario(
    private var nome: String,
    private var telefone: String,
    private var email: String,
    private var isInterested: Boolean,
    private var sexo: String,
    private var cidade: String,
    private var uf: String
) {
    override fun toString(): String {
        return """
            Nome: $nome
            Telefone: $telefone
            Email: $email
            Esta interessado: ${if (isInterested) "sim" else "nao"}
            Sexo: $sexo
            Cidade: $cidade
            UF: $uf
        """
    }
}
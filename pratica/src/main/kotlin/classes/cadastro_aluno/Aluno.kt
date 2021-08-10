package classes.cadastro_aluno

class Aluno(
    var RA: Int = 0,
    var nome: String = "",
    var sobrenome: String = ""
) {

    fun assistirAula(): String {
        return "Aluno $nome $sobrenome assistiu aula"
    }

    fun fazerLicao(): String {
        return "Aluno $nome $sobrenome fez a lição"
    }

}
package classes.cadastro_aluno

class Professor(var nome: String, var RD: Int) {

    init {
        darAula()
        fazerChamada()
    }

    fun darAula() {
        println("Dar Aula")
    }

    fun fazerChamada() {
        println("Fazer Chamada")
    }

}
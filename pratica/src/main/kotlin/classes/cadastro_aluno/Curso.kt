package classes.cadastro_aluno

class Curso(
    var nome: String,
    var listaDeAulas: List<Aula>,
    var listaDeAlunos: List<Aluno>,
    var professorResponsavel: Professor
)

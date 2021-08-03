package classes

class Aluno(var nome: String, var idade: Int) {

    var sobrenome: String = " "

    constructor(nome: String, idade: Int, sobrenome: String): this(nome, idade){
        this.sobrenome = sobrenome
    }
}
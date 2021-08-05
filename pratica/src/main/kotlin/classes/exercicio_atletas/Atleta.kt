package classes

class Atleta(var nome :String, var nivel: Int, var energia: Int ) {

}


class Prova(var dificuldadeDaProva: Int, var energiaNecessaria :Int){

    fun podeRealizar(atleta :Atleta) :Boolean{
        return atleta.nivel >= dificuldadeDaProva && atleta.energia >= energiaNecessaria
    }

}
package classes

class JogadorDeFutebol(
    var nome :String,
    var energia: Int,
    var alegria :Int,
    var gols: Int,
    var experiencia: Int ){


    fun fazerGols(){
        energia = energia - 5
        alegria = alegria + 10
        gols = gols + 1
        println("GOOOOOOOL!")
    }

    fun correr(){
        energia = energia - 10
        println("Cansei")
    }
}


class SessaoDeTreinamento(var experiencia :Int, ){

    fun treinarA(jogadorDeFutebol: JogadorDeFutebol){
        println("Experiencia Inicial: $experiencia")
        jogadorDeFutebol.correr()
        jogadorDeFutebol.fazerGols()
        jogadorDeFutebol.correr()
        experiencia++
        println("Experiencia Inicial: $experiencia")
    }
}
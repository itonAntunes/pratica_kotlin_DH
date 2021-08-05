package classes.exercicio_contribuicao

class Contrubuicao(var idade: Int, var sexo: Char, var tempoContribuicao: Int){


    fun aposentar(){
        if(sexo == 'm' ){
            if(idade > 65 && tempoContribuicao >= 30){
                print("true")
            }else{
                print("false")
            }
        }

        if(sexo == 'f' ){
            if(idade > 60 && tempoContribuicao >= 30){
                print("true")
            }else{
                print("false")
            }
        }
    }
}
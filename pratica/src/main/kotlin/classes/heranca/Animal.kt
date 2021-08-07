package classes.heranca

abstract class Animal {
    protected var tamanho: Int = 0
    var cor: String = ""
    var peso: Double = 0.0

    open fun alteraTamanho(tamanho: Int){
        if(tamanho > 3){
            print("Muito acima do normal")
        }else{
            this.tamanho = tamanho
        }
    }

    open fun correr(){
        println("Animal esta correndo")
    }

}
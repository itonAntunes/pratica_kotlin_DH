package classes.heranca

class Cachorro: Animal() {

   override  fun correr(){
       super.correr()
       println("Cachorro esta correndo")
   }

    override fun alteraTamanho(tamanho: Int){
        if(tamanho > 2){
            print("Muito acima do normal")
        }else{
            this.tamanho = tamanho
        }
    }
}
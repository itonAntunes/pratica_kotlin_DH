package classes

class Produto(var numeros: List<Int>){

    fun calcProduto(): Int{
        var produto: Int = 1
         for (num in numeros){
             produto *= num
        }
        return produto
    }
}
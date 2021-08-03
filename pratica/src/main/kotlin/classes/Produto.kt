package classes

class Produto(var numeros: List<Int>){

    fun calcProduto(): Int{
        var valor: Int = 1
         for (num in numeros){
             valor *= num
        }
        return valor
    }
}
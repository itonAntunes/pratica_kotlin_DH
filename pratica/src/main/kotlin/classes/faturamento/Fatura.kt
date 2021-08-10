package classes.faturamento

class Fatura(var itens :List<Item>) {
    var total = 0.0;

    fun totalDaFatura(): Double{
        for(item in itens){
            total += item.quantidade * item.preco
        }
        return total
    }
}
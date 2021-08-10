package classes.faturamento

fun main() {

    var items = listOf<Item>(
    Item(9878, "Chá de camomila",4,66.89),
    Item(34234, "colher",7,96.89),
    Item(345634, "faca",5,36.89),
    )

    val fatura = Fatura(items)
    val resultado = fatura.totalDaFatura()

    print("O total faturado é de R\$: $resultado")
}
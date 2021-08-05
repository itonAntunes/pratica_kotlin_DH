package classes

fun main() {
    var seuBarriga = Atleta(" Sr Barriga",9,15)
    var zecaTatu = Atleta(" Zeca Tatu",34,97)

    println("Prova1")
    var prova1 = Prova(2,5)
    println(seuBarriga.nome + " Esta apto? " + prova1.podeRealizar(seuBarriga))
    println(zecaTatu.nome + " Esta apto? " + prova1.podeRealizar(zecaTatu))
    println("")

    println("Prova2")
    var prova2 = Prova(17,23)
    println(seuBarriga.nome + " Esta apto? " + prova2.podeRealizar(seuBarriga))
    println(zecaTatu.nome + " Esta apto? " + prova2.podeRealizar(zecaTatu))
    println("")

    println("Prova3")
    var prova3 = Prova(99,89)
    println(seuBarriga.nome + " Esta apto? " + prova3.podeRealizar(seuBarriga))
    println(zecaTatu.nome + " Esta apto? " + prova3.podeRealizar(zecaTatu))
}
package classes

class Cliente(var nome :String, var sobrenome :String) {


}

class Conta(var numeroDaconta : Int, var saldo :Int, var titular :Cliente){


    fun deposito(quantiaDeDinheiro :Int){
        saldo = saldo + quantiaDeDinheiro
        println("Deposito - Saldo: $saldo")
    }

    fun saque(quantiaDeDinheiro :Int){
        if(quantiaDeDinheiro > saldo){
            print("Saldo insuficiente")
        }else{
            saldo = saldo - quantiaDeDinheiro
            println("transação Realizada - Saldo $saldo")
        }
    }
}
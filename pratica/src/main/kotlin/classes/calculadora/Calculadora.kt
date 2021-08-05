package classes.calculadora

class Calculadora(var num1: Int, var num2: Int) {

    //classe com um metodo que retorna a propria classe possibilidando
    // chamar outro metodo a partir do retorno

    var resultado = 0

    fun soma(): Calculadora {
        resultado = num1 + num2
        return this
    }

    fun subtracao(): Calculadora {
        resultado = num1 - num2
        return this
    }

    fun multiplicacao(): Calculadora {
        resultado = num1 * num2
        return this
    }

    fun dividao(): Calculadora {
        if(num1 == 0 || num2 == 0){
            resultado = 0
            return this
        }else{
            resultado = num1 / num2
            return this
        }

    }

    fun print(){
        print(resultado)
    }
}
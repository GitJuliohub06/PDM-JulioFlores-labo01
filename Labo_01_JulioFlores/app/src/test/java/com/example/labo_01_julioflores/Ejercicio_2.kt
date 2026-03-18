package com.example.labo_01_julioflores

import org.junit.Test

/*
### Ejercicio 2: Una nueva marca de calculadoras?

Crea una clase `Calculadora` teniendo en cuenta su marca, años de vida (Ambos inmutables)
y su precio. Como toda calculadora, debe hacer lo básico, sumar, restar, multiplicar, dividir.
Como vamos a lanzar esta calculadora al mercado, necesitamos que no salga con errores… curiosos.

*/


class ejercicio2{

    data class calculadora (val marca: String, val yearsVida: Int, var precio: Double){

        fun sumar(a: Double, b: Double){
            val resultado = a+b
            println(resultado)
        }

        fun restar(a: Double, b: Double){
            val resultado = a-b
            println(resultado)
        }

        fun multiplicar(a: Double, b: Double){
            val resultado = a*b
            println(resultado)
        }

        fun dividir(a: Double, b: Double){
            if (b==0.0){
                println("No puedes dividir entre 0")
            }else{
                val resultado = a/b
                println(resultado)
            }

        }

    }



    @Test
    fun main(){
        val TI = calculadora("Texas Instruments", 5, 150.00)

        println("Probando la suma con 2 + 4")
        TI.sumar(2.0,4.0)
        println()

        println("Probando la resta con 2 - 4")
        TI.restar(2.0,4.0)
        println()

        println("Probando la multiplicacion con 2 * 4")
        TI.multiplicar(2.0,4.0)
        println()

        println("Probando la division entre 0, 2/0")
        TI.dividir(2.0,0.0)
        println()

        println("Probando la division con 2/4")
        TI.dividir(2.0,4.0)
        println()


    }


}



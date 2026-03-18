package com.example.labo_01_julioflores

import org.junit.Test

/*
* ### Ejercicio 1: Creando una computadora

*  Crea una clase `Computadora` donde especifiques sus componentes,
*  incluyendo una función de encender computadora y apagar computadora. La
*  computadora puede actualizarse, podemos cambiar su RAM y su espacio de memoria,
*  incluso podemos cambiar su sistema operativo. Ya montada
*  tenemos una lista de  `ProgramasInstalados`, pero solo me interesan
*  los programas con fecha de este año. (Se crea una lista de
*  programas donde su nombre contenga un año: Notion 2026,
*  Facebook 2024, etc.)
* */


class ejercicio{

    data class computadora (val marca:String, val modelo: String, var Procesador: String, var grafica: String, var RAM: Int, var Almacenamiento: Int, var SO: String){

        fun encenderComputadora(){
            println("Bienvenido Usuario :D")
        }

        fun apagarComputadora(){
            println("Adiós lindo Usuario :D")
        }

        fun actualizarRAM(nuevaRAM: Int){
            val RAMAntigua = RAM
            RAM = nuevaRAM
            println("Has realzado el cambio de $RAMAntigua GB, a $nuevaRAM GB en tu memoria RAM")
        }

        fun actualizarAlmacenamiento(nuevaAlmacenamiento: Int){
            val AlmacenamientoAntiguo = Almacenamiento
            Almacenamiento = nuevaAlmacenamiento
            println("Has realizado el cambio de $AlmacenamientoAntiguo GB, a $nuevaAlmacenamiento GB en tu almacenamiento")
        }

        fun actualizarSO(nuevoSO: String){
            val SOAntiguo = SO
            SO = nuevoSO
            println("Has realizado el cambio de $SOAntiguo , a $nuevoSO  :)")
        }

        val programasInstalados = listOf("Notion 2026", "Facebook 2024", "Arc raiders 2026", "Apex Legends 2026", "Minecraft 1546")

        fun imprimirProgramasEsteYear(yearInteres: String){
            println("Lista de programas del año $yearInteres")
            println()
            println(programasInstalados.filter { it.contains(yearInteres) })
            println()
        }

    }



    @Test
    fun main(){
        val computadora1 = computadora("Asus", "ROG Zephyrus", "Intel core i7", "Nvidia RTX 5070ti", 128, 1000, "Windows 11 pro")

        println("-----Datos de la computadora inicialmente-----")
        println(computadora1)
        println()

        //Probando las funciones

        println("Funcion de encender computadora")
        computadora1.encenderComputadora()
        println()


        println("Funcion de apagar computadora")
        computadora1.apagarComputadora()
        println()


        println("Funcion de actualizar RAM")
        computadora1.actualizarRAM(256)
        println()


        println("Funcion de actualizar el almacenamiento")
        computadora1.actualizarAlmacenamiento(2000)
        println()


        println("Funcion de actualizar SO")
        computadora1.actualizarSO("Linux")
        println()

        println("Funcion de ver programas de este año")
        computadora1.imprimirProgramasEsteYear("2026")
        println()

        println("-----Datos de la computadora al final-----")
        println(computadora1)
        println()

    }


}



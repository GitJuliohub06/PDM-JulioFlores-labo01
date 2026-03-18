package com.example.labo_01_julioflores

import org.junit.Test

/*
### Ejercicio 3: Pasando lista

Crea una clase `Estudiante` donde se tome en cuenta el nombre del estudiante, carnet y asignatura,
en la asignatura de Programación de Dispositivos Móviles se han añadido 3 estudiantes y en
Análisis numérico 4, todos almacenados en una lista llamada `Ciclo01` . Como docente quiero saber
quién se encuentra en la materia de Dispositivos Móviles únicamente.

*/


class Ejercicio3{

    data class Estudiante (val nombre: String, val carnet: String, val asignatura: String)

    @Test
    fun main(){
        val ciclo01 = listOf(
            Estudiante("Julio Flores","00018824", "Programación de Dispositivos Móviles"),
            Estudiante("Andrea Alvarez","00072342", "Programación de Dispositivos Móviles"),
            Estudiante("Cesar Chiquillo","00032324", "Programación de Dispositivos Móviles"),
            Estudiante("luis Amilcar","0002365", "Análisis numérico"),
            Estudiante("Colocho Rodriguez","000012345", "Análisis numérico"),
            Estudiante("Pablo Alfaro","00067676", "Análisis numérico"),
            Estudiante("Clavito Portillo","00030055", "Análisis numérico")
        )

        println("------Lista de datos iniciales------")
        println()
        ciclo01.forEach { println(it) }
        println()

        println("------Lista de estudiantes en Programación de Dispositivos Móviles")
        println()
        ciclo01.filter { it.asignatura =="Programación de Dispositivos Móviles" }.forEach { estudiante -> println(estudiante) }
        println()

        println("------Lista de estudiantes en Análisis numérico")
        println()
        ciclo01.filter { it.asignatura =="Análisis numérico" }.forEach { estudiante -> println(estudiante) }
        println()



    }


}



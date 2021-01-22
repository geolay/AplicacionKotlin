package com.example.myapplicationkotlin2

import java.text.DecimalFormat

fun main() {

    var libro1 = LibrosEscolaress(
        "El AVION",
        881323508842008 ,
        2008,
        "Plumifera",
        414,
        25200,
        "Juan Gaviota",
        'I'
    )
    var libro2 = LibrosEscolaress(
        "El AUTO",
        34567891232000 ,
        2000,
        "PioPio",
        210,
        11200,
        "Juan Audi",
        'D'
    )
    var libro3 = LibrosEscolaress(
        "LA BICICLETA",
        12345678912010 ,
        2010,
        "La Rueda",
        220,
        25000,
        "Sergio Cadena",
        'I'
    )
    var libro4 = LibrosEscolaress(
        "EL METRO",
        76565434222020 ,
        2020,
        "Metrópolis",
        410,
        25800,
        "Ester Line",
        'D'
    )

     libro1.imprimir()
     libro2.imprimir()
     libro3.imprimir()
     libro4.imprimir()


}

data class LibrosEscolaress( var nombreLibro: String, var isbn: Long, var yearLibro: Int, val editorial: String
    , var totalPaginas: Int, var precioLibro: Int, val autorLibro: String, val tipoLibro: Char)

    fun precioFormateado(precioLibro: Int): String {
        val dec = DecimalFormat("#,###.##")
        return "$ ${precioLibro.dec()}"

    }

    fun LibrosEscolaress.imprimir() {
        println("Nombre del libro: ${this.nombreLibro}")
        println("ISBN: ${this.isbn}")
        println("Año publicación: ${this.yearLibro}")
        println("Editorial: ${this.editorial}")
        println("Cantidad de páginas: ${this.totalPaginas}")
       // println("Precio: $ ${this.precioLibro}")
        println("Precio: ${precioFormateado(this.precioLibro)}")
        // println("Precio : ${precioLibro.dec()}")
        println("Autor del libro: ${this.autorLibro}")
           when (this.tipoLibro) {
                'D' -> println("Tipo de libro: Digital")
                else -> println("Tipo de libro: Impreso")
            }
        println("***** ***** ***** ***** ******")
        }

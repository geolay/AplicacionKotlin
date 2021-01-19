package com.example.myapplicationkotlin2

import kotlin.contracts.Returns

// 1. Crear archivo “Main.kt” con la función main.
fun main() {
  //2.  Imprimir “Mi nombre es: {Nombre del alumno}".
  println("Mi nombre es Ernesto Olavarria")
  // 4. Imprimir la suma de las 3 variables.
  println("la suma $num1 + $num2 + $num3 es ${num1+ num2+ num3}")


// 7. Imprimir la cantidad de caracteres que tiene la variable String
// y modiﬁcar la variable char a otro valor distinto.
println("El largo del string ${palabra1} es:  ${palabra1.length}")
palabra2='Z'

//10. Imprimir los valores máximos que pueden almacenar las variables Byte y Short.

  println("El valor máximo Byte es :  $miNumeroByte")
  println("El valor máximo Short es :  $minumeroShort")

  // 11. Imprimir los valores mínimos que pueden almacenar las variables Int y Long.
  println("El valor mínimo de Int es :  $minumeroInt")
  println("El valor mínimo de Long es :  $minumerolong")

  // 12. Declarar una variable Boolean con true o false e imprimir su valor.
  var rombo: Boolean = true
  println("El valor de la variable Boolean es :  $rombo")

// 15. Desde la función main llamar a estas dos funciones de forma correcta.

  imprimiendoParametros("globo", "Aerostático")
  obtieneIva(12000)

}

// 3.  Declarar 3 variables numéricas con los valores 10, 20 y 30.
var num1:Int = 10
var num2:Int = 20
var num3:Int = 30

// 5. Declarar 1 variable String y otra variable Char
//  6. Asignarle el valor “Ark Reigen” a la variable String y “A” a la variable Char .
var palabra1: String = "Ark Reigen"
var palabra2: Char = 'A'

// 8. Declarar una variable de tipo Float de forma  explícita.
var numx = 42

//9.  Asignar un valor a la variable Float.
var miNumeroFloat: Float = 34.43F

var miNumeroByte: Byte = 127
var minumeroShort: Short = 32767
var minumeroInt: Int = -2147483648
var minumerolong: Long = 	-9_223_372_036_854_775_807

// 13. Crear una función llamada “imprimiendoParametros” que recibe 2
//     parámetros String y imprime el total de caracteres de los dos parámetros.

fun imprimiendoParametros(param1:String, param2:String){
   println("El primer parámetro es $param1")
  println("El segundo parámetro es $param2")
  println("El total de caracteres es ${param1.length + param2.length}")
}

// 14. Crear una función llamada “obtieneIVA” que //devuelve el valor del IVA (19%).

fun obtieneIva(boleta:Int){
  println("El monto de la boleta es $boleta")
  println("El valor del IVA es ${0.19*boleta}")

}

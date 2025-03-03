

/*

fun main() {

   var cantidad20 = 0
   var cantidad50 = 0
   var cantidad100 = 0
   var cantidad200 = 0
   var cantidad500 = 0

   while (true) {
       println(
           """
           INGRESA UNA OPCIÓN
           1. Agregar una moneda de las denominaciones indicadas
           2. Contar cuántas monedas de cada denominación
           3. Calcular el total de dinero ahorrado
           4. Romper la alcancía vaciando su contenido
           5. Salir
       """.trimIndent()
       )

       val opcion = readln().toInt()

       when (opcion) {
           1 -> {
               println("Ingresa la denominación de la moneda (20, 50, 100, 200, 500):")
               val denominacion = readln().toInt()
               when (denominacion) {
                    20 -> cantidad20++
                        50 -> cantidad50++
                         100 -> cantidad100++
                             200 -> cantidad200++
                                 500 -> cantidad500++
                   else -> println("Denominación no válida.")
               }
               println("Se ha agregado una moneda de $$denominacion.")
           }
           2 -> {
               println("Conteo de monedas:")
               println("Monedas de \$20: $cantidad20")
               println("Monedas de \$50: $cantidad50")
               println("Monedas de \$100: $cantidad100")
               println("Monedas de \$200: $cantidad200")

               println("Monedas de \$500: $cantidad500")
           }
           3 -> {
                        val total = (cantidad20 * 20) + (cantidad50 * 50) + (cantidad100 * 100) +
                        (cantidad200 * 200) + (cantidad500 * 500)
               println("Total ahorrado: $$total")
           }
           4 -> {
                         val total = (cantidad20 * 20) + (cantidad50 * 50) + (cantidad100 * 100) +
                       (cantidad200 * 200) + (cantidad500 * 500)
               println("Se ha roto la alcancía. Total ahorrado: $$total")

               cantidad20 = 0
               cantidad50 = 0
               cantidad100 = 0
               cantidad200 = 0
               cantidad500 = 0
           }
           5 -> {
               println("Saliendo del programa.")
               return
           }
           else -> println("Esta opción no esta")
       }
   }
}


 */


/*

fun main() {



    fun main() {
        val tiradas = 10
        var puntosDado1 = 0
        var puntosDado2 = 0

        for (i in 1..tiradas) {
            val tiradaDado1 = lanzarDado()
            val tiradaDado2 = lanzarDado()

            println("Tirada $i: Dado 1 = $tiradaDado1, Dado 2 = $tiradaDado2")

            puntosDado1 += tiradaDado1
            puntosDado2 += tiradaDado2
        }

        println("Puntos totales Dado 1: $puntosDado1")
        println("Puntos totales Dado 2: $puntosDado2")

        when {
            puntosDado1 > puntosDado2 -> println("El Dado 1 gana!")
            puntosDado2 > puntosDado1 -> println("El Dado 2 gana!")
            else -> println("¡Es un empate!")
        }
    }

    fun lanzarDado(): Int {
        return Random.nextInt(1, 7)
    }


}

 */

import kotlin.random.Random

fun main() {
    println("Apuesta todo tú sueldo aquí (No hay devoluci9nes")
    print("Cuanto quieres apostar? y por que tan poco?perro: ")

    var dinero = readLine()!!.toDouble()

    while (true) {
        val numeroAleatorio = Random.nextInt(1, 4)
        println("Número Random : $numeroAleatorio")

        if (numeroAleatorio == 3) {
            println("Saco tres perdio todo, pero siga intentando.")

        } else if (numeroAleatorio == 2) {
            dinero /= 2

            println("Ushh se quedo con la mitad de lo que tenia: $dinero")

        } else {
            dinero *= 2

            println("Ganoooo, duplico sus lukas, siga jugando : $dinero")
        }

        print("QUieere seguir perdiendo o ganando? (si/no/si): ")

        val respuesta = readLine()

        if (respuesta != "si") {


            println("Gracias por dejar money en mi casino, gano: $dinero")

        }

    }
}
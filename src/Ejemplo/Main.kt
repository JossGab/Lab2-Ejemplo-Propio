import Ejemplo.Tiburon
import Ejemplo.PezPayaso
import java.util.Scanner

fun crearPeces() {
    val tiburon = Tiburon()
    val pezPayaso = PezPayaso()

    println("Bienvenido al Acuario. Elige qué pez quieres ver en acción:")
    println("1. Tiburón")
    println("2. Pez Payaso")

    val scanner = Scanner(System.`in`)
    val opcion = scanner.nextInt()

    when (opcion) {
        1 -> {
            println("Has elegido: ${tiburon.nombre}")
            println("Color: ${tiburon.color}")
            tiburon.comer()
        }
        2 -> {
            println("Has elegido: ${pezPayaso.nombre}")
            println("Color: ${pezPayaso.color}")
            pezPayaso.comer()
        }
        else -> {
            println("Opción no válida.")
        }
    }
}

fun main() {
    crearPeces()
}

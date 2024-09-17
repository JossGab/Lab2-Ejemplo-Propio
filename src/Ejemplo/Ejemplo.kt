package Ejemplo

abstract class Pez {
    abstract val color: String
    abstract val nombre: String
}

interface AccionPez {
    fun comer()
}

class Tiburon : Pez(), AccionPez {
    override val color = "gris"
    override val nombre = "Tiburón"

    override fun comer() {
        println("El Tiburón está cazando y comiendo peces")
    }
}

class PezPayaso : Pez(), AccionPez {
    override val color = "dorado"
    override val nombre = "Pez Payaso"

    override fun comer() {
        println("El Pez Payaso está comiendo algas")
    }
}

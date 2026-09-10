fun main() {

    // Operaciones basicas
    var clientes = 10

    clientes = 8

    clientes = clientes + 3
    clientes += 7
    clientes -= 3
    clientes *= 2
    clientes /= 3

    println(clientes)

    // Declaracion de variables e imprimir por pantalla
    val d: Int

    d = 3

    val e: String ="hello"

    println(d)
    println(e)

    /* Tipo de declaraciones correctas
    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n' */

    val soloLeerFormas = listOf<String>("triangulo", "cuadrado", "circulo")
    println(soloLeerFormas)

    println("El primer item de la lista es: ${soloLeerFormas[0]}")
    println("El primer item de la lista es: ${soloLeerFormas.first()}")
    println("Esta lista tiene ${soloLeerFormas.count()} items")
    println("circulo" in soloLeerFormas)

    val formas: MutableList<String> = mutableListOf("triangulo", "cuadrado", "circulo")
    println(formas)

    formas.add("pentagono")
    println(formas)

    //formas.remove("pentagono")
    //println(formas)

    // SET (Muestra solo 1 caracter si esta duplicado)
    val soloLeerFruta = setOf("manzana", "pera", "sandia", "Melon")
    println(soloLeerFruta)

    println("Tiene ${soloLeerFruta.count()} items")
    println("manzana" in soloLeerFruta)

    val fruta: MutableSet<String> = mutableSetOf("manzana", "pera", "sandia", "melon")
    fruta.add("naranja")
    println(fruta)

   // fruta.remove("naranja")
   //println(fruta)

    // MAP
    val soloLeerMenuJugo = mapOf("manzana" to 100, "kiwi" to 190, "naranja" to 100)
    println(soloLeerMenuJugo)

    println("El valor del jugo de manzana es: ${soloLeerMenuJugo["manzana"]}")
    println("El valor del jugo de piña es: ${soloLeerMenuJugo["piña"]}")

    val menuJugo: MutableMap<String, Int> = mutableMapOf("manzana" to 100, "kiwi" to 190, "naranja" to 100)
    println(menuJugo)
}
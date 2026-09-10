fun main() {

    // Hola Mundo

    println("Hola, Kotlin!")

    // Variables

    var myString = "Esto es una cadena de texto"
    myString = "Aqui cambio el valor de la cadena de texto"
    // myString = 6 Error
    println(myString)

    var myString2: String = "Esta es otra cadena de texto"
    println(myString2)

    var myInt = 7
    myInt = myInt + 4
    println(myInt)
    println(myInt - 1)

    println("Este es el valor de la variable myInt: $myInt")

    var numero: Int = 7
    numero = numero + 4
    println(numero)
    println(numero - 1)

    var myDouble = 6.5
    println(myDouble)

    myDouble = 6.0
    println(myDouble)

    var decimal: Double = 6.5
    println(decimal)

    var myFloat = 6.5f

    var myBool = false
    // myBool = true
    println(myBool)

    // Constantes

    val myConst = "Mi propiedad constante"
    // myConst = "Mi nueva propiedad constante" Error
    println(myConst)

    // Control de flujo

    myInt = 10
    myString = "Hola"

    if (myInt == 10 && myString == "Hola") {
        println("EL valor es 10")
    }else if (myInt == 11 || myString == "Hola") {
        println("EL valor es 11")
    } else {
        println("El valor es distinto de 10 y 11")
    }

    // Lista

    var myList = listOf<String>("Camilo", "Leiva", "HanzoHasashi25") // o mutableListOf
    println(myList[1])
    /* myList.add("Neira")
    println(myList)*/

    // Sets

    val mySet = setOf("Camilo", "Leiva", "HanzoHasashi25", "Camilo")
    println(mySet)

    val setPrueba = setOf("Camilo", "Leiva", "HanzoHasashi25", "Camilo")
    println(setPrueba)

    // Mapas

    val myMap = mutableMapOf("Camilo" to 27, "Constanza" to 27, "Jennifer" to 11)
    myMap["Nersi"] = 60
    println(myMap["Jennifer"])

    // Bluces

    for (value in myList) {
        println(value)
    }

    for (value in mySet) {
        println(value)
    }

    for (value in myMap) {
        println(value)
    }

    var myCounter = 0

    while (myCounter < myList.count()){
        println(myList[myCounter])
        myCounter++
    }

    // Opcionales

    var myOptional: String? = null
    println(myOptional)
    myOptional = "Mi cadena de texto opcional"
    println(myOptional)

    // Funciones
    myFunction()

    // Clases

    var myClass = MyClass("Camilo", 27)
    println(myClass.name)
}

fun myFunction() {
    println("Esto es una funcion")
}

// Clases

class MyClass(val name: String, val age: Int)
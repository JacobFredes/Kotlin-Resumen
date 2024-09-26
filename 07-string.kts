
//Declarar de forma Explícita
var myString1 : String = "Hola soy una cadena de texto"
println(myString1)

// Swift reconoce que lo que se ingresa es un texto por ende no es necesario declarar el tipo de variable
// Se recomienda no hacerlo para que sea menos código

var myString2 = "Hola de nuevo it's me"
println(myString2)

// ESCRIBIR STRING EN VARIAS LINEAS PERO CON SALTO DE LINEA (Se muestra en el tramo final (ver ojo de la terminal))

var myString3 = """
Bienvenidos al curso de Swift
Espero que os parezcan los String
un material entretenido de aprender
"""
println(myString3)

// STRING VACÍO

var myEmptyString = ""
//forma alternativa
var myEmptyString2 = String()

//FUNCIONES EN STRINGS
var texto1 = "Esto va a SER UN TEXTO"
var texto2 = "Esto va a SER UN TEXTO"
// Nos muestra el texto en minúscula
println(texto1.lowercase())
// Nos muestra el texto en mayúscula
println(texto1.uppercase())

// Función que busca contenido
val name1 = "Jacob"
val name2 = "Lucas"
val myContent = "Mi nombre es Lucas"
println(myContent.contains(name1)) // True o False

// Función para verificar si es un string vacío
val myEmptyString3 = ""
myEmptyString3.isEmpty() // Muestra true o false
myEmptyString3 == ""   // Forma sencilla

// Concatenación de varias strings
var myString5 = "Bienvenidos" + " " + "al curso de Swift"
// Concatenar Strings utilizando la variable (recordar que sea variable y no constante)
myString5 += " ¿Os está gustando la clase?"

// INTERPOLACIÓN CON OTRAS VARIABLES , CONSTANTES O FUNCIONES
val name = "Jacob"
val apellido = "Fredes"
val edad = 21

fun devolverEdad():Int{
    return 25
}
  // Forma estandar
println("Mi nombre es $name y mi apellido es $apellido")"Mi nombre es $name y mi apellido es $apellido"
  // forma simple
println("Mi nombre es " + name + " " + apellido)
  // forma utilizando String.format - cambias el tipo a string
println(String.format("Hola mi edad es la siguiente %d",edad))
  // Forma pasando a string la variable de forma explícita (Igual el sistema lo hace por detrás)
println("Mi nombre es " + name.toString())
  // Concatenar dentro de un string una función
println("la edad del mono es ${devolverEdad()}")
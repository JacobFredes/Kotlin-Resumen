// INTEGER TYPES
/*
 Integers are whole numbers with no fractional component, such as 42 and -23. Integers are either signed (positive, zero, or negative) or unsigned (positive or zero).

 Kotlin provides signed and unsigned integers in 8, 16, 32, and 64 bit forms. These integers follow a naming convention similar to C, in that an 8-bit unsigned integer is of type UInt8, and a 32-bit signed integer is of type Int32. Like all types in Swift, these integer types have capitalized names.

 */

//types of INT

var ejemplo1 : Byte = 127             // De -128 a 127
var ejemplo2 : Short = -32768         // De -32768 a 32767
var ejemplo3 : Int = -2.147.483.640   // De -2.147.483.648 a -2.147.483.647
var ejemplo4 : Long = 99999L          // De -9.223.372.036.854.775.808 a -9.223.372.036.854.775.807



// SIGNED NUMBERS MIN AND MAX
        val minInt = Int.MIN_VALUE
        val maxInt = Int.MAX_VALUE
println("El Int mínimo posible es $minInt")
println("El Int máximo posible es $maxInt")

// UNSIGNED NUMBERS 0 en adelante
        val minUInt = UInt.MIN_VALUE
        val maxUInt = UInt.MAX_VALUE
println("El UInt mínimo posible es $minUInt")
println("El UInt máximo posible es $maxUInt")

// SUMA DE INT CON FLOAT
var x = 18              // Forma Implícita Int
var a : Int = 20        // Forma Explícita
var y = 18.8            // Forma Implícita Double
var b : Double = 20.3   // Forma Explícita
var c : Float = 1.4f    // Forma Explícita

var sumaEnteros = x + 2
println(sumaEnteros)

var sumaFlotantes = y + 2.2
println(sumaFlotantes)

// En Kotlin no es necesario transformar el tipo cuando se trata de una suma de float o double con int ya que deja pero por buena practica es aconsejable hacerlo.
var suma = x + y
println(suma)
suma = x.toDouble() + y
println(suma)

//En el caso de la división lo mismo (Puede usarse FLOAT)
var division = x.toFloat()/5
println(division)

//Normalmente se usa Double ya que si lo pasamos a int desprecia la parte decimal y puede haber error en precision

// Convertir un String numérico a Int

 var numberExample = "123456"
println(numberExample.toInt())

/*
 TYPE  | SIZE  |                   MIN                 |                   MAX                    |
       |       |                                       |                                          |
 BYTE  |   8   |                 -128                  |                  127                     |
 SHORT |  16   |                 -32768                |                  32767                   |
 INT   |  32   |        -2.147.483.648 = (-2^31)       |        2.147.483.647 = (2^31 -1)         |
 LONG  |  64   | -9.223.372.036.854.775.808 = (-2^63)  |  -9.223.372.036.854.775.807 = (-2^63-1)  |

* */
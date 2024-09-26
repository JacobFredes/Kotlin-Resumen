/*
 Floating-Point Number
 Floating-point numbers are numbers with a fractional component, such as 3.14159, 0.1, and -273.15.

 Floating-point types can represent a much wider range of values than integer types, and can store numbers that are much larger or smaller than can be stored in an Int. Swift provides two signed floating-point number types:

 - Double represents a 64-bit floating-point number.
 - Float represents a 32-bit floating-point number.

 Note:

 Double has a precision of at least 15 decimal digits, whereas the precision of Float can be as little as 6 decimal digits. The appropriate floating-point type to use depends on the nature and range of values you need to work with in your code. In situations where either type would be appropriate, Double is preferred.
 */
//if you assign a literal value of 42 to a new constant without saying what type it is, Swift infers that you want the constant to be an Int, because you have initialized it with a number that looks like an integer:
val meaningOfLife = 42

// Likewise, if you don’t specify a type for a floating-point literal, Kotlin infers that you want to create a Double:
val pi = 3.14159

// SUMA DE INT CON FLOAT
var x = 18             // Forma Implicita Int
var a : Int = 20       // Forma Explicita
var y = 18.8           // Fprma Implicita Double
var b : Double = 20.3  // Forma Explicita
var c : Float = 1.4    // Forma Explicita

var sumaEnteros = x + 2
var sumaFlotantes = y + 2.2

// En Kotlin no es necesario transformar el tipo cuando se trata de una suma de float o double con int ya que deja pero por buena practica es aconsejable hacerlo.
var suma = x + y
println(suma)
suma = x.toDouble() + y
println(suma)

//En el caso de la división lo mismo (Puede usarse FLOAT)
var division = x.toFloat()/5
//Normalmente se usa Double
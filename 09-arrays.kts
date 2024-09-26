// Los arrays pueden ser de Int, Float, Char o inclusive Strings, pero solo deben contener un solo tipo

// FORMAS DE DECLARAR UN ARRAY
// 1-  FORMA EXPLÍCITA
//  nombre : tipo = arrayOf(elementos)
val meses:Array<String> = arrayOf("Enero","Febrero")
val notas:Array<Int> = arrayOf(7,3,5,10)

// 2- FORMA IMPLÍCITA
// El sistema determina el tipo en función a los elementos
val meses1 = arrayOf("Marzo","Abril")
val notas2 = arrayOf(9,0,9,7)

// 3 - FORMA ALTERNATIVA PARA EXPRESIONES LAMBDA
// nombre = Array (tamaño){valor para todos los elementos}
// Usando val se puede cambiar el contenido pero no el tamaño del array en si
val otraForma = Array(5){0}
println(otraForma[4])
otraForma[4] = 10
println(otraForma[4])

// 4 - FORMA DE DECLARAR UN ARRAY VACÍO
// Debemos usar la palabra reservada lateinit y si o si debe ser var
lateinit var arrayEmpty: Array<String>
// para inicializarlo debemos hacer lo siguiente
arrayEmpty = arrayOf("Casa", "Depto")
println(arrayEmpty.joinToString())

//            Index    0       1           2           3         4          5          6
val days = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
val numbers = arrayOf(1,2,3,4,5,6,7,8,9,10)
println(days[3])     // Accedemos al indice
println(numbers[9])

// Reemplazar un valor dentro del array
days[3] = "Nuevo valor"
println(days[3])

// Tamaño de array (Siempre arranca de 1) a diferencia del Index que arranca del 0
println(days.size)

// Ver contenido de un array sin usar FOR usando el método joinToString
println(days.joinToString())

//EJEMPLO
/*
- Crear un Array de números en string
- Cambiarlos a un array Int
- Sumarlos
- Mostrar tamaño del array, valores de cada uno y mostrar la suma*/

//Array de Strings
val args:Array<String> = arrayOf("5","10","9")
// map recorre el array, it representa un elemento, toInt() transforma ese elemento en Int, toIntArray transforma el array de String en un array de Int
val numeros = args.map { it.toInt() }.toIntArray()
// creamos una variable para sumar los elementos internos del array utilizando el método .sum()
val suma = numeros.sum()
// Lo que mostramos en pantalla
println("El tamaño del array numeros es ${numeros.size}")
for (numero in numeros){
    println("El número almacenado es ${numero}")
}
println("La suma de todos sus elementos es igual a $suma")

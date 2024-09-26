
var estudios = "Universitario" //String
var cedula = true            //Asignación Implicita
var libreria : Boolean = false   //Asignación Explicita

println(cedula || libreria) // true or false  = print true
println(cedula && libreria) // true and false = print false
println(!cedula)            // Invierte el resultado a false

// Utilizando booleanos en IF stataments
var salario = 1000
if (cedula) {
    salario = 9000 // Si Cedula is true muestra 9000
    println(salario)
}else{
    salario = 1000 // Si Cedula is false muestra 1000
    println(salario)
}

// Utilizando expresiones de comparación
var salario2 = 1000

if (salario2 > 2000){
    salario2 = 20000
    println(salario2)
}else if (salario2 < 2000){
    println("estas re pobre hermano")
}
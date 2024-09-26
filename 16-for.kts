// Bucle FOR
// Los ciclos for sirven para itinerar sobre una colección de datos items y ejecutar un bloque de código por cada uno de los items de la colección o rango

val days = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
// For para mostrar la posición
for (position in days.indices){
    println("Vuelta número $position")
}

// For para mostrar la posición y su valor
for ((position, value) in days.withIndex()){
    println("La posición $position contiene el valor $value")
}
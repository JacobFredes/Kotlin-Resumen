// LISTAS INMUTABLES (CON VALOR FIJO Y DETERMINADO)

val readOnly : List<String> = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
// El tamaño de una list coincide con el del array
println(readOnly.size)
// println(readOnly) = println(readOnly.toString()) los pasa al tipo necesitado
println(readOnly)
// Acceder a uno de sus indices
println(readOnly[0])
// primer valor y ultimo valor
println(readOnly.first())
println(readOnly.last())


// Filtrar en listas
// it es cada elemento de la lista
val example = readOnly.filter { it.contains("u")}
println(example)

// forma alternativa de recorrer una lista y con mejor legibilidad ya que se le da un nombre al elemento it para poder identificarlo de mejor forma
// version sin especificar it
// readOnly.forEach {println(it)}
// version especificando it
readOnly.forEach {weekDays -> println(weekDays)}

// LISTAS MUTABLES
// No hace falta inicializarla con valores , puede estar vacio
// var weekDays : MutableList<String> = mutableListOf()
val weekDays : MutableList<String> = mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
//Agregar nuevo valor (siempre lo hace al último
weekDays.add("Último")
println(weekDays)
//Agregar un valor en una posición (no sobrescribe si no que se ubica en esa y corre al resto a la derecha)
weekDays.add(0,"Primero")
println(weekDays)

//Como saber si una lista está vacía
if (weekDays.isEmpty()){
    println("La lista está vacía")
}else{
    weekDays.forEach{println(it)}
}

//Como saber si una lista no está vacía
if (weekDays.isNotEmpty()){
    weekDays.forEach{println(it)}
}

// Recorrer una lista utilizando for
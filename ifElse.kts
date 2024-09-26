// IF Else

val numero1 = "4"
val numero2 = "18"
val numero3 = ""

// Convertimos el string en en un posible Int or Null
val numeroResultado1 = numero1.toIntOrNull()
val numeroResultado2 = numero2.toIntOrNull()
val numeroResultado3 = numero3.toIntOrNull()


//FORMA DE REALIZAR UN IF NORMAL
if (numeroResultado1 == null){
    println("Ingrese un número no null")
}else if (numeroResultado1 > 18){
    println("Usted es mayor de edad")
}else if (numeroResultado1 < 18){
    println("Usted es menor de edad")
}else{
    println("Usted tiene 18 años")
}

//FORMA DE REALIZAR UN IF SIMPLIFICADA
if (numeroResultado2 == null)   println("Ingrese un número no null")
else if (numeroResultado2 > 18) println("Usted es mayor de edad")
else if (numeroResultado2 < 18) println("Usted es menor de edad")
else println("Usted tiene 18 años")

// Con resultado null
if (numeroResultado3 == null)   println("Ingrese un número no null")
else if (numeroResultado3 > 18) println("Usted es mayor de edad")
else if (numeroResultado3 < 18) println("Usted es menor de edad")
else println("Usted tiene 18 años")
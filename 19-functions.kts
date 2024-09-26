// FUNCIONES

// PREDEFINIDAS (Propias de kotlin que podemos usarlas tan solo invocandolas)
/* EJEMPLOS
println()  = imprime texto en la consola
maxOf()    = obtiene el máximo de dos valores
etc
 */

// PORPIAS (Creadas por el programador)

// MODIFICADORES DE ACCESO
/*
public = (nivel de acceso por defecto da igual ponerlo o no, se puede acceder desde afuera de la clase y desde cualquier parte del codigo sin ninguna restricción)

private = Limita solo la visibilidad al archivo o clase donde la función se haya definido

protected = Parecido al private pero permite el acceso desde subclases que heredan la función

internal = Restringe el acceso a cualquier parte del código dentro del mismo módulo

* */

//PALABRAS RESERVADAS
/*
open = indica que una función puede ser sobreescrita por una subclase (herencia)

final = prohibe la sobrescritura de una función aunque sea heredada por una subclase (Por defecto las funciones son final)

abstract = funciones que no tienen ninguna implementación

override = Indica que una función va a ser sobrescrita

operator = Permite una función sobrecargar un operador

infix = Permite que la función sea llamada sin () y sin . simplemente dejando un espacio y que sea de un solo parametro

inline = Sugiere al compilador que copie el código del cuerpo de una función para reducir la sobrecarga de creación de objetos.

tailrec = Indica que la función es recursiva de cola, la optimiza para evitar desbordamiento de pila

Suspend = Sirve para marcar funciones que pueden suspenderse (poner en pausa) y más adelante reanudadas.

* */
//ASIGNMENT OPERATOR

//The assignment operator (a = b) initializes or updates the value of a with the value of b:
var numero1 = 10
var numero2 = 5
numero1 = numero2
println( numero1)

// ARITHMETIC OPERATORS

println(1 + 2 )      // equals 3      + ADDITION
println(5 - 3  )     // equals 2      - SUBTRACTION
println(2 * 3 )      // equals 6      * MULTIPLICATION
println(10.0 / 2.5 ) // equals 4.0    / DIVISION
println(9 % 4)       // equals 1      % REMAINDER OPERATOR

//The addition operator is also supported for String concatenation:
println("hello " + "world")

// COMPOUND ASSIGNMENT OPERATORS
/*
 A list of all assignment operators:

 Operator    Example        Same As
    =         x = 5         x = 5
    +=        x += 3        x = x + 3
    -=        x -= 3        x = x - 3
    *=        x *= 3        x = x * 3
    /=        x /= 3        x = x / 3
    %=        x %= 3        x = x % 3
    x++       x += 1        x = x + 1
    x--       x -= 1        x = x - 1
*/
var c = 1
c += 2  // c = c + 2 the same
println(c)
c++ // Incremento de la variable
println(c)

// COMPARISON OPERATORS
/*Comparison operators are used to compare two values, and returns a Boolean value: either true or false.

Operator    Name                          Example
   ==        Equal to                     x == y
   !=        Not equal to                 x != y
   >         Greater than                 x > y
   <         Less than                    x < y
   >=        Greater than or equal to     x >= y
   <=        Less than or equal to        x <= y
   ===       Equal referencial            x === y (Si tienen la misma dirección del objeto en memoria dará true)
*/

// LOGICAL OPERATORS
//Logical operators are used to determine the logic between variables or values:

//Logical NOT OPERATOR
// (!a)  Reverse the result, returns false it was true

val allowedEntry = true
if (!allowedEntry) {
    println("ACCESS DENIED")
}else {
    println("Nothing")
}

//Logical AND  (a && b)
// The logical AND operator (a && b) creates logical expressions where both values must be true for the overall expression to also be true.
val enteredDoorCode = true
val passedRetinaScan = true
if (enteredDoorCode && passedRetinaScan) {
    println("Welcome!")
} else {
    println("ACCESS DENIED")
}

//Logical OR   (a || b)
//The logical OR operator (a || b) is an infix operator made from two adjacent pipe characters. You use it to create logical expressions in which only one of the two values has to be true for the overall expression to be true.

val hasDoorKey = false
val knowsOverridePassword = true
if (hasDoorKey || knowsOverridePassword) {
    println("Welcome!")
} else {
    println("ACCESS DENIED")
}

// COMBINING LOGICAL OPERATORS
// You can combine multiple logical operators to create longer compound expressions:

if ((enteredDoorCode && passedRetinaScan) || hasDoorKey || knowsOverridePassword) {
    println("Welcome!")
} else {
    println("ACCESS DENIED")
}

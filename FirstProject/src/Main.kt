//First of all, this project was created to follow the topics from W3Schools Kotlin Course/Topics

fun main(){
//    println("Hello World, my name is Leo. I have 25 years old (in the moment this code is being written).")
//    println("I'm learning Kotlin")
//    println("It is awesome to learn a new language")
//
//    println("We can also use math calculations like this: "  + (3 + 3))
//
//    print("We can also print without ln, but it will show the output in the same line. ")
//    print("Like this.")
//    println("")

//    We can use this double bars to use a single-line comment
//    Or we can also use a multi-line comment
//      For many lines we want
//
//
//    So now we're going to create variables
//
//
//
//    motor.ligar()
//    println("O motor está ${motor.status()}")
//    motor.desligar()
//    println("O motor está ${motor.status()}")
//
    val motor = MotorCombustao()
//    val fusca = Carro(motor)
//    fusca.ligar()
//    fusca.anda()
//    fusca.anda()
//    fusca.anda()

    val tesla = Carro(motor)
    tesla.ligar()
    tesla.anda()
}
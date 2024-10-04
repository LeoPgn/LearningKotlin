class Carro constructor(
    private val motor: Motor
){
    var cor: String? = null

    fun ligar(){
        println("Ligando o carro...")
        motor.ligar()
    }
    fun desligar(){
        println("Desligando o carro...")
        motor.desligar()
    }
    fun anda() {
        when {
            !motor.status() -> {
                println("Ligue o carro primeiro!")
            }
            !motor.temAutonomia() -> {
                println("Coloque combustível")
                motor.desligar()
            }
            else -> {
                motor.gastando()
                println("Carro em movimento")
            }
        }
    }
    fun freia(){
        println("Freio acionado")
    }
    fun buzina(){
        println("Buzina acionada")
    }
}
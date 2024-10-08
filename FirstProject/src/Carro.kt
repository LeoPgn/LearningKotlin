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
                when(motor) {
                    is MotorEletrico -> println("Bateria baixa")
                    is MotorCombustao -> println("Baixo combustível")
                }
            }
            else -> {
                motor.gastando()
                when(motor) {
                    is MotorEletrico -> println("Carro em movimento")
                    is MotorCombustao -> println("Carro em movimento com barulho")
                }

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
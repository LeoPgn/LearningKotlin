class MotorEletrico {

    private var ligado: Boolean = false
    private var nivelBateria: Boolean = false

    fun ligar(){
        ligado = true
    }
    fun desligar(){
        println("Motor desligado")
        ligado = false
    }
    fun status(): Boolean{
        return ligado
    }
}
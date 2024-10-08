abstract class Motor {
    private var ligado: Boolean = false

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
    abstract fun temAutonomia(): Boolean

    abstract fun gastando()
}
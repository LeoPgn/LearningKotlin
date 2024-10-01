class MotorCombustao {

    private var ligado: Boolean = false
    private var nivelCombustivel: Int = 2

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
    fun temCombustivel():Boolean{
        return nivelCombustivel > 0
    }
    fun gastandoCombustivel(){
        println("Gastando combustivel, nivel agora é: $nivelCombustivel")
        nivelCombustivel--
    }
}
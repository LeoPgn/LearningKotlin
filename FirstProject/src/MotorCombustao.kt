abstract class MotorCombustao : Motor(){

    private var ligado: Boolean = false
    protected var nivelCombustivel: Int = 2

    override fun temAutonomia(): Boolean {
        return nivelCombustivel > 0
    }

    abstract override fun gastando()
}

class MotorGasolina : MotorCombustao(){
    override fun gastando() {
        nivelCombustivel--
        println("Gastando combustivel, nivel agora é: $nivelCombustivel")
    }
}

class MotorAlcool : MotorCombustao(){
    override fun gastando() {
        nivelCombustivel -= 2
        println("Gastando combustivel, nivel agora é: $nivelCombustivel")
    }
}
class MotorCombustao : Motor(){

    private var ligado: Boolean = false
    private var nivelCombustivel: Int = 2

    override fun temAutonomia(): Boolean{
        return nivelCombustivel > 0
    }

    fun gastandoCombustivel(){
        println("Gastando combustivel, nivel agora é: $nivelCombustivel")
        nivelCombustivel--
    }

}
class MotorEletrico : Motor(){

    private var ligado: Boolean = false
    private var nivelBateria: Int = 2

    override fun gastando(){
        println("Gastando energia...")
        nivelBateria--
    }

    override fun temAutonomia(): Boolean {
        return nivelBateria > 0
    }

}
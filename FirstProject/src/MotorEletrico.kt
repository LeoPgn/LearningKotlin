class MotorEletrico : Motor(){

    private var ligado: Boolean = false
    private var nivelBateria = 1

    fun gastandoEnergia() {
        println("Gastando energia...")
        nivelBateria--
    }
    override fun temAutonomia(): Boolean{
        nivelBateria > 0
    }

}
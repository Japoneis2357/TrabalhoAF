public class FabricaFogo implements FabricaAbstrata {
    public Animal createAnimal() {
        return new AnimalFogo();
    }
    public Clima createClima() {
        return new ClimaFogo();
    }
}
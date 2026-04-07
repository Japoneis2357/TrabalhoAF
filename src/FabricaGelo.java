public class FabricaGelo implements FabricaAbstrata {
    public Animal createAnimal() {
        return new AnimalGelo();
    }
    public Clima createClima() {
        return new ClimaGelo();
    }
}
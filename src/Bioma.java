public class Bioma {
    private Clima clima;
    private Animal animal;

    public Bioma(FabricaAbstrata fabrica) {
        this.clima = fabrica.createClima();
        this.animal = fabrica.createAnimal();
    }

    public String emitirclima() {
        return this.clima.emitir();
    }

    public String emitiranimal() {
        return this.animal.emitir();
    }
}

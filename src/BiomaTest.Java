import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BiomaTest {

    @Test
    void deveEmitirClimaFogo() {
        FabricaAbstrata fabrica = new FabricaFogo();
        Bioma bioma = new Bioma(fabrica);
        assertEquals("Clima de Fogo", bioma.emitirclima());
    }

    @Test
    void deveEmitirClimaGelo() {
        FabricaAbstrata fabrica = new FabricaGelo();
        Bioma bioma = new Bioma(fabrica);
        assertEquals("Clima de Gelo", bioma.emitirclima());
    }

    @Test
    void deveEmitirAnimalFogo() {
        FabricaAbstrata fabrica = new FabricaFogo();
        Bioma bioma = new Bioma(fabrica);
        assertEquals("Animal de Fogo", bioma.emitiranimal());
    }

    @Test
    void deveEmitirAnimalGelo() {
        FabricaAbstrata fabrica = new FabricaGelo();
        Bioma bioma = new Bioma(fabrica);
        assertEquals("Animal de Gelo", bioma.emitiranimal());
    }
}
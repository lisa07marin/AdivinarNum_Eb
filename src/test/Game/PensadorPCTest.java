package Game;

import org.junit.Test;

import static org.junit.Assert.*;

public class PensadorPCTest {

    @Test
    public void test2CifrasCoincidentesEntre2Numeros() {
        PensadorPC pensadorPC = new PensadorPC();
        int resultado = pensadorPC.cifrasCoincidentes("1234", "4563");
        int esperado = 2;
        assertEquals(resultado, esperado);
    }

    @Test
    public void test0CifrasCoincidentesEntre2Numeros() {
        PensadorPC pensadorPC = new PensadorPC();
        int resultado = pensadorPC.cifrasCoincidentes("1234", "5678");
        int esperado = 0;
        assertEquals(resultado, esperado);
    }

    @Test
    public void test2CifrasCorrectasEntre2Numeros() {
        PensadorPC pensadorPC = new PensadorPC();
        int resultado = pensadorPC.cantidadCifrasBien("1234", "1243");
        int esperado = 2;
        assertEquals(resultado, esperado);
    }

    @Test
    public void test4CifrasCorrectasEntre2Numeros() {
        PensadorPC pensadorPC = new PensadorPC();
        int resultado = pensadorPC.cantidadCifrasBien("1234", "1234");
        int esperado = 4;
        assertEquals(resultado, esperado);
    }

    @Test
    public void test2CifrasLugarIncorrectoEntre2Numeros() {
        PensadorPC pensadorPC = new PensadorPC();
        int resultado = pensadorPC.cantidadCifrasRegulares("1234", "1243");
        int esperado = 2;
        assertEquals(resultado, esperado);
    }

    @Test
    public void test4CifrasLugarIncorrectoEntre2Numeros() {
        PensadorPC pensadorPC = new PensadorPC();
        int resultado = pensadorPC.cantidadCifrasRegulares("1234", "4321");
        int esperado = 4;
        assertEquals(resultado, esperado);
    }

    @Test
    public void test2CifrasLugarIncorrecto2CifrasLugarCorrecto() {
        PensadorPC pensadorPC = new PensadorPC();
        int resultado = pensadorPC.cantidadCifrasRegulares("1234", "2134");
        int esperado = 2;
        assertEquals(resultado, esperado);
        int resultado1 = pensadorPC.cantidadCifrasBien("1234", "2134");
        int esperado1 = 2;
        assertEquals(resultado1, esperado1);
    }
}
package Resources;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumeroSecretoTest {

    @Test
    public void testVereficarQueNumAleatorioTenga4Cifras() {
        NumeroSecreto numeroSecreto = new NumeroSecreto();
        int resultado = (numeroSecreto.numAleatorio4CifrasSinRepetirString()).length();
        int esperado = 4;
        assertEquals(resultado, esperado);
    }

    @Test
    public void testVerificarNumAleatorio4Cifras() {
        NumeroSecreto numeroSecreto = new NumeroSecreto();
        String resultado = numeroSecreto.numAleatorio4CifrasSinRepetirString();
        String resultado1 = numeroSecreto.numAleatorio4CifrasSinRepetirString();
        assertNotSame(resultado, resultado1);
    }

    @Test
    public void testVerificarCifraRepetida() {
        NumeroSecreto numeroSecreto = new NumeroSecreto();
        int[] numPrueba = {1, 2, 3};
        boolean resultado = numeroSecreto.cifraRepetida(numPrueba, 1);
        boolean esperado = true;
        assertEquals(resultado, esperado);
    }

    @Test
    public void testVerificarCifraRepetida1() {
        NumeroSecreto numeroSecreto = new NumeroSecreto();
        int[] numPrueba = {0};
        boolean resultado = numeroSecreto.cifraRepetida(numPrueba, 0);
        boolean esperado = true;
        assertEquals(resultado, esperado);
    }

    @Test
    public void testVerificarCifraRepetida2() {
        NumeroSecreto numeroSecreto = new NumeroSecreto();
        int[] numPrueba = {0, 1, 2};
        boolean resultado = numeroSecreto.cifraRepetida(numPrueba, 3);
        boolean esperado = false;
        assertEquals(resultado, esperado);
    }
}
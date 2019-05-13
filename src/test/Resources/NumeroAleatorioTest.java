package Resources;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumeroAleatorioTest {

    @Test
    public void testVereficarQueNumAleatorioTenga4Cifras() {
        NumeroAleatorio numeroAleatorio = new NumeroAleatorio();
        int resultado = (numeroAleatorio.numAleatorio4CifrasSinRepetirString()).length();
        int esperado = 4;
        assertEquals(resultado, esperado);
    }

    @Test
    public void testVereficarNumAleatorio4Cifras() {
        NumeroAleatorio numeroAleatorio = new NumeroAleatorio();
        String resultado = numeroAleatorio.numAleatorio4CifrasSinRepetirString();
        String resultado1 = numeroAleatorio.numAleatorio4CifrasSinRepetirString();
        assertNotSame(resultado, resultado1);
    }

    @Test
    public void testVerificarCifraRepetida() {
        NumeroAleatorio numeroAleatorio = new NumeroAleatorio();
        int[] numPrueba = {1, 2, 3};
        boolean resultado = numeroAleatorio.cifraRepetida(numPrueba, 1);
        boolean esperado = true;
        assertEquals(resultado, esperado);
    }

    @Test
    public void testVerificarCifraRepetida1() {
        NumeroAleatorio numeroAleatorio = new NumeroAleatorio();
        int[] numPrueba = {0};
        boolean resultado = numeroAleatorio.cifraRepetida(numPrueba, 0);
        boolean esperado = true;
        assertEquals(resultado, esperado);
    }

    @Test
    public void testVerificarCifraRepetida2() {
        NumeroAleatorio numeroAleatorio = new NumeroAleatorio();
        int[] numPrueba = {0, 1, 2};
        boolean resultado = numeroAleatorio.cifraRepetida(numPrueba, 3);
        boolean esperado = false;
        assertEquals(resultado, esperado);
    }
}
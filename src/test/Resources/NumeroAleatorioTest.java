package Resources;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumeroAleatorioTest {

    @Test
    public void testVereficarQueNumAleatorioTenga4Cifras(){
        NumeroAleatorio numeroAleatorio = new NumeroAleatorio();
        int resultado=(numeroAleatorio.numAleatorio4CifrasSinRepetirString()).length();
        int esperado=4;
        assertEquals(resultado,esperado);
    }
    @Test
    public void testVereficarNumAleatorio4Cifras(){
        NumeroAleatorio numeroAleatorio = new NumeroAleatorio();
        String resultado=numeroAleatorio.numAleatorio4CifrasSinRepetirString();
        String resultado1=numeroAleatorio.numAleatorio4CifrasSinRepetirString();
        assertNotSame(resultado,resultado1);
    }
    @Test
    public void testVereficarNumAleatorio4CifrasSinCeroAlComienzo(){
        NumeroAleatorio numeroAleatorio = new NumeroAleatorio();
        String numero=numeroAleatorio.numAleatorio4CifrasSinRepetirString();
        char resultado=numero.charAt(0);
        char esperado=0;
        assertNotSame(resultado,esperado);
    }

}
package Resources;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdivinadorPCTest {
    @Test
    public void testListDimension5040() {
        AdivinadorPC adivinadorPC = new AdivinadorPC();
        int resultado = adivinadorPC.listNumerosPosibles.size();
        int esperado = 5040;
        assertEquals(resultado, esperado);
    }

    @Test
    public void testDosNumerosRandom() {
        AdivinadorPC adivinadorPC = new AdivinadorPC();
        adivinadorPC.llenarListConNumerosPosibles();
        String numero = adivinadorPC.darNumeroRandomDeList();
        String numero1 = adivinadorPC.darNumeroRandomDeList();
        assertNotEquals(numero, numero1);
    }
    @Test
    public void testTrueCifrasBienEntre1234y4321() {
        AdivinadorPC adivinadorPC = new AdivinadorPC();
        adivinadorPC.llenarListConNumerosPosibles();
        boolean resultado=adivinadorPC.comprobarCifrasBien("1234","4321",0);
        boolean esperado=true;
        assertEquals(resultado,esperado);
    }
    @Test
    public void testTrueCifrasRegularEntre1234y4321() {
        AdivinadorPC adivinadorPC = new AdivinadorPC();
        adivinadorPC.llenarListConNumerosPosibles();
        boolean resultado=adivinadorPC.comprobarCifrasRegular("1234","4321",4);
        boolean esperado=true;
        assertEquals(resultado,esperado);
    }
    @Test
    public void testFalseCifrasRegularEntre1234y3210() {
        AdivinadorPC adivinadorPC = new AdivinadorPC();
        adivinadorPC.llenarListConNumerosPosibles();
        boolean resultado=adivinadorPC.comprobarCifrasRegular("1234","3210",4);
        boolean esperado=false;
        assertEquals(resultado,esperado);
    }
    @Test
    public void testTrueCifrasBienEntre1234y3210() {
        AdivinadorPC adivinadorPC = new AdivinadorPC();
        adivinadorPC.llenarListConNumerosPosibles();
        boolean resultado=adivinadorPC.comprobarCifrasBien("1234","3210",1);
        boolean esperado=true;
        assertEquals(resultado,esperado);
    }
    @Test
    public void testFalseCifrasRegularEntre0123y3701() {
        AdivinadorPC adivinadorPC = new AdivinadorPC();
        adivinadorPC.llenarListConNumerosPosibles();
        boolean resultado=adivinadorPC.comprobarCifrasRegular("0123","3701",2);
        boolean esperado=false;
        assertEquals(resultado,esperado);
    }
}
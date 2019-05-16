package Resources;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdivinadorOrdenadorTest {
   @Test
    public void  testPrimerNumeroTenga4Cifras (){
       AdivinadorOrdenador adivinadorOrdenador = new AdivinadorOrdenador();
       int resultado=adivinadorOrdenador.primerNumero().length;
       int esperado=4;
       assertEquals(resultado,esperado);
   }
    @Test
    public void  testSegundoNumeroTenga4Cifras(){
        AdivinadorOrdenador adivinadorOrdenador = new AdivinadorOrdenador();
        int resultado=adivinadorOrdenador.segundoNumero().length;
        int esperado=4;
        assertEquals(resultado,esperado);
    }

}
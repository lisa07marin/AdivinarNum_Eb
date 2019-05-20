package Resources;

import org.junit.Test;

import static org.junit.Assert.*;

public class LogicaAdivinadorPCTest {
    @Test
    public void testComprobarDosNumerosMismaCantidadBienRegular(){
        LogicaAdivinadorPC logicaAdivinadorPC=new LogicaAdivinadorPC();
        boolean resultado=logicaAdivinadorPC.compararDosNumeros("8204","0514",1,1);
        boolean esperado=true;
    }

}
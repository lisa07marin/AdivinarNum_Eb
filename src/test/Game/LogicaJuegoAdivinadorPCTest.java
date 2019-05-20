package Game;

import org.junit.Test;

public class LogicaJuegoAdivinadorPCTest {
    @Test
    public void testComprobarDosNumerosMismaCantidadBienRegular(){
        LogicaJuegoAdivinadorPC logicaJuegoAdivinadorPC =new LogicaJuegoAdivinadorPC();
        boolean resultado= logicaJuegoAdivinadorPC.compararDosNumeros("8204","0514",1,1);
        boolean esperado=true;
    }

}
package Resources;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidacionTest {
    @Test
    public void testTrueDimensionNumero1234(){
        Validacion validacion=new Validacion();
        boolean resultado=validacion.numeroTieneCuatroCifras("1234");
        boolean esperado=true;
        assertEquals(resultado,esperado);
    }
    @Test
    public void testFalseDimensionNumero123(){
        Validacion validacion=new Validacion();
        boolean resultado=validacion.numeroTieneCuatroCifras("123");
        boolean esperado=false;
        assertEquals(resultado,esperado);
    }
    @Test
    public void testTrueDimensionNumero1111(){
        Validacion validacion=new Validacion();
        boolean resultado=validacion.numeroTieneCuatroCifras("1111");
        boolean esperado=true;
        assertEquals(resultado,esperado);
    }
    @Test
    public void testTrueCifraRepetidaNumero1111(){
        Validacion validacion=new Validacion();
        boolean resultado=validacion.cifraRepetida("1111");
        boolean esperado=true;
        assertEquals(resultado,esperado);
    }
    @Test
    public void testFalseCifraRepetidaNumero1234(){
        Validacion validacion=new Validacion();
        boolean resultado=validacion.cifraRepetida("1234");
        boolean esperado=false;
        assertEquals(resultado,esperado);
    }
    @Test
    public void testTrueCifraRepetidaNumero1214(){
        Validacion validacion=new Validacion();
        boolean resultado=validacion.cifraRepetida("1214");
        boolean esperado=true;
        assertEquals(resultado,esperado);
    }
}
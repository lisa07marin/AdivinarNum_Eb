package Game;

import Validacion.Validacion;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidacionTest {
    @Test
    public void testTrueDimensionNumero1234(){
        boolean resultado= Validacion.numeroTieneCuatroCifras("1234");
        boolean esperado=true;
        assertEquals(resultado,esperado);
    }
    @Test
    public void testFalseDimensionNumero123(){
        boolean resultado=Validacion.numeroTieneCuatroCifras("123");
        boolean esperado=false;
        assertEquals(resultado,esperado);
    }
    @Test
    public void testTrueDimensionNumero1111(){
        boolean resultado=Validacion.numeroTieneCuatroCifras("1111");
        boolean esperado=true;
        assertEquals(resultado,esperado);
    }
    @Test
    public void testTrueCifraRepetidaNumero1111(){
        boolean resultado=Validacion.cifraRepetida("1111");
        boolean esperado=true;
        assertEquals(resultado,esperado);
    }
    @Test
    public void testFalseCifraRepetidaNumero1234(){
        boolean resultado=Validacion.cifraRepetida("1234");
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
    @Test
    public void testTrueOpcionCorrectaMenu(){
        boolean resultado=Validacion.opcionCorrecta(2);
        boolean esperado=true;
        assertEquals(resultado,esperado);
    }
    @Test
    public void testFalseOpcionIncorrectaMenu(){
        boolean resultado=Validacion.opcionCorrecta(3);
        boolean esperado=false;
        assertEquals(resultado,esperado);
    }
}
package es.vrivas;
/**
 * Unit test for simple App.
 */

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
   @Test
    public void testIntroducir_datos_de_prueba()
    {
        assertEquals(6, App.establecer_datos_de_prueba());
    }
}

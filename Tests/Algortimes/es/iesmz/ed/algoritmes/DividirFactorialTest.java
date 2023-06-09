package Algortimes.es.iesmz.ed.algoritmes;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DividirFactorialTest {
    @Test
    public void divisioTest() {
        DividirFactorial dividirFactorial = new DividirFactorial(5, 3);
        int resultado = dividirFactorial.divisio();
        Assert.assertEquals(20, resultado);
    }

    @Test
    public void divisioTestDos() {
        DividirFactorial dividirFactorial = new DividirFactorial(6, 4);
        int resultado = dividirFactorial.divisio();
        Assert.assertEquals(30, resultado);
    }

}
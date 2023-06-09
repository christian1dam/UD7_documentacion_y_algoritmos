package Algoritmes.es.iesmz.ed.algoritmesTests;

import Algortimes.es.iesmz.ed.algoritmes.Hyperpar;
import org.junit.Assert;
import org.junit.Test;

public class HyperparTest {
    @Test
    public void esHyperParTest() {
        Hyperpar primerTest = new Hyperpar(24624);
        boolean resultado = primerTest.esHyperPar();
        Assert.assertEquals(true, resultado);
    }

    @Test
    public void noEsHyperParTest() {
        Hyperpar primerTest = new Hyperpar(246524);
        boolean resultado = primerTest.esHyperPar();
        Assert.assertEquals(false, resultado);
    }

    @Test
    public void esHyperParTestTwo() {
        Hyperpar primerTest = new Hyperpar(24624826);
        boolean resultado = primerTest.esHyperPar();
        Assert.assertNotEquals(false, resultado);
    }

    @Test
    public void noHyperParTestThre() {
        Hyperpar primerTest = new Hyperpar(246294826);
        boolean resultado = primerTest.esHyperPar();
        Assert.assertNotEquals(true, resultado);
    }
}
package Algortimes.es.iesmz.ed.algoritmes;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnyTest {

    @Test
    public void digitosDiferentes() {
        Any primerTestAny = new Any(2031);
        int resultado = primerTestAny.digitosDiferentes();
        Assert.assertEquals(4, resultado);
    }

    @Test
    public void digitosDiferentesDos() {
        Any segundoTestAny = new Any(2012);
        int resultado = segundoTestAny.digitosDiferentes();
        Assert.assertEquals(3, resultado);
    }

    @Test
    public void digitosDiferentesFalse() {
        Any primerTestAny = new Any(2033);
        int resultado = primerTestAny.digitosDiferentes();
        Assert.assertNotEquals(4, resultado);
    }
}
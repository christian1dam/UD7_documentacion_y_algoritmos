package Algortimes.es.iesmz.ed.algoritmes;

import java.util.*;

/**
 * Esta clase define un objeto que analiza años
 * para ver si los dígitos que lo forman coinciden o no.
 * @author 1ºDAM_Christian;
 * @version: 09/06/2023
 */
public class Any {
    private long any;

    /**
     * Constructor de la clase 'Any'
     * al que se le pasa un año con un tipo Long
     * y que lo almacena en su atributo correspondiente.
     * @param any de tipo Long
     */
    public Any(long any) {
    this.any = any;
    }

    /**
     * Método público 'get' que devuelve el año almacenado en la clase.
     * @return el atributo privado 'any' de tipo Long.
     */
    public long getAny() {
        return this.any;
    }

    /**
     * Método público 'set' que recibe un año y lo almacena en la clase.
     * @param any de tipo Long.
     */
    public void setAny(long any) {
        this.any = any;
    }

    /**
     * Método público 'digitosDiferentes' que usa el atributo 'any' de la clase
     * y analiza la cantidad de digitos que son diferentes.
     * @return int digitosDiferentes con la cantidad de digitos que no son iguales.
     */
    public int digitosDiferentes() {
        Set<Integer> digitos = new HashSet<>();
        while (this.any > 0) {
            digitos.add((int) (this.any % 10));
            this.any /= 10;
        }
        return digitos.size();
    }

    /**
     * Método público 'toString' que devuelve un String de los atributos del objeto.
     * @return String que contiene los datos de los atributos de la clase.
     */
    @Override
    public String toString() {
        return "Any{" +
                "any=" + any +
                '}';
    }
}

package Algortimes.es.iesmz.ed.algoritmes;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase define un objeto que analiza números enteros de tipo Long
 * para ver si el entero es un número hyperpar.
 * @author 1ºDAM_Christian;
 * @version: 09/06/2023
 */
public class Hyperpar {
    private long numero;

    /**
     * Constructor de la clase 'Hyperpar'
     * al que se le pasa un número de tipo Long
     * y que contiene el método 'esHyperpar' y lo analiza.
     * @param numero
     */
    public Hyperpar(long numero){
        this.numero = numero;
    }

    /**
     * Método público 'get' que devuelve el número almacenado en la clase.
     * @return el atributo privado 'numero' de tipo Long.
     */
    public long getNumero() {
        return this.numero;
    }

    /**
     * Método público 'set' que recibe un número y lo almacena en la clase.
     * @param numero de tipo Long.
     */
    public void setNumero(long numero) {
        this.numero = numero;
    }

    /**
     * Método público 'esHyperPar' que usa el atributo 'numero' de la clase
     * y analiza si es hyperpar o no.
     * @return true si el número es hyperpar.
     * @return false si el número no es hyperpar.
     */
    public boolean esHyperPar(){
        boolean esHyperpar = true;
        List<Integer> digitos = obtenerArrayList();
        for (int i = 0; i < digitos.size(); i++) {
            if(!(digitos.get(i) % 2 == 0)){
                esHyperpar = false;
                break;
            }
        }
        return esHyperpar;
    }

    /**
     * Método privado 'obtenerArrayList' que usa el atributo 'numero' de la clase,
     * lo descompone por sus dígitos y los alamcena en un objeto ArrayList<Integer>
     * @return ArrayList<Integer>
     */
    private ArrayList<Integer> obtenerArrayList() {
        ArrayList<Integer> digitos  = new ArrayList<>();
        while(this.numero > 0){
            digitos .add((int) (this.numero % 10));
            this.numero = this.numero / 10;
        }
        return digitos;
    }

    /**
     * Método público 'toString' que devuelve un String de los atributos del objeto.
     * @return String que contiene los datos de los atributos de la clase.
     */
    @Override
    public String toString() {
        return "Hyperpar{" +
                "nombre=" + numero +
                '}';
    }
}

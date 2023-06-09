package Algortimes.es.iesmz.ed.algoritmes;

/**
 * Esta clase define un objeto que recibiendo dos números calcula
 * la división de sus factoriales.
 * @author 1ºDAM_Christian;
 * @version: 09/06/2023
 */
public class DividirFactorial {
    private int denominador;
    private int numerador;

    /**
     * Constructor de la clase 'DividirFactorial'
     * al que se le pasa dos números enteros, numerador y denominador.
     * y que lo almacena en su atributo correspondiente.
     * @param numerador de tipo Int
     * @param denominador de tipo Int
     */
    public DividirFactorial(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    /**
     * Método público 'get' que devuelve el denominador almacenado en la clase.
     * @return el atributo privado 'denominador' de tipo int.
     */
    public int getDenominador() {
        return denominador;
    }

    /**
     * Método público 'set' que recibe un int 'denominador' y lo almacena en la clase.
     * @param denominador de tipo int.
     */
    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    /**
     * Método público 'get' que devuelve el numerador almacenado en la clase.
     * @return el atributo privado 'numerador' de tipo int.
     */
    public int getNumerador() {
        return numerador;
    }

    /**
     * Método público 'set' que recibe un int 'numerador' y lo almacena en la clase.
     * @param numerador de tipo int.
     */
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    /**
     * Método público 'divisio' que devuelve un número entero que es la división de dos números factoriales.
     * @return divisionFactoriales de tipo int.
     */
    public int divisio(){
        int divisonFactoriales = 1;
        for (int i = this.denominador + 1; i <= this.numerador; i++) {
            divisonFactoriales *= i;
        }
        return divisonFactoriales;
    }
}

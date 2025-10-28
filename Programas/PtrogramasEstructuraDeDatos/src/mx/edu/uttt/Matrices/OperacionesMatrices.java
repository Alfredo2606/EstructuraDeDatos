package mx.edu.uttt.Matrices;

import javax.swing.*;

public class OperacionesMatrices {

    private double[][] m;

    public OperacionesMatrices(int numFilas, int numColumnas) {
        if (validarTamanio(numFilas) && validarTamanio(numColumnas)) {
            m = new double[numFilas][numColumnas];
        } else {
            m = new double[2][2];
        }
    }

    private boolean validarTamanio(int tamanio) {

        return tamanio > 0;
    }

    public double[][] getM() {

        return this.m;
    }

    //La misma matriz que ya existía en memoria,
    //pero con nuevos valores copiados uno por uno
    public void setM(double[][] m) {
        if (!(m.length == this.m.length && m[0].length == this.m[0].length))
            return;
        for (int i = 0; i < this.m.length; i++) {
            for (int j = 0; j < this.m[i].length; j++) {
                this.m[i][j] = m[i][j];
            }
        }
    }

    private boolean validarCuadrada() {

        return this.m.length == this.m[0].length;
    }

    public double sumarDiagonal() throws Exception {
        if (!validarCuadrada())
            throw new Exception("La matriz no es cuadrada");

        double suma = 0.0;
        for (int i = 0; i < m.length; i++) {
            suma += m[i][i];
        }
        return suma;
    }

    public double sumarDiagonalInversa() throws Exception {
        if (!validarCuadrada())
            throw new Exception("La matriz no es cuadrada");
        double suma = 0.0;
        for (int i = 0; i < m.length; i++) {
            suma += m[i][m.length - 1 - i];
        }
        return suma;
    }

    public double[] sumarFilas() {
        double[] sumaFilas = new double[m.length];
        for (int i = 0; i < m.length; i++) {
            double suma = 0.0;
            for (int j = 0; j < m[i].length; j++) {
                suma += m[i][j];
            }
            sumaFilas[i] = suma;
        }
        return sumaFilas;
    }

    public double[] sumarColumnas() {
        double[] sumaCols = new double[m[0].length];
        for (int j = 0; j < m[0].length; j++) {
            double suma = 0.0;
            for (int i = 0; i < m.length; i++) {
                suma += m[i][j];
            }
            sumaCols[j] = suma;
        }
        return sumaCols;
    }

    public double[][] sumarMatrices(double[][] otra) {
        if (m.length != otra.length || m[0].length != otra[0].length) {
            throw new IllegalArgumentException("Las matrices deben tener el mismo tamaño");
        }
        double[][] resultado = new double[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                resultado[i][j] = m[i][j] + otra[i][j];
            }
        }
        return resultado;
    }

    //multiplicar matriz
    public double [][] multiplicarMatriz(double[][]otra){
        if (m.length != otra.length || m[0].length != otra[0].length){
            throw new IllegalArgumentException("Las matrices deben de ser del mismo tamaño");
        }
        int m= this.m.length;
        int n = this.m[0].length;
        int p = otra[0].length;

        double[][] resultado = new double[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    resultado[i][j] += this.m[j][k] * otra[k][j];

                }

            }

        }
        return resultado;
    }

    // Suma todos los números pares de la matriz (considera "par" sólo si el valor es entero)
    public double sumarPares() {
        double suma = 0.0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                double val = m[i][j];
                // comprobamos que sea un entero y luego si ese entero es par
                if (val == Math.floor(val)) { // es entero
                    long entero = (long) val;
                    if (entero % 2 == 0) {
                        suma += val;
                    }
                }
            }
        }
        return suma;
    }

    // Suma los elementos por debajo de la diagonal principal (i > j)
    public double sumarDebajoDiagonal() throws Exception {
        if (!validarCuadrada())
            throw new Exception("La matriz no es cuadrada");

        double suma = 0.0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < i; j++) { // j < i asegura estar debajo de la diagonal
                suma += m[i][j];
            }
        }
        return suma;
    }

    // Suma los elementos por encima de la diagonal principal (i < j)
    public double sumarEncimaDiagonal() throws Exception {
        if (!validarCuadrada())
            throw new Exception("La matriz no es cuadrada");

        double suma = 0.0;
        for (int i = 0; i < m.length; i++) {
            for (int j = i + 1; j < m.length; j++) { // j > i asegura estar encima de la diagonal
                suma += m[i][j];
            }
        }
        return suma;
    }

    // Cambia el contorno por 1 y el interior por 0 (modifica la matriz this.m in-place)
    public void contornoUnoInteriorCero() {
        int filas = m.length;
        int cols = m[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                // si estamos en la primera/última fila o primera/última columna -> contorno
                if (i == 0 || j == 0 || i == filas - 1 || j == cols - 1) {
                    m[i][j] = 1.0;
                } else {
                    m[i][j] = 0.0;
                }
            }
        }
    }



    public void imprimir() {
        StringBuilder salida = new StringBuilder();
        for (double[] fila : this.m) {
            for (double valor : fila) {
                salida.append(valor).append(" | ");
            }
            salida.append("\n");
        }
        JOptionPane.showMessageDialog(null, salida.toString());
    }
}
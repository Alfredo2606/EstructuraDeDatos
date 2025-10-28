package mx.edu.uttt.EvaluacioUnidad1;

import javax.swing.*;
import java.util.Random;

public class sumaArribaAbajo {

    public static void iniciar() {
        int filas = solicitarFilas();
        int columnas = solicitarColumnas();

        int[][] matriz = new int[filas][columnas];
        llenarMatriz(matriz);

        if (!esCuadrada(matriz)) {
            JOptionPane.showMessageDialog(null, "La matriz debe ser cuadrada para calcular sumas de la diagonal.");
            return;
        }

        JOptionPane.showMessageDialog(null, "Matriz generada:\n" + mostrar(matriz));

        int sumaAbajo = sumaDiagonalInferior(matriz);
        int sumaArriba = sumaDiagonalSuperior(matriz);

        JOptionPane.showMessageDialog(null,
                "Suma de la parte de arriba de la diagonal: " + sumaArriba +
                        "\nSuma de la parte de abajo de la diagonal: " + sumaAbajo);
    }

    public static int solicitarFilas() {
        int filas = 0;
        boolean valido = false;
        do {
            try {
                filas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de filas:"));
                if (filas > 0) {
                    valido = true;
                } else {
                    JOptionPane.showMessageDialog(null, "El número de filas debe ser mayor a cero.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debes ingresar un número válido.");
            }
        } while (!valido);
        return filas;
    }

    public static int solicitarColumnas() {
        int columnas = 0;
        boolean valido = false;
        do {
            try {
                columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de columnas:"));
                if (columnas > 0) {
                    valido = true;
                } else {
                    JOptionPane.showMessageDialog(null, "El número de columnas debe ser mayor a cero.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debes ingresar un número válido.");
            }
        } while (!valido);
        return columnas;
    }

    public static void llenarMatriz(int[][] matriz) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
    }

    public static boolean esCuadrada(int[][] matriz) {
        return matriz.length == matriz[0].length;
    }


    public static int sumaDiagonalSuperior(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i + 1; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
    public static int sumaDiagonalInferior(int[][] matriz) {
        int suma = 0;
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }


    public static String mostrar(int[][] matriz) {
        String texto = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                texto += matriz[i][j] + " | ";
            }
            texto += "\n";
        }
        return texto;
    }
}

package mx.edu.uttt.Matrices;

import javax.swing.*;
import java.util.Random;

public class frontera{

    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        int filas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de filas:"));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de columnas:"));

        int[][] matrix = new int[filas][columnas];

        llenarMatrizAleatoria(matrix);
        int suma = sumarFrontera(matrix);

        System.out.println("Matriz generada automáticamente:");
        imprimir(matrix);

        JOptionPane.showMessageDialog(null, mostrar(matrix) + " \n\n La suma de la frontera es " + suma);
    }


    public static void llenarMatrizAleatoria(int[][] matriz) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10) + 1;
            }
        }
    }


    public static int sumarFrontera(int[][] matriz) {
        int suma = 0;
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                if (i == 0 || i == filas - 1 || j == 0 || j == columnas - 1) {
                    suma += matriz[i][j];
                }
            }
        }
        return suma;
    }


    public static void imprimir(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public static String mostrar(int[][] matrix) {
        String texto = "Matriz generada \n";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                texto += matrix[i][j] + "  ";
            }
            texto += "\n";
        }
        return texto;
    }
}

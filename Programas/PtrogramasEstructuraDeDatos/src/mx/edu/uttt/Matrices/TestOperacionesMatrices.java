package mx.edu.uttt.Matrices;

import javax.swing.*;
import java.awt.*;

public class TestOperacionesMatrices {
    public static void main(String[] args) {
        iniciar();

    }
    public static void iniciar() {
        int filas = obtenerTamanio();
        int columnas = obtenerTamanio();
        OperacionesMatrices oper = new OperacionesMatrices(filas, columnas);

        double[][] m =new double[filas][columnas];
        llenarMatriz(m);
        oper.setM(m);
        oper.imprimir();
        try {
            JOptionPane.showInputDialog(null,oper.sumarDiagonal());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static int obtenerTamanio (){
        int valor = 0;
        boolean sentinel = true;
        do {

            try {
                valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor"));
                if (valor > 0){
                    sentinel= false;
                }else{
                    JOptionPane.showMessageDialog(null,"El valor debe ser mayor que cero");
                }
            } catch (NumberFormatException ex) {
                System.out.println("El valor debe ser un numero");
            }
        }while(sentinel);

        return  valor;
    }
    public  static  void llenarMatriz(double [][] matrix){
        int i=0, j=0;
        boolean sentinel= false;
        do {

            do {
                do {
                    try {
                        matrix[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor"));
                        sentinel=false;
                    }catch (NumberFormatException ex){

                        JOptionPane.showMessageDialog(null,"El valor debe ser un numero");
                    }

                }while (sentinel);
                j++;
            }while(j<matrix[i].length);
            j=0;

            i++;
        }while (i<matrix.length);

    }
}

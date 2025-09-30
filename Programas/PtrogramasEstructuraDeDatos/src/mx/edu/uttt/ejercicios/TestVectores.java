package mx.edu.uttt.ejercicios;

import javax.swing.*;

public class TestVectores {

    public static void main(String[] args){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño de los vectores"));

        Vector a = new Vector(n);
        Vector b = new Vector(n);

        int[] elementosA = new int[n];
        int[] elementosB = new int[n];

        for(int i=0; i<n; i++){
            elementosA[i] = Integer.parseInt(JOptionPane.showInputDialog("Vector A - elemento " + (i+1)));
        }

        for(int i=0; i<n; i++){
            elementosB[i] = Integer.parseInt(JOptionPane.showInputDialog("Vector B - elemento " + (i+1)));
        }

        a.setElementos(elementosA);
        b.setElementos(elementosB);

        Vectores vectores = new Vectores(a, b);
        Vector c = vectores.sumar();

        if(c != null){
            JOptionPane.showMessageDialog(null,
                    "Vector A: " + a.imprimir() +
                            "\nVector B: " + b.imprimir() +
                            "\nVector C (A+B): " + c.imprimir());
        }
    }
}
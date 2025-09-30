package mx.edu.uttt.ejercicios;

import javax.swing.*;

public class TestPromedioVector {
    public static void main(String[] args){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de valores"));
        PromedioVector vector = new PromedioVector(n);
        vector.ingresarValores();

        Promedio promedioObj = new Promedio(vector.getValores());

        double promedio = promedioObj.calcularPromedio();
        int cantidadMayores = promedioObj.contarMayoresQuePromedio();
        double[] mayores = promedioObj.valoresMayoresQuePromedio();

        String salida = "Promedio: " + promedio +
                "\nCantidad de valores mayores que el promedio: " + cantidadMayores +
                "\nValores mayores que el promedio: ";
        for(double v : mayores){
            salida += v + " ";
        }

        JOptionPane.showMessageDialog(null, salida);
    }
}
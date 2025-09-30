package mx.edu.uttt.ejercicios;

import javax.swing.*;

public class PromedioVector {
    private double[] valores;
    private int n;

    public PromedioVector(int n){
        if(n <= 0)
            this.n = 1;
        else
            this.n = n;
        this.valores = new double[this.n];
    }

    public void ingresarValores(){
        for(int i = 0; i < n; i++){
            valores[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor " + (i+1)));
        }
    }

    public double[] getValores() {
        return valores;
    }
}
package mx.edu.uttt.arreglos;

import javax.swing.*;

public class OperacionesVectores {
    private double [] vector;
    private final int tamano = 5;


    public OperacionesVectores (){
        vector = new double[tamano];
    }

    public OperacionesVectores (double [] vector){
        this.vector  = new double[vector.length];
        llenarVector(vector);
    }

    public void llenarVector (double [] vector){
        for (int i = 0; i < vector.length ; i++) {
            this.vector[i] = vector [i];
        }
    }
    public void llenarVector (){
        int i = 0;
        do{
            this.vector[i]= Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "Introduce el valor de la posicion [ " + (i+1) + "]"));

        }while(i < this.vector.length);

    }

    public void imprimir (){
        this.toString();

    }
    public double sumarElementos(double [] vector){
        double op1 = 0;
        for (int i = 0; i < vector.length; i++) {
            op1 += vector[i];
        }
        return op1;

    }
    public double obtenerMaxiomoValor(){
        int i = 0;
        double maximo = 0.0;
        while (i<this.vector.length){
            if(maximo<this.vector[i]){
                maximo = vector [i];
            }
            i++;

        }
        return maximo;

    }

    public double obtenerMinimoValor(){
        int i = 0;
        double minimo = 0.0;
        while (i>this.vector.length){
            if(minimo>this.vector[i]){
                minimo = vector [i];
            }
            i++;
        }
        return minimo;
    }

    public void cambiarTamnioArreglo (int tamanio) {
        if (vector.length >= tamanio) {
            double temp[] = new double[tamanio];

            for (int i = 0; i < this.vector.length; i++) {
                temp[i] = vector[i];

            }
            temp = null;

            return;

        }
        System.out.println("No se puede crear un arreglo mas pequeño que el vector");
    }

    public boolean comprarArreglos (double [] vector){
        boolean isEsqual = true;
        if (this.vector.length != vector.length){
            isEsqual = false;

        }else {
            for (int i = 0; i < this.vector.length && isEsqual; i++) {
                if (vector[i]!= this.vector[i]){
                    isEsqual = false;
                }

            }
        }
        return  isEsqual;

    }

    @Override
    public String toString(){
        String salida = "";
        for (double valor : this.vector){
            salida+="|" + valor + "|";
        }

        return salida;
    }
}

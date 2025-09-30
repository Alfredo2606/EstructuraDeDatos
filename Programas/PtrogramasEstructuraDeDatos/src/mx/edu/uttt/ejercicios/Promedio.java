package mx.edu.uttt.ejercicios;

public class Promedio {
    private double[] valores;

    public Promedio(double[] valores){
        this.valores = valores;
    }

    public double calcularPromedio(){
        double suma = 0;
        for(double v : valores){
            suma += v;
        }
        return suma / valores.length;
    }

    public int contarMayoresQuePromedio(){
        double promedio = calcularPromedio();
        int contador = 0;
        for(double v : valores){
            if(v > promedio){
                contador++;
            }
        }
        return contador;
    }

    public double[] valoresMayoresQuePromedio(){
        double promedio = calcularPromedio();
        int count = contarMayoresQuePromedio();
        double[] mayores = new double[count];
        int index = 0;
        for(double v : valores){
            if(v > promedio){
                mayores[index++] = v;
            }
        }
        return mayores;
    }
}
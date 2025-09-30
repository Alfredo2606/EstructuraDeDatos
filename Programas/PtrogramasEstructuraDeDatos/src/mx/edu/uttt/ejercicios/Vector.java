package mx.edu.uttt.ejercicios;

public class Vector {
    private int[] elementos;

    public Vector(int size) {
        if(size <= 0)
            this.elementos = new int[1];
        else
            this.elementos = new int[size];
    }

    public int[] getElementos() {
        return elementos;
    }

    public void setElementos(int[] elementos) {
        this.elementos = elementos;
    }

    public String imprimir() {
        String salida = "";
        for(int e : elementos){
            salida += e + " ";
        }
        return salida;
    }
}
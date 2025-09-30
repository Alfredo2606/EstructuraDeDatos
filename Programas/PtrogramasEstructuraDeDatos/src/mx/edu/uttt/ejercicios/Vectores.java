package mx.edu.uttt.ejercicios;

public class Vectores {
    private Vector vectorA;
    private Vector vectorB;
    private Vector vectorC;

    public Vectores(Vector a, Vector b){
        this.vectorA = a;
        this.vectorB = b;
        this.vectorC = null;
    }

    public Vector sumar() {
        int size = vectorA.getElementos().length;
        if(size != vectorB.getElementos().length){
            System.out.println("Los vectores deben tener el mismo tamaño");
            return null;
        }

        vectorC = new Vector(size);
        int[] resultado = new int[size];
        for(int i = 0; i < size; i++){
            resultado[i] = vectorA.getElementos()[i] + vectorB.getElementos()[i];
        }
        vectorC.setElementos(resultado);
        return vectorC;
    }

    public Vector getVectorC() {
        return vectorC;
    }
}
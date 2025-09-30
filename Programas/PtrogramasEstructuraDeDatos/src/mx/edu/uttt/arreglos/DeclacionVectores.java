package mx.edu.uttt.arreglos;
import mx.edu.uttt.poo.Alumno;
public class DeclacionVectores {
    public static void main(String[] args){

        //Dexlaracion de vectores
        int v1[];
        double v2[], v3[];
        boolean v4[];
        char v5[];
        String v6[];
        //Alumno v7[];

        //Crear el vector en memoria
        v1 = new int[4];
        v2 = new double[3];
        v3 = new double[3];
        v4 = new boolean[4];
        v5= new char[5];
        v6 = new String[4];
        Alumno [] v7 = new Alumno[3];

        //Declaracion con valores iniciales
        double [] v8 = {3.2,8.5,8.9,7.4};

        int tamanio = v1.length;
        System.out.println(tamanio);

        try {
            System.out.println(v3[2]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("El arreglo se desbordo");
        }

        System.out.println(esTamanio(v1));

    }//Cierra el main
    public static int esTamanio(int [] vector){
        return vector.length;
    }
}//Cierra la clase

  /*  public static void imprimir (int [] vector){
        for (int i=0; i<vector.length; i++){
            System.out.println("| " +vector[i]+ " |");
        }
        System.out.println();
        int i =0;

        do {
            System.out.println("| " +vector[i]+ " |");
            i++;
        }while (i<vector.length);
        System.out.println();
        i=0;
        while (i< vector.length){
            System.out.println("| " +vector[i]+ " |");
            i++;
        }
        for (int valor : vector){
}
}*/

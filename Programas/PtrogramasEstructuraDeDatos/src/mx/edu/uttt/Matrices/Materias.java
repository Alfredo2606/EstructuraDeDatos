package mx.edu.uttt.Matrices;

import javax.swing.*;
import java.util.Random;

public class Materias {
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar (){
        int Alumnos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de Alumnos"));
        int Materias = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de materias"));

        double [][] matri=new double[Alumnos][Alumnos];
        double [] promAlum = new double[Alumnos];
        double [] promM = new double[Materias];
        

        llenarMatriz(matri);
        promedioAlum(promAlum,matri);
        promMate(promM,matri);

        JOptionPane.showMessageDialog(null,mostrarR(matri,promAlum,promM));
    }






    public static void valoresAletorios (){
        double numeroAletorio = Math.random()*10;

    }

    public static void llenarMatriz(double [][] ma){
        Random random = new Random();
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[i].length; j++) {
                ma[i][j] = Math.round(random.nextDouble() * 10 * 100.0) / 100.0;

            }

        }

    }
    
    
    public static void promedioAlum(double [] promAlum, double[][]matris){
        int contador = 0;
        double prom = 0;
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                contador++;
                prom +=matris[i][j];
            }
            promAlum[i]+= prom/contador;
            prom =0;
            contador=0;

            
        }
    }

    public static void promMate (double [] promM, double [][] matris){
        int contador = 0;
        double prom = 0;
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                contador++;
                prom +=matris [j][i];
            }
            promM[i]+=prom/contador;
            prom =0;
            contador=0;

        }
    }


    public static String mostrarR(double [][] matris, double[] promedioAlum, double[] promMate){
        String r = "";
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                r +=matris[i][j] + "|";
            }
            r+=" "+promedioAlum[i]+"|";
            r+="\n";

        }
        r+="\n";
        for (int i = 0; i < promMate.length; i++) {
            r+=promMate[i]+" | ";

        }

        return r;
    }



}

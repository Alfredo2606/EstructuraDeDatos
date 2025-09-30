package mx.edu.uttt.arreglos;

import mx.edu.uttt.poo.Alumno;

import javax.swing.*;

public class AlumnoVector {
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar(){
        int tamanio =0;
        tamanio = solicitarRamanio();
        Alumno [] alumnos = new Alumno[tamanio];
        menu(alumnos);
    }
    public static void menu(Alumno [] alumnos){
        boolean sentinel = true;
        String menu="===Menu===\n"+
                "1)Llenar vector \n" +
                "2) Imprimir vector \n "+
                "3) Salir\n" +
                "Elegir una opcion: ", opcion="";


        do {
            opcion= JOptionPane.showInputDialog(menu);
            switch (opcion){
                case "1":
                    llenarAlumnos(alumnos);
                    break;
                case "2":
                    imprimir(alumnos);
                    break;
                case "3":
                    sentinel=false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");

            }
        }while(sentinel);
    }
    public static int solicitarRamanio(){
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de alumnos"));
    }

    public static void llenarAlumnos (Alumno [] alus){
        for (int i = 0; i < alus.length; i++) {
            Alumno a1 = new Alumno();
            a1.setNombre(JOptionPane.showInputDialog("Introduce el nombre"));
            a1.setSexo(JOptionPane.showInputDialog("Introduce el sexo").charAt(0));
            a1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad")));
            a1.setColorPiel(JOptionPane.showInputDialog("Introduce el color de piel"));
            alus[i] = a1;
        }
    }
    public static void imprimir(Alumno [] alumnos) {
        if (alumnos[0] != null) {
            String salida = "Datos de los alumnos:\n";
            for (Alumno alumno : alumnos) {
                salida += "Nombre: " + alumno.getNombre() +
                        "/nSexo: " + alumno.getSexo() +
                        "\nEdad: " + alumno.getSexo() +
                        "\nColor de piel: " + alumno.getColorPiel();

            }
            System.out.println(salida);
            return;
        }
        JOptionPane.showMessageDialog(null, "No existen alumnos registrados");
    }
    public static void imprimir2(Alumno [] alumnos){
        String salida="Datos del alumno:\n";
        for(Alumno alumno:alumnos){
            salida+=alumno + "\n";
 }
}
}
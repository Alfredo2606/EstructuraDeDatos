package mx.edu.uttt.Matrices;

import javax.swing.*;

public class palabras {

    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {

        char[][] matris = {
                {'C', 'A', 'R', 'R', 'O'},
                {'P', 'E', 'R', 'R', 'O'},
                {'C', 'A', 'S', 'A', 'S'},
                {'G', 'A', 'T', 'O', 'S'},
                {'T', 'A', 'C', 'O', 'S'}
        };


        mostrarMatriz(matris);


        char[] palabra = pPalabra();


        boolean encontrada = buscarPalabra(matris, palabra);


        mostrarResultado(encontrada, palabra);
    }


    public static void mostrarMatriz(char[][] matriz) {
        String palabra = "Matriz de Letras:\n";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                palabra += matriz[i][j] + " ";
            }
            palabra += "\n";
        }
        JOptionPane.showMessageDialog(null, palabra);
    }


    public static char[] pPalabra() {
        String palabra = JOptionPane.showInputDialog("Escribe una palabra (máximo 5 letras):");


        while (palabra == null || palabra.length() == 0 || palabra.length() > 5) {
            palabra = JOptionPane.showInputDialog("ERROR: Escribe una palabra de 1 a 5 letras:");
        }


        char[] letras = new char[palabra.length()];


        for (int i = 0; i < palabra.length(); i++) {
            letras[i] = palabra.charAt(i);
        }


        JOptionPane.showMessageDialog(null, "Tu palabra es: " + palabra);

        return letras;
    }



    public static boolean buscarPalabra(char[][] matriz, char[] palabra) {

        for (int i = 0; i < matriz.length; i++) {


            for (int j = 0; j < matriz[i].length - palabra.length + 1; j++) {
                int contador = 0;


                for (int n = 0; n < palabra.length; n++) {
                    if (matriz[i][j + n] == palabra[n]) {
                        contador++;
                    }
                }


                if (contador == palabra.length) {
                    return true;
                }
            }
        }
        return false;
    }



    public static void mostrarResultado(boolean encontrada, char[] palabra) {
        String palabraC = new String(palabra);
        if (encontrada) {
            JOptionPane.showMessageDialog(null, "La palabra '" + palabraC + "' SI se encontró en la matriz");
        } else {
            JOptionPane.showMessageDialog(null, "La palabra '" + palabraC + "' NO se encontró en la matriz");
        }
    }
}

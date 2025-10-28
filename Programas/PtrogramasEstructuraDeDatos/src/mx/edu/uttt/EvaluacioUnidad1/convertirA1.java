package mx.edu.uttt.EvaluacioUnidad1;

import javax.swing.JOptionPane;

public class convertirA1 {

    private int[][] matriz;
    private int filas;
    private int columnas;

    public void iniciar() {
        filas = solicitarNumero("Ingresa el número de filas");
        columnas = solicitarNumero("Ingresa el número de columnas");
        matriz = new int[filas][columnas];

        llenar();
        imprimir();

        int opc = JOptionPane.showConfirmDialog(null, "¿Deseas cambiar la frontera a unos?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (opc == JOptionPane.YES_OPTION) {
            cambiarFrontera();
            imprimir();
        }
    }

    public int solicitarNumero(String mensaje) {
        int numero = 0;
        boolean valido = false;
        while (!valido) {
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
                if (numero > 0) {
                    valido = true;
                } else {
                    JOptionPane.showMessageDialog(null, "El número debe ser mayor que 0");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingresa un número válido");
            }
        }
        return numero;
    }

    public void llenar() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public void cambiarFrontera() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == 0 || j == 0 || i == filas - 1 || j == columnas - 1) {
                    matriz[i][j] = 1;
                }
            }
        }
    }

    public void imprimir() {
        StringBuilder salida = new StringBuilder("Matriz:\n");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                salida.append(matriz[i][j]).append(" | ");
            }
            salida.append("\n");
        }
        JOptionPane.showMessageDialog(null, salida.toString());
    }
}

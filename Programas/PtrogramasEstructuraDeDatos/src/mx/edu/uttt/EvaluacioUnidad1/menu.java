package mx.edu.uttt.EvaluacioUnidad1;

import javax.swing.JOptionPane;

public class menu {

    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            String opcionStr = JOptionPane.showInputDialog(
                    "MENÚ PRINCIPAL\n\n" +
                            "1) Sumar números por debajo y sobre la diagonal\n" +
                            "2) Convertir frontera a 1\n" +
                            "3) Salir\n\n" +
                            "Elige una opción:");

            int opcion = 0;
            try {
                opcion = Integer.parseInt(opcionStr);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Debes ingresar un número válido.");
                continue;
            }

            switch (opcion) {
                case 1:
                    sumaArribaAbajo suma = new sumaArribaAbajo();
                    suma.iniciar();
                    break;

                case 2:
                    convertirA1 convertir = new convertirA1();
                    convertir.iniciar();
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    salir = true;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida, intenta de nuevo.");
            }
        }
    }
}

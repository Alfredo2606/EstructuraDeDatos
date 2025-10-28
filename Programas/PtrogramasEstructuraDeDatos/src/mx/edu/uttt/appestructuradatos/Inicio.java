package mx.edu.uttt.appestructuradatos;


import javax.swing.*;

public class Inicio {
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        String opcion = "";
        boolean sentinel = true;
        do {

            opcion = JOptionPane.showInputDialog(Menus.obtenerMenuPrincipal());

            switch (opcion) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Opción 1");
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Opción 2");
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Opción 3");
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Opción 4");
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "Opción 5");
                    break;
                case "6":
                    JOptionPane.showMessageDialog(null, "I'll be back");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Valor no válido");
                    break;


            }

        }while(sentinel);

    }

}
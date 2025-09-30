package mx.edu.uttt.ejercicios;

import mx.edu.uttt.ejercicios.Producto;

import javax.swing.*;

public class TestProductosVector {
    public static void main(String[] args){
        iniciar();
    }

    public  static void iniciar(){

        boolean sentinel = true;
        int tamanio = Integer.parseInt
                (JOptionPane.showInputDialog("Introduce el numero de Productos"));
        ProductoVector pv = new ProductoVector(tamanio);

        String opcion = "";
        do {
            opcion = JOptionPane.showInputDialog(menu());
            switch (opcion){
                case "1":
                    if (!pv.estalleno())
                        pv.LlenarArreglo(llenarProducto());
                    else
                        JOptionPane.showMessageDialog(null,
                                "El vector esta lleno");
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, pv.imprimir());
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null ,pv.imprimir());
                    String nombreEliminar = JOptionPane.showInputDialog("Introduce el nombre del producto a eliminar:");
                    if (pv.eliminarProducto(nombreEliminar)) {
                        JOptionPane.showMessageDialog(null, "Producto eliminado correctamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "Producto no encontrado");
                    }
                    break;

                case "4":
                    sentinel = false;
                    JOptionPane.showMessageDialog(null,
                            "Gracias por todo");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }


        } while(sentinel);
    }

    public static String menu (){
        return "Menu Principal\n " +
                "1) Agregar Producto\n" +
                "2) Imprimir Prooductos \n" +
                "3)Eliminar Producto \n" +
                "4)Buscar Producto \n" +
                "5)Modificar Producto \n" +
                "6) Salir \n" +
                " Elegir Opcion \n";
    }

    public static Producto llenarProducto(){
        // Crea el objeto de producto
        Producto producto =new Producto();

        // Se olicitan los noombres de los valors de instancia
        String nombre = JOptionPane.showInputDialog
                ("Introduce el nombre del producto");
        int existencia= Integer.parseInt(JOptionPane.showInputDialog("Introduce la existencia"));
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio"));

        //Asignan los valores de las variables de instancia del objeto producto
        producto.setNombre(nombre);
        producto.setExistencia(existencia);
        producto.setPrecio(precio);

        return producto;
}
}
package mx.edu.uttt.ejercicios;

import mx.edu.uttt.ejercicios.Producto;

import javax.swing.*;

public class ProductoVector {
    private Producto [] productos ;
    private final int TAMANO = 2;

    // < >

    public ProductoVector (){
        this.productos = new Producto[this.TAMANO];
    }
    public ProductoVector (int tamanio){
        if (tamanio <=0)
            this.productos = new Producto[this.TAMANO];
        else
            this.productos = new Producto[tamanio];
    }

    public  void  LlenarArreglo (Producto producto){
        if (estalleno()){
            JOptionPane.showMessageDialog(null, "El vector esta lleno");
        } else {
            this.productos[buscarposicion()] = producto;
        }
    }

    private int  buscarposicion(){
        int posicion = 0;
        for (int i=0; i<this.productos.length; i++){
            if (this.productos[i] == null){
                posicion = i;
                break;

            }
        }
        return posicion;
    }


    public boolean estalleno(){
        boolean lleno = true;
        for (Producto producto: this.productos){
            if(producto == null){
                lleno = false;
                break;
            }
        }
        return lleno;
    }
    public boolean eliminarProducto(String nombre) {
        boolean eliminado = false;
        for (int i = 0; i < this.productos.length; i++) {
            if (this.productos[i] != null && this.productos[i].getNombre().equalsIgnoreCase(nombre)) {
                this.productos[i] = null;
                eliminado = true;
                break;
            }
        }
        return eliminado;
    }





    public String imprimir(){
        String salida= "Lista de Productos\n";

//          for (Producto producto: this.productos){
//            salida += producto.toString() + "\n";
//        }

        for ( int i= 0 ; i<this.productos.length; i++){
            if (this.productos[i] != null){
                salida += this.productos[i].toString() + "\nImporte:" +
                        productos[i].getPrecio() *
                                productos[i].getExistencia()
                        + "\n";
            }
        }

        return salida;
}
}
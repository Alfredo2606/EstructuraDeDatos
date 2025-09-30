
package mx.edu.uttt.ejercicios;

import mx.edu.uttt.ejercicios.Producto;


public class Producto {
    private String Nombre;
    private Double Precio;
    private int Existencia;

    public Producto() {
        this.Nombre = "Sin nombre";
    }

    public Producto(String Nombre, int Existencia, double Precio){
        this.setExistencia(Existencia);
        this.setNombre(Nombre);
        this.setPrecio(Precio);
    }
    // Metodo Accesor (get)
    public String getNombre(){
        return this.Nombre;
    }

    // METODO MUTADOR (SET)

    public void setNombre(String Nombre){
        this.Nombre = Nombre.toUpperCase();
    }

    public int getExistencia(){
        return this.Existencia;
    }
    public void setExistencia(int Existencia){
        if (Existencia>= 0)
            this.Existencia = Existencia;
    }

    public Double getPrecio() {
        return this.Precio;
    }

    public void setPrecio(double Precio){
        if (Precio>= 0.0)
            this.Precio = Precio;
    }
    @Override
    public String toString(){
        return "Nombre del producto: " + getNombre() +
                "\nExistencia: " + getExistencia() +
                "\nPrecio: " + getPrecio();


}
}
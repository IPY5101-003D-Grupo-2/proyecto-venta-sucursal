/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author luis
 */
public class LineaVenta {
    private Producto producto;
    private int cantidad;
    private double totalLinea;

    public LineaVenta() {
        this.producto = new Producto();
        this.cantidad = 0;
        this.totalLinea = 0.0;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad < 0 ){
            this.cantidad = 0;
        }
        this.cantidad = cantidad;
    // Recalculamos el total de la linea cada vez que cambia la cantidad.        
        this.totalLinea = this.cantidad * this.producto.getPrecio();
    }

    public double getTotalLinea() {
        return totalLinea;
    }

    public void setTotalLinea(double totalLinea) {
        if (totalLinea < 0){
            this.totalLinea = 0;
        }
        this.totalLinea = totalLinea;
    }

    @Override
    public String toString() {
        return "LineaVenta{" + "producto=" + producto + ", cantidad=" + cantidad + ", totalLinea=" + totalLinea + '}';
    }

    
}



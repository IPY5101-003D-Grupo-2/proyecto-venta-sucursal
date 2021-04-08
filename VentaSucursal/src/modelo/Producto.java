package modelo;

public class Producto {

    private String sku;
    private String tipo;
    private String producto;
    private double precio;

    public Producto() {
        this.sku = "No info";
        this.tipo = "No info";
        this.producto = "No info";
        this.precio = 0.0;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.equalsIgnoreCase("Repuesto")){
            this.tipo = "Repuesto";
            return;
        }
        if (tipo.equalsIgnoreCase("Producto")){
            this.tipo = "Producto";
            return;
        }
        this.tipo = "No info";
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0 ){
            this.precio = 0;
        }
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "sku=" + sku + ", tipo=" + tipo + ", producto=" + producto + ", precio=" + precio + '}';
    }
}

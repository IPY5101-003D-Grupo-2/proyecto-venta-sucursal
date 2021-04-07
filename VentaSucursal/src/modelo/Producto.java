package modelo;

public class Producto {

    private String SKU;
    private String Tipo;
    private String Producto;
    private double Precio;

    public Producto() {
        this.SKU = "No info";
        this.Tipo = "No info";
        this.Producto = "No info";
        this.Precio = 0.0;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "SKU=" + SKU + ", Tipo=" + Tipo + ", Producto=" + Producto + ", Precio=" + Precio + '}';
    }

}

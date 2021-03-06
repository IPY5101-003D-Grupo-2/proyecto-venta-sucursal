package modelo;

public class Sucursal {
    private String cod;
    private String nombre;
    
    public Sucursal(){
        this.cod = "No info";
        this.nombre = "No info";
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        // TODO: Validar que el código de sucursal sea 1 letra y 3 números
        // Ej: A001
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Sucursal{" + "cod=" + cod + ", nombre=" + nombre + '}';
    }
    
}

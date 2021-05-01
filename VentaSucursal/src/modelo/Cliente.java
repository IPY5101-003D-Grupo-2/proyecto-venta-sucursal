package modelo;

import controlador.RegistroCliente;

public class Cliente {

    private String rut;
    private String nombre;

    public Cliente() {
        this.rut = "No info";
        this.nombre = "Anonimo";
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        // TODO: validen que sea un rut correcto, con -.
        // Que el dígito verificador sea calculado.
        // Ej de rut: 19214073-0
        
        RegistroCliente validador = new RegistroCliente();
        if (validador.validarRut(rut)) {
            this.rut = rut;
        }else{
            this.rut = "No info";
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", nombre=" + nombre + '}';
    }

}

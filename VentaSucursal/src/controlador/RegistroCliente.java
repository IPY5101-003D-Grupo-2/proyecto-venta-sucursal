package controlador;

import bd.*;
import modelo.*;
import java.sql.*;
import java.util.ArrayList;
import jdk.nashorn.internal.objects.NativeArray;

public class RegistroCliente {
    ArrayList<Cliente> listaCliente = new ArrayList();
    
    public String buscarCliente(String Rut) {
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("JOSE ANTONIO");
        cliente1.setRut("14365847-3");
        Cliente cliente2 = new Cliente();
        cliente2.setNombre("LUIS ALBERTO ");
        cliente2.setRut("13338250-K");
        listaCliente.add(cliente1);
        listaCliente.add(cliente2);
        
        for (int i=0; i < listaCliente.size(); i++) {
            if (listaCliente.get(i).getRut().equals(Rut)) {
                return listaCliente.get(i).getNombre();
            }
        }
        
        return "Anonimo";
    }
}

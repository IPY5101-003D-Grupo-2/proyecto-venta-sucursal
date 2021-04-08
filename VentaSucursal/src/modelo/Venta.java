package modelo;

import java.sql.Timestamp;
import java.util.ArrayList;

public class Venta {
    // Piensen esto como boleta
    private Cliente cliente;
    private Sucursal sucursal;
    ArrayList<LineaVenta> lineasVenta = new ArrayList();
    private int totalVenta;
    private Timestamp fechaHoraCompra;
}

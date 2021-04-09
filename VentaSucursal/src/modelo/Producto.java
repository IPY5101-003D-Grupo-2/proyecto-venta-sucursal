package modelo;

public class Producto {

    private String url;
    private String sku;
    private String tipo;
    private String producto;
    private double precio;
    private String caracteristica;
    private String modelo;
    private String modo;
    private String alimentacion;
    private String consumo;
    private String capacidadNominal;
    private String caudal;
    private String ruido;
    private String dimensiones;
    private String peso;
    private String mCaneria;
    private String conexionCaneria;
    private String ficha;
    private String urlImg;
    private String Stock;

    public Producto() {
        this.url = "No info";
        this.sku = "No info";
        this.tipo = "No info";
        this.producto = "No info";
        this.precio = 0.0;
        this.caracteristica = "No info";
        this.modelo = "No info";
        this.modo = "No info";
        this.alimentacion = "No info";
        this.consumo = "No info";
        this.capacidadNominal = "No info";
        this.caudal = "No info";
        this.ruido = "No info";
        this.dimensiones = "No info";
        this.peso = "No info";
        this.mCaneria = "No info";
        this.conexionCaneria = "No info";
        this.ficha = "No info";
        this.urlImg = "No info";
        this.Stock = "No info";
    }

    public String getStock() {
        return Stock;
    }

    public void setStock(String Stock) {
        this.Stock = Stock;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public String getCapacidadNominal() {
        return capacidadNominal;
    }

    public void setCapacidadNominal(String capacidadNominal) {
        this.capacidadNominal = capacidadNominal;
    }

    public String getCaudal() {
        return caudal;
    }

    public void setCaudal(String caudal) {
        this.caudal = caudal;
    }

    public String getRuido() {
        return ruido;
    }

    public void setRuido(String ruido) {
        this.ruido = ruido;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getmCaneria() {
        return mCaneria;
    }

    public void setmCaneria(String mCaneria) {
        this.mCaneria = mCaneria;
    }

    public String getConexionCaneria() {
        return conexionCaneria;
    }

    public void setConexionCaneria(String conexionCaneria) {
        this.conexionCaneria = conexionCaneria;
    }

    public String getFicha() {
        return ficha;
    }

    public void setFicha(String ficha) {
        this.ficha = ficha;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
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
        if (tipo.equalsIgnoreCase("Repuesto")) {
            this.tipo = "Repuesto";
            return;
        }
        if (tipo.equalsIgnoreCase("Producto")) {
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
        if (precio < 0) {
            this.precio = 0;
        }
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "url=" + url + ", sku=" + sku + ", tipo=" + tipo + ", producto=" + producto + ", precio=" + precio + ", caracteristica=" + caracteristica + ", modelo=" + modelo + ", modo=" + modo + ", alimentacion=" + alimentacion + ", consumo=" + consumo + ", capacidadNominal=" + capacidadNominal + ", caudal=" + caudal + ", ruido=" + ruido + ", dimensiones=" + dimensiones + ", peso=" + peso + ", mCaneria=" + mCaneria + ", conexionCaneria=" + conexionCaneria + ", ficha=" + ficha + ", urlImg=" + urlImg + ", Stock=" + Stock + '}';
    }

}

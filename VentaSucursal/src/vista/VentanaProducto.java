/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;

/**
 *
 * @author juanr
 */
public class VentanaProducto extends javax.swing.JFrame {

    /**
     * Creates new form VentanaProducto
     */
    public VentanaProducto() {
        // SKU A USAR
        //GES12-FM
        //APURIFIED.02
        //D003202118
        //115413530

        initComponents();
        Producto producto1 = new Producto();
        producto1.setUrl("https://www.anwo.cl/unidad-interior-tipo--multisplit-muro-12.000-btuh-r410a/ficha_nueva.html?p=50898&c=2804&u=5");
        producto1.setSku("GES12-FM");
        producto1.setTipo("Producto");
        producto1.setProducto("UNIDAD INTERIOR TIPO MULTISPLIT MURO 12.000 BTUH R410A");
        producto1.setPrecio(319);
        producto1.setCaracteristica("Unidad Evaporadora de presentacion muro, Capacidad de Frío 12000 BTUH del Tipo INVERTER.\n"
                + "Alimentacion Monofasica 220V/50HZ.  Incluye Kit de Cañeria de 4 mt. y control remoto Inalambrico.");
        producto1.setModelo("GES12-FM");
        producto1.setModo("FRIO / CALOR");
        producto1.setAlimentacion("220-240/50/1");
        producto1.setConsumo("20");
        producto1.setCapacidadNominal("11900/12500");
        producto1.setCaudal("660/540/460/330");
        producto1.setRuido("42/39/33/26");
        producto1.setDimensiones("845/209/289");
        producto1.setPeso("10");
        producto1.setmCaneria("GKA/GEMS/FM1");
        producto1.setConexionCaneria("1/4 - 3/8");
        producto1.setFicha("https://www.anwo.cl/files/prd_producto/50898/Original%20Ficha%20Free%20Match%202021.pdf");
        producto1.setUrlImg("https://res.cloudinary.com/wpchile/image/fetch/h_400,f_auto,fl_progressive/https://www.anwo.cl/files//prd_producto/50898/GES07_FM.jpg");
        producto1.setStock("5");

        Producto producto2 = new Producto();
        producto2.setUrl("https://www.anwo.cl/purificador-de-aire-ultra/ficha_nueva.html?p=50783&c=2713&u=5");
        producto2.setSku("APURIFIED.02");
        producto2.setTipo("Producto");
        producto2.setProducto("PURIFICADOR DE AIRE ULTRA");
        producto2.setPrecio(4.298);
        producto2.setCaracteristica(" Posee un eficiente sistema de filtración de aire, que en conjunto con su sistema tecnológico de tratamiento de alta temperatura pueden efectivamente capturar y eliminar varios tipos de Virus");
        producto2.setModelo("APURIFIED.02");
        producto2.setModo("ALTO/MEDIO/BAJO/AUTO");
        producto2.setAlimentacion("220-230/50/1");
        producto2.setConsumo("58");
        producto2.setCapacidadNominal("1940");
        producto2.setCaudal("No posee");
        producto2.setRuido("62");
        producto2.setDimensiones("370 x 423 x 1273");
        producto2.setPeso("36.6");
        producto2.setmCaneria("No posee");
        producto2.setConexionCaneria("No posee");
        producto2.setFicha("https://www.anwo.cl/files/prd_producto/50783/Original%20Ficha%20Purificador%20de%20Aire%202020.pdf");
        producto2.setUrlImg("https://res.cloudinary.com/wpchile/image/fetch/h_400,f_auto,fl_progressive/https://www.anwo.cl/files//prd_producto/50783/Purificador%20de%20aire%20ultra_min.jpg");
        producto2.setStock("15");

        Producto producto3 = new Producto();
        producto3.setUrl("https://www.anwo.cl/aislante-lateral-atron/ficha_nueva.html?p=33336&c=2775&u=19");
        producto3.setProducto("AISLANTE LATERAL ATRON");
        producto3.setTipo("Repuesto");
        producto3.setSku("D003202118");
        producto3.setPrecio(6.77);
        producto3.setCaracteristica("Componente con alta resistencia termica.");
        producto3.setUrlImg("https://res.cloudinary.com/wpchile/image/fetch/h_400,f_auto,fl_progressive/https://www.anwo.cl/files//prd_producto/33336/D003202118%2030.jpg");
        producto3.setStock("23");

        Producto producto4 = new Producto();
        producto4.setUrl("https://www.anwo.cl/empaquet.quemador-duo-tec-ga/ficha_nueva.html?p=37004&c=2783&u=19");
        producto4.setProducto("EMPAQUET.QUEMADOR DUO TEC GA");
        producto4.setTipo("Repuesto");
        producto4.setSku("115413530");
        producto4.setPrecio(1.94);
        producto4.setCaracteristica("Componente con alta resistencia termica.");
        producto4.setUrlImg("https://res.cloudinary.com/wpchile/image/fetch/h_400,f_auto,fl_progressive/https://www.anwo.cl/files//prd_producto/37004/115413530%20409.jpg");
        producto4.setStock("9");

        listaProductos.add(producto1);
        listaProductos.add(producto2);
        listaProductos.add(producto3);
        listaProductos.add(producto4);
    }
    ArrayList<Producto> listaProductos = new ArrayList();

    void mostrarDatos(int filtro, String SKU) {

        if (filtro == 1) {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("url");
            modelo.addColumn("SKU");
            modelo.addColumn("Tipo");
            modelo.addColumn("Nombre");
            modelo.addColumn("Precio");
            modelo.addColumn("Caracteristica");
            modelo.addColumn("modelo");
            modelo.addColumn("Modo");
            modelo.addColumn("Alimentacion");
            modelo.addColumn("Consumo W");
            modelo.addColumn("CapacidadNominal");
            modelo.addColumn("Caudal aire (SH,H,M,L)*(M3/H)");
            modelo.addColumn("Ruido");
            modelo.addColumn("Dimensiones");
            modelo.addColumn("Peso");
            modelo.addColumn("MCaneria");
            modelo.addColumn("ConexionCaneria");
            modelo.addColumn("Ficha");
            modelo.addColumn("Url Img");
            modelo.addColumn("Stock");
            tbProducto.setModel(modelo);
            String[] datos = new String[20];
            for (int i = 0; i < listaProductos.size(); i++) {
                if (listaProductos.get(i).getTipo().equals("Producto") && listaProductos.get(i).getSku().equals(SKU)) {
                    datos[0] = listaProductos.get(i).getUrl();
                    datos[1] = listaProductos.get(i).getSku();
                    datos[2] = listaProductos.get(i).getTipo();
                    datos[3] = listaProductos.get(i).getProducto();
                    datos[4] = String.valueOf(listaProductos.get(i).getPrecio());
                    datos[5] = listaProductos.get(i).getCaracteristica();
                    datos[6] = listaProductos.get(i).getModelo();
                    datos[7] = listaProductos.get(i).getModo();
                    datos[8] = listaProductos.get(i).getAlimentacion();
                    datos[9] = listaProductos.get(i).getConsumo();
                    datos[10] = listaProductos.get(i).getCapacidadNominal();
                    datos[11] = listaProductos.get(i).getCaudal();
                    datos[12] = listaProductos.get(i).getRuido();
                    datos[13] = listaProductos.get(i).getDimensiones();
                    datos[14] = listaProductos.get(i).getPeso();
                    datos[15] = listaProductos.get(i).getmCaneria();
                    datos[16] = listaProductos.get(i).getConexionCaneria();
                    datos[17] = listaProductos.get(i).getFicha();
                    datos[18] = listaProductos.get(i).getUrlImg();
                    datos[19] = listaProductos.get(i).getStock();
                    modelo.addRow(datos);
                }
            }
        } else {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("url");
            modelo.addColumn("SKU");
            modelo.addColumn("Tipo");
            modelo.addColumn("Nombre");
            modelo.addColumn("Precio");
            modelo.addColumn("Caracteristica");
            modelo.addColumn("Url Img");
            modelo.addColumn("Stock");
            tbProducto.setModel(modelo);
            String[] datos = new String[8];
            for (int i = 0; i < listaProductos.size(); i++) {
                if (listaProductos.get(i).getTipo().equals("Repuesto") && listaProductos.get(i).getSku().equals(SKU)) {
                    datos[0] = listaProductos.get(i).getUrl();
                    datos[1] = listaProductos.get(i).getSku();
                    datos[2] = listaProductos.get(i).getTipo();
                    datos[3] = listaProductos.get(i).getProducto();
                    datos[4] = String.valueOf(listaProductos.get(i).getPrecio());
                    datos[5] = listaProductos.get(i).getCaracteristica();
                    datos[6] = listaProductos.get(i).getUrlImg();
                    datos[7] = listaProductos.get(i).getStock();
                    modelo.addRow(datos);
                }
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filtro = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtSKU = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProducto = new javax.swing.JTable();
        bntAgregarVenta = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        Producto = new javax.swing.JRadioButton();
        Repuesto = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("SKU");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tbProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbProducto);

        bntAgregarVenta.setText("Agregar a venta");
        bntAgregarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAgregarVentaActionPerformed(evt);
            }
        });

        filtro.add(Producto);
        Producto.setSelected(true);
        Producto.setText("Producto");
        Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoActionPerformed(evt);
            }
        });

        filtro.add(Repuesto);
        Repuesto.setText("Repuesto");
        Repuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepuestoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Producto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Repuesto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Producto)
                    .addComponent(Repuesto))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(342, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bntAgregarVenta)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(txtSKU, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnBuscar)
                        .addGap(326, 326, 326))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(335, 335, 335))))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 903, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSKU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(5, 5, 5)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntAgregarVenta)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RepuestoActionPerformed

    private void ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String sku = txtSKU.getText();
        int filtro;
        if (this.Producto.isSelected()) {
            filtro = 1;
        } else {
            filtro = 2;
        }
        mostrarDatos(filtro, sku);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void bntAgregarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAgregarVentaActionPerformed
        int filtro;
        if (this.Producto.isSelected()) {
            filtro = 1;
        } else {
            filtro = 2;
        }
        String Nombre = tbProducto.getValueAt(tbProducto.getSelectedRow(), 3).toString();
        int Cantidad = 1;
        String precio = tbProducto.getValueAt(tbProducto.getSelectedRow(), 4).toString();
        System.out.println(Nombre);
        System.out.println(Cantidad);
        System.out.println(precio);
    }//GEN-LAST:event_bntAgregarVentaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Producto;
    private javax.swing.JRadioButton Repuesto;
    private javax.swing.JButton bntAgregarVenta;
    private javax.swing.JButton btnBuscar;
    private javax.swing.ButtonGroup filtro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Panel panel1;
    private javax.swing.JTable tbProducto;
    private javax.swing.JTextField txtSKU;
    // End of variables declaration//GEN-END:variables
}

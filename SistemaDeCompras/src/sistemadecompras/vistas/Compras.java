package sistemadecompras.vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import sistemadecompras.acceso.CompraData;
import sistemadecompras.acceso.ProductoData;
import sistemadecompras.acceso.ProveedorData;
import sistemadecompras.entidades.Producto;
import sistemadecompras.entidades.Proveedor;

public class Compras extends javax.swing.JInternalFrame {

    private final DefaultTableModel modelo = new DefaultTableModel();

    public Compras() {
        initComponents();
        Menu m = new Menu();
        m.centrarInternalFrame(this);

        cargarCombos();
        armarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbLimpiar = new javax.swing.JButton();
        jbComprar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLista = new javax.swing.JTable();
        jcbProductos = new javax.swing.JComboBox<>();
        jtfCantidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jcbProveedores = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbAgregarALista = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jlTotal = new javax.swing.JLabel();

        jbLimpiar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        jbLimpiar.setText("Borrar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbComprar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        jbComprar.setText("Comprar");
        jbComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbComprarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        jLabel2.setText("Realizar Compras");

        jtLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Precio Unitario", "SubTotal"
            }
        ));
        jScrollPane1.setViewportView(jtLista);

        jcbProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Productos" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        jLabel1.setText("Cantidad:");

        jcbProveedores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Proveedores" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        jLabel3.setText("Seleccionar ");

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        jLabel4.setText("Seleccionar ");

        jbAgregarALista.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        jbAgregarALista.setText("Agregar a la lista");
        jbAgregarALista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarAListaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel5.setText("TOTAL:");

        jlTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlTotal.setText("$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbLimpiar)
                                .addGap(137, 137, 137)
                                .addComponent(jbComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(142, 142, 142)
                                .addComponent(jbSalir)))
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jcbProductos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbProveedores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jtfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbAgregarALista)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAgregarALista))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jlTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpiar)
                    .addComponent(jbComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbComprarActionPerformed

        //PARA SACAR ID PROVEEDOR
       String proveedor =  (String) jcbProveedores.getSelectedItem();
       String id = proveedor.substring(0, 1);
        int idProveedor = Integer.parseInt(id);
       
        //PARA SACAR LISTA DE PRODUCTOS QUE VA A DETALLE
        List<String> detalle = new ArrayList<>();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            String nombreProducto = (String) modelo.getValueAt(i, 0);
            detalle.add(nombreProducto);
        }
        //PARA SACAR CANTIDAD TOTAL DE PRODUCTOS
        int cant = 0;
        for (int i = 0; i < modelo.getRowCount(); i++) {
            int cantidad = (int) modelo.getValueAt(i, 1);
            cant = cant + cantidad;
        }
        //PARA SACAR TOTAL MONEY DEL LABEL
        String totalS = jlTotal.getText();
        Double total = Double.parseDouble(totalS.substring(1));

        //LLAMAR A GUARDARCOMPRA
        CompraData c= new CompraData();
        c.guardarCompra(idProveedor, detalle, cant, total);
    }//GEN-LAST:event_jbComprarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbAgregarAListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarAListaActionPerformed
        actualizarFilas();
    }//GEN-LAST:event_jbAgregarAListaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregarALista;
    private javax.swing.JButton jbComprar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcbProductos;
    private javax.swing.JComboBox<String> jcbProveedores;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JTable jtLista;
    private javax.swing.JTextField jtfCantidad;
    // End of variables declaration//GEN-END:variables

    private void cargarCombos() {

        ProveedorData proveedor = new ProveedorData();
        ProductoData producto = new ProductoData();

        List listaProveedor = proveedor.listarProveedores();
        List listaProducto = producto.listarProducto();

        for (int indice = 0; indice < listaProveedor.size(); indice++) {
            jcbProveedores.addItem(String.valueOf(listaProveedor.get(indice)));
            
        }

        for (int indice = 0; indice < listaProducto.size(); indice++) {
            jcbProductos.addItem(String.valueOf(listaProducto.get(indice)));
        }

    }

    private void armarCabecera() {
        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio Unitario");
        modelo.addColumn("Subtotal");
        jtLista.setModel(modelo);
    }

    private void borrarFilas() {
        int filas = jtLista.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void actualizarFilas() {
        borrarFilas();
        
        
        String cantidad = jtfCantidad.getText();
        ProductoData productodata = new ProductoData();
        String producto = (String) jcbProductos.getSelectedItem();
        String id = producto.substring(0, 1);
        System.out.println(id);
        int idProducto = Integer.parseInt(id);
        
        double precio = productodata.traerPrecioPorId(idProducto);
        
        double subtotal = precio * (Integer.parseInt(cantidad));
        
        
        
    }

}

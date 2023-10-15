package sistemadecompras.vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistemadecompras.acceso.CompraData;
import sistemadecompras.acceso.DetalleCompraData;
import sistemadecompras.acceso.ProductoData;
import sistemadecompras.acceso.ProveedorData;
import sistemadecompras.entidades.DetalleCompra;

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
        jbComprar.setEnabled(false);
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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtLista);
        if (jtLista.getColumnModel().getColumnCount() > 0) {
            jtLista.getColumnModel().getColumn(1).setMaxWidth(80);
            jtLista.getColumnModel().getColumn(2).setMaxWidth(80);
            jtLista.getColumnModel().getColumn(3).setMaxWidth(80);
        }

        jcbProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Productos" }));
        jcbProductos.setEnabled(false);
        jcbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProductosActionPerformed(evt);
            }
        });

        jtfCantidad.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        jLabel1.setText("Cantidad:");

        jcbProveedores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Proveedores" }));
        jcbProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProveedoresActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        jLabel3.setText("Seleccionar ");

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        jLabel4.setText("Seleccionar ");

        jbAgregarALista.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        jbAgregarALista.setText("Agregar a la lista");
        jbAgregarALista.setEnabled(false);
        jbAgregarALista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarAListaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel5.setText("TOTAL: $");

        jlTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlTotal.setText("-");

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
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
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
        limpiarCampos();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbComprarActionPerformed
        comprar();
        limpiarCampos();
    }//GEN-LAST:event_jbComprarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbAgregarAListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarAListaActionPerformed
        actualizarFilas();
        actualizarPrecio();
        checkCampos();
    }//GEN-LAST:event_jbAgregarAListaActionPerformed

    private void jcbProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProveedoresActionPerformed
        checkCampos();
    }//GEN-LAST:event_jcbProveedoresActionPerformed

    private void jcbProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProductosActionPerformed
        checkCampos();
    }//GEN-LAST:event_jcbProductosActionPerformed


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

    private void limpiarCampos() {
        jcbProveedores.setEnabled(true);
        jcbProveedores.setSelectedIndex(0);
        jcbProductos.setEnabled(false);
        jcbProductos.setSelectedIndex(0);
        jtfCantidad.setEnabled(false);
        jtfCantidad.setText("");
        jbAgregarALista.setEnabled(false);
        jbComprar.setEnabled(false);
        jlTotal.setText("-");
        borrarFilas();
    }

    private void checkCampos() {
        boolean proveedorSeleccionado = (jcbProveedores.getSelectedIndex() != 0);
        boolean productoSeleccionado = (jcbProductos.getSelectedIndex() != 0);
        boolean cantidadIngresada = !jtfCantidad.getText().isEmpty();

        if (proveedorSeleccionado) {
            jcbProveedores.setEnabled(false);
            jcbProductos.setEnabled(true);
            jtfCantidad.setEnabled(false);
            jbAgregarALista.setEnabled(false);
            jbComprar.setEnabled(false);
        }

        if (productoSeleccionado) {
            jtfCantidad.setEnabled(true);
            jbAgregarALista.setEnabled(true);
        }

        if (cantidadIngresada) {
            jbComprar.setEnabled(true);
        }
    }

    private void actualizarFilas() {

        String cantidad = jtfCantidad.getText();

        ProductoData productodata = new ProductoData();
        String producto = (String) jcbProductos.getSelectedItem();
        String id = producto.substring(0, 1);

        int idProducto = Integer.parseInt(id);

        double precio = productodata.traerPrecioPorId(idProducto);
        try {
            double subtotal = precio * (Integer.parseInt(cantidad));

            Object[] datos = {producto, cantidad, precio, subtotal};
            modelo.addRow(datos);
         
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad valida");
            jtfCantidad.setText("");
        }
    }

    private void actualizarPrecio() {

        double total = 0;
        double suma = 0;
        for (int i = 0; i < modelo.getRowCount(); i++) {
            total = (Double) modelo.getValueAt(i, 3);
            suma += total;
        }

        jlTotal.setText(String.valueOf(suma));
    }

    private void comprar() {
        
        //PARA SACAR ID PROVEEDOR
        String proveedor = (String) jcbProveedores.getSelectedItem();
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
            try {
                int cantidad = Integer.parseInt(modelo.getValueAt(i, 1).toString());
                cant = cant + cantidad;
            } catch (NumberFormatException e) {
                System.out.println("Error al convertir a entero en la fila " + i);
            }
        }
        //PARA SACAR TOTAL MONEY DEL LABEL
        String totalS = jlTotal.getText();
        Double total = Double.parseDouble(totalS.substring(1));

        //LLAMAR A GUARDARCOMPRA
        CompraData c = new CompraData();
        int idCompra=c.guardarCompra(idProveedor, detalle, cant, total);
        System.out.println(idCompra);
      
        //LLAMAR DETALLE COMPRA
        guardarDetalleCompra(idCompra);
         
        sumarStock();
      
    }

    private void sumarStock() {
        ProductoData productodata = new ProductoData();

        int id;
        int cant;
        for (int i = 0; i < modelo.getRowCount(); i++) {
          
            String idString = modelo.getValueAt(i, 0).toString();
            String[] parts = idString.split(" ");
            id = Integer.parseInt(parts[0]);
            cant = Integer.parseInt(modelo.getValueAt(i, 1).toString());

            productodata.modificarStock(id, cant);
            System.out.println(id + "-" + cant);
        }
    }
    private void guardarDetalleCompra(int idCompra) {
        DetalleCompraData detalleCompra= new DetalleCompraData();

        int idProducto;
        int cant;
        double precioCosto;
        System.out.println(idCompra);
        for (int i = 0; i < modelo.getRowCount(); i++) {
          
            String idString = modelo.getValueAt(i, 0).toString();
            String[] parts = idString.split(" ");
            idProducto = Integer.parseInt(parts[0]);
            cant = Integer.parseInt(modelo.getValueAt(i, 1).toString());
            precioCosto =Double.parseDouble(modelo.getValueAt(i, 3).toString());

            detalleCompra.agregarDetalleCompra(cant,precioCosto,idCompra,idProducto);
            
        }
        
    }
    
    
}

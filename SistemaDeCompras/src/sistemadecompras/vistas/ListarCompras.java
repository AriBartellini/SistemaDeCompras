package sistemadecompras.vistas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import sistemadecompras.acceso.CompraData;
import sistemadecompras.acceso.ProveedorData;
import sistemadecompras.entidades.Compra;

public class ListarCompras extends javax.swing.JInternalFrame {
    
    private boolean cambios;
     private DetalleCompra detalle;
     
    public ListarCompras() {
        initComponents();
       
        Menu m = new Menu();
        m.centrarInternalFrame(this);
        llenarTabla();
         this.detalle = new DetalleCompra(m, true);
         detalle.setLocationRelativeTo(m);
///////////////////////////////////////////////// ESTO ES PARA ACTIVAR EL BOTON DE MODIFICAR
        DefaultTableModel modelo = (DefaultTableModel) jtLista.getModel();
        modelo.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                cambios = true;
                checkCampos();
            }
        });
        
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLista = new javax.swing.JTable();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbDetalle = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        jLabel2.setText(" Compras");

        jtLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Fecha", "Provedores", "Productos", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jtListaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtLista);
        if (jtLista.getColumnModel().getColumnCount() > 0) {
            jtLista.getColumnModel().getColumn(0).setMaxWidth(40);
            jtLista.getColumnModel().getColumn(3).setMaxWidth(80);
            jtLista.getColumnModel().getColumn(4).setMaxWidth(80);
        }

        jbModificar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbDetalle.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        jbDetalle.setText("Mostrar Detalle");
        jbDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDetalleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbModificar)
                                .addGap(61, 61, 61)
                                .addComponent(jbDetalle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbEliminar)
                                .addGap(81, 81, 81)
                                .addComponent(jbSalir))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar)
                    .addComponent(jbEliminar)
                    .addComponent(jbSalir)
                    .addComponent(jbDetalle))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
      int filaSeleccionada = jtLista.getSelectedRow();

        if (filaSeleccionada != -1) {
            int idCompra = (int) jtLista.getValueAt(filaSeleccionada, 0);
            String nombreProveedor = (String) jtLista.getValueAt(filaSeleccionada, 1);
            Double total = (Double) jtLista.getValueAt(filaSeleccionada, 2);
            int cantidad= (int) jtLista.getValueAt(filaSeleccionada, 3);
           Compra compra = new Compra(idCompra, nombreProveedor, cantidad, total );
            CompraData c = new CompraData();
            c.modificarCompra(compra, idCompra);

            llenarTabla();
            cambios = false; //////////// cambio
            checkCampos();
        }else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una compra para eliminar.", "Sin selección", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
       int filaSeleccionada = jtLista.getSelectedRow();

        if (filaSeleccionada != -1) {
            int idCompra = (int) jtLista.getValueAt(filaSeleccionada, 0);
            CompraData p = new CompraData();
            p.eliminarCompraPorId(idCompra);
            llenarTabla();
            checkCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un producto para eliminar.", "Sin selección", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtListaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtListaMouseReleased
           jbEliminar.setEnabled(true);
    }//GEN-LAST:event_jtListaMouseReleased

    private void jbDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDetalleActionPerformed
      detalle.setVisible(true);
    }//GEN-LAST:event_jbDetalleActionPerformed

private void llenarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) jtLista.getModel();
        modelo.setRowCount(0);
        CompraData p = new CompraData();
        ProveedorData pd = new ProveedorData();
       
        List<Compra> lista = p.listarCompra();
        lista.forEach((elemento) -> {
             String proveedor = pd.buscarProveedor(elemento.getIdProv()).toString();
            modelo.addRow(new Object[]{elemento.getIdCompra(), elemento.getFecha(), proveedor , elemento.getCantidad(), elemento.getTotal()});
        });
        checkCampos();
    }

private void checkCampos() {
        if (cambios) {
            jbModificar.setEnabled(true);
        } else {
            jbModificar.setEnabled(false);
        }

        int filaSeleccionada = jtLista.getSelectedRow();
        if (filaSeleccionada != -1) {
            jbEliminar.setEnabled(true);
        } else {
            jbEliminar.setEnabled(false);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbDetalle;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTable jtLista;
    // End of variables declaration//GEN-END:variables
}

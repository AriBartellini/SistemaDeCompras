package sistemadecompras.vistas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import sistemadecompras.acceso.ProveedorData;
import sistemadecompras.entidades.Proveedor;

public class ListarProveedores extends javax.swing.JInternalFrame {

    private boolean cambios;

    @SuppressWarnings("Convert2Lambda")

    public ListarProveedores() {
        initComponents();
        Menu m = new Menu();
        m.centrarInternalFrame(this);
        llenarTabla();
        ///////////////////////////////////////////////// ESTO ES PARA ACTIVAR EL BOTON DE MODIFICAR
        DefaultTableModel modelo = (DefaultTableModel) jtProveedores.getModel();
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
        jtProveedores = new javax.swing.JTable();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        jLabel2.setText("Proveedores");

        jtProveedores.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        jtProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Telefono", "Direccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtProveedores.setNextFocusableComponent(jbEliminar);
        jtProveedores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jtProveedores.getTableHeader().setReorderingAllowed(false);
        jtProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jtProveedoresMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtProveedores);
        if (jtProveedores.getColumnModel().getColumnCount() > 0) {
            jtProveedores.getColumnModel().getColumn(0).setMaxWidth(40);
            jtProveedores.getColumnModel().getColumn(2).setMaxWidth(60);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbModificar)
                                .addGap(108, 108, 108)
                                .addComponent(jbEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar)
                    .addComponent(jbEliminar)
                    .addComponent(jbSalir))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed

        int filaSeleccionada = jtProveedores.getSelectedRow();

        if (filaSeleccionada != -1) {
            int idProveedor = (int) jtProveedores.getValueAt(filaSeleccionada, 0);
            String nombreProveedor = (String) jtProveedores.getValueAt(filaSeleccionada, 1);
            String direccion = (String) jtProveedores.getValueAt(filaSeleccionada, 2);
            String telefono = (String) jtProveedores.getValueAt(filaSeleccionada, 3);

            Proveedor proveedor = new Proveedor(idProveedor, nombreProveedor, direccion, telefono);
            ProveedorData p = new ProveedorData();
            p.modificarProveedor(proveedor);

            llenarTabla();
            cambios = false; //////////// cambio
            checkCampos();
        } else {

            JOptionPane.showMessageDialog(this, "Por favor, seleccione un proveedor para modificar.", "Sin selección", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        int filaSeleccionada = jtProveedores.getSelectedRow();

        if (filaSeleccionada != -1) {
            int idProv = (int) jtProveedores.getValueAt(filaSeleccionada, 0);
            ProveedorData p = new ProveedorData();
            p.eliminarProveedor(idProv);
            llenarTabla();
            checkCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un proveedor para eliminar.", "Sin selección", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtProveedoresMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProveedoresMouseReleased
      jbEliminar.setEnabled(true);
    }//GEN-LAST:event_jtProveedoresMouseReleased

    private void llenarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) jtProveedores.getModel();
        modelo.setRowCount(0);
        ProveedorData p = new ProveedorData();
        List<Proveedor> lista = p.listarProveedores();
        lista.forEach((elemento) -> {
            modelo.addRow(new Object[]{elemento.getIdProveedor(), elemento.getNombreProveedor(), elemento.getTelefono(), elemento.getDomicilio()});
        });
        checkCampos();
    }

    private void checkCampos() {
        if (cambios) {
            jbModificar.setEnabled(true);
        } else {
            jbModificar.setEnabled(false);

        }
  
        int filaSeleccionada = jtProveedores.getSelectedRow();

        if (filaSeleccionada != -1) {
            jbEliminar.setEnabled(true);
        } else {
            jbEliminar.setEnabled(false);
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTable jtProveedores;
    // End of variables declaration//GEN-END:variables
}

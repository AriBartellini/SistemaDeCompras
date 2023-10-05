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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Proveedores");

        jtProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "idProveedor", "Nombre", "Telefono", "Direccion"
            }
        ));
        jtProveedores.setColumnSelectionAllowed(true);
        jtProveedores.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtProveedores);
        jtProveedores.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jtProveedores.getColumnModel().getColumnCount() > 0) {
            jtProveedores.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

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
                        .addGap(123, 123, 123)
                        .addComponent(jbModificar)
                        .addGap(38, 38, 38)
                        .addComponent(jbEliminar)
                        .addGap(43, 43, 43)
                        .addComponent(jbSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar)
                    .addComponent(jbEliminar)
                    .addComponent(jbSalir))
                .addContainerGap(29, Short.MAX_VALUE))
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
            checkCampos();
        } else {

            JOptionPane.showMessageDialog(this, "Por favor, seleccione un proveedor para modificar.", "Sin selección", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void llenarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) jtProveedores.getModel();
        modelo.setRowCount(0);
        ProveedorData p = new ProveedorData();
        List<Proveedor> lista = p.listarProveedores();
        lista.forEach((elemento) -> {
            modelo.addRow(new Object[]{elemento.getIdProveedor(), elemento.getNombreProveedor(), elemento.getDomicilio(), elemento.getTelefono()});
        });
        checkCampos();
    }

    private void checkCampos() {
         if (cambios) {
            jbModificar.setEnabled(true);
        } else {
            jbModificar.setEnabled(false);
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

package sistemadecompras.vistas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import sistemadecompras.acceso.ProductoData;
import sistemadecompras.entidades.Producto;

public class ListarProductos extends javax.swing.JInternalFrame {

    private boolean cambios;

    public ListarProductos() {
        initComponents();
        Menu m = new Menu();
        m.centrarInternalFrame(this);
        llenarTabla();
        ///////////////////////////////////////////////// ESTO ES PARA ACTIVAR EL BOTON DE MODIFICAR
        DefaultTableModel modelo = (DefaultTableModel) jtProductos.getModel();
        modelo.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                cambios = true;
                checkCampos();
            }
        });
    }

    private void llenarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) jtProductos.getModel();
        modelo.setRowCount(0);
        ProductoData p = new ProductoData();
        List<Producto> lista = p.listarProducto();
        lista.forEach((elemento) -> {
            modelo.addRow(new Object[]{elemento.getIdProducto(), elemento.getNombreProducto(), elemento.getPrecio()});
        });
        checkCampos();
    }

    private void checkCampos() {
        if (cambios) {
            jbModificar.setEnabled(true);
        } else {
            jbModificar.setEnabled(false);

        }

        int filaSeleccionada = jtProductos.getSelectedRow();
        if (filaSeleccionada != -1) {
            jbEliminar.setEnabled(true);
        } else {
            jbEliminar.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        jLabel2.setText("Productos");

        jtProductos.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nombre", "PrecioCosto"
            }
        ));
        jtProductos.getTableHeader().setReorderingAllowed(false);
        jtProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jtProductosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtProductos);
        if (jtProductos.getColumnModel().getColumnCount() > 0) {
            jtProductos.getColumnModel().getColumn(0).setMaxWidth(40);
            jtProductos.getColumnModel().getColumn(1).setResizable(false);
            jtProductos.getColumnModel().getColumn(2).setMaxWidth(80);
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
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbModificar)
                                .addGap(113, 113, 113)
                                .addComponent(jbEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSalir))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar)
                    .addComponent(jbEliminar)
                    .addComponent(jbSalir))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        int filaSeleccionada = jtProductos.getSelectedRow();

        if (filaSeleccionada != -1) {
            int idProducto = (int) jtProductos.getValueAt(filaSeleccionada, 0);
            String nombreProducto = (String) jtProductos.getValueAt(filaSeleccionada, 1);
            Double precioCosto = (Double) jtProductos.getValueAt(filaSeleccionada, 2);
            Producto producto = new Producto(idProducto, nombreProducto, precioCosto);
            ProductoData p = new ProductoData();
            p.modificarProducto(producto);

            llenarTabla();
            cambios = false; //////////// cambio
            checkCampos();
        }else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un producto para eliminar.", "Sin selección", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
         int filaSeleccionada = jtProductos.getSelectedRow();

        if (filaSeleccionada != -1) {
            int idProducto = (int) jtProductos.getValueAt(filaSeleccionada, 0);
            ProductoData p = new ProductoData();
            p.eliminarProductoPorId(idProducto);
            llenarTabla();
            checkCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un producto para eliminar.", "Sin selección", JOptionPane.WARNING_MESSAGE);
       
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtProductosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductosMouseReleased
       jbEliminar.setEnabled(true);
    }//GEN-LAST:event_jtProductosMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTable jtProductos;
    // End of variables declaration//GEN-END:variables

}

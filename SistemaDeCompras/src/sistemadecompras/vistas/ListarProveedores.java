package sistemadecompras.vistas;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import sistemadecompras.acceso.ProveedorData;
import sistemadecompras.entidades.Proveedor;

public class ListarProveedores extends javax.swing.JInternalFrame {

    private final DefaultTableModel modelo;

    public ListarProveedores() {
        initComponents();
        Menu m = new Menu();
        m.centrarInternalFrame(this);
        this.modelo = new DefaultTableModel();
        llenarTabla();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProveedores = new javax.swing.JTable();
        jbLimpiar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
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
                "idProveedor", "Nombre", "Direccion", "Telefono"
            }
        ));
        jtProveedores.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtProveedores);
        if (jtProveedores.getColumnModel().getColumnCount() > 0) {
            jtProveedores.getColumnModel().getColumn(3).setResizable(false);
        }

        jbLimpiar.setText("Modificar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Eliminar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
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
                        .addComponent(jbLimpiar)
                        .addGap(38, 38, 38)
                        .addComponent(jbGuardar)
                        .addGap(43, 43, 43)
                        .addComponent(jbSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpiar)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    private void llenarTabla() {
        
        ProveedorData p = new ProveedorData();
        List<Proveedor> lista = p.listarProveedores();
        lista.forEach((elemento) -> {
      
            modelo.addRow(new Object[]{elemento.getIdProveedor(), elemento.getNombreProveedor(), elemento.getDomicilio(), elemento.getTelefono()});
        });
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTable jtProveedores;
    // End of variables declaration//GEN-END:variables
}

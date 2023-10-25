package sistemadecompras.vistas;

import com.formdev.flatlaf.json.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import sistemadecompras.acceso.CompraData;
import sistemadecompras.acceso.ProveedorData;
import sistemadecompras.entidades.Compra;

public class ListarCompras extends javax.swing.JInternalFrame {

    private DetalleCompra detalle;
    private int idComp = 18;

    public ListarCompras() {
        initComponents();

        Menu m = new Menu();
        m.centrarInternalFrame(this);
        llenarTabla();
        llenarProveedores();
        this.detalle = new DetalleCompra(m, true, idComp);
        detalle.setLocationRelativeTo(m);
        //////////////////////////////////////// ESTO ES PARA ACTIVAR EL BOTON DE MODIFICAR
        DefaultTableModel modelo = (DefaultTableModel) jtLista.getModel();
        modelo.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLista = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        jbDetalle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jdc = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jcbProveedores = new javax.swing.JComboBox<>();
        jbBorrarFiltros = new javax.swing.JButton();

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

        jLabel1.setText("Buscar por fecha");

        jdc.setMaxSelectableDate(new java.util.Date(1735704099000L));
        jdc.setMinSelectableDate(new java.util.Date(1641009699000L));
        jdc.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jdcInputMethodTextChanged(evt);
            }
        });
        jdc.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdcPropertyChange(evt);
            }
        });

        jLabel3.setText("Buscar por proveedor");

        jcbProveedores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jcbProveedores.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbProveedoresItemStateChanged(evt);
            }
        });

        jbBorrarFiltros.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jbBorrarFiltros.setText("Borrar Filtros");
        jbBorrarFiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarFiltrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jbDetalle)
                            .addGap(43, 43, 43)
                            .addComponent(jbBorrarFiltros)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbSalir))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jdc, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbDetalle)
                    .addComponent(jbBorrarFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtListaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtListaMouseReleased
        
    }//GEN-LAST:event_jtListaMouseReleased

    private void jbDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDetalleActionPerformed
        int filaSeleccionada = jtLista.getSelectedRow();

        if (filaSeleccionada != -1) {
            int idCompra = (int) jtLista.getValueAt(filaSeleccionada, 0);
            Menu m = new Menu();
            m.centrarInternalFrame(this);
            this.idComp = idCompra;
            this.detalle = new DetalleCompra(m, true, idComp);
            detalle.setLocationRelativeTo(m);
            detalle.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Elija un Producto", "Mensaje", JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_jbDetalleActionPerformed

    private void jcbProveedoresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbProveedoresItemStateChanged

        if ("Seleccionar".equals((String) jcbProveedores.getSelectedItem())) {
            llenarTabla();
        } else {
            String proveedor = (String) jcbProveedores.getSelectedItem();
            int idProveedor = Integer.valueOf(proveedor.substring(0, 1));

            //LLENARTABLA por proveedor
            DefaultTableModel modelo = (DefaultTableModel) jtLista.getModel();
            modelo.setRowCount(0);
            CompraData p = new CompraData();
            List<Compra> lista = p.listarCompraPorProveedor(idProveedor);
            lista.forEach((elemento) -> {
                modelo.addRow(new Object[]{elemento.getIdCompra(), elemento.getFecha(), idProveedor, elemento.getCantidad(), elemento.getTotal()});
            });
            
        }
    }//GEN-LAST:event_jcbProveedoresItemStateChanged

    private void jbBorrarFiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarFiltrosActionPerformed
        jcbProveedores.setSelectedItem("Seleccionar");
        llenarTabla();
    }//GEN-LAST:event_jbBorrarFiltrosActionPerformed

    private void jdcInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jdcInputMethodTextChanged
       /* try {
            String fechaString = jdc.getDate() != null ? jdc.getDate().toString() : null;

            if (fechaString != null && !fechaString.isEmpty()) {
                try {
                    SimpleDateFormat inputFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH);
                    java.util.Date fechaUtil = inputFormat.parse(fechaString);
                    java.sql.Date fechaDate = new java.sql.Date(fechaUtil.getTime());

                    DefaultTableModel modelo = (DefaultTableModel) jtLista.getModel();
                    modelo.setRowCount(0);
                    CompraData p = new CompraData();

                    ArrayList<Compra> lista = (ArrayList<Compra>) p.listarCompraPorFecha(fechaDate);

                    lista.forEach((elemento) -> {
                        modelo.addRow(new Object[]{elemento.getIdCompra(), elemento.getFecha(), elemento.getProv(), elemento.getCantidad(), elemento.getTotal()});
                    });

                    checkCampos();
                } catch (ParseException | java.text.ParseException ex) {
                    llenarTabla();
                }
            } else {
                llenarTabla();
            }
        } catch (NullPointerException n) {
            JOptionPane.showMessageDialog(this, "Problemas en jdcPropertyChange.", "Sin selección", JOptionPane.WARNING_MESSAGE);
        }*/
    }//GEN-LAST:event_jdcInputMethodTextChanged

    private void jdcPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdcPropertyChange
        try {
            String fechaString = jdc.getDate() != null ? jdc.getDate().toString() : null;

            if (fechaString != null && !fechaString.isEmpty()) {
                try {
                    SimpleDateFormat inputFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH);
                    java.util.Date fechaUtil = inputFormat.parse(fechaString);
                    java.sql.Date fechaDate = new java.sql.Date(fechaUtil.getTime());

                    DefaultTableModel modelo = (DefaultTableModel) jtLista.getModel();
                    modelo.setRowCount(0);
                    CompraData p = new CompraData();

                    ArrayList<Compra> lista = (ArrayList<Compra>) p.listarCompraPorFecha(fechaDate);

                    lista.forEach((elemento) -> {
                        modelo.addRow(new Object[]{elemento.getIdCompra(), elemento.getFecha(), elemento.getProv(), elemento.getCantidad(), elemento.getTotal()});
                    });

                    
                } catch (ParseException | java.text.ParseException ex) {
                    llenarTabla();
                }
            } else {
                llenarTabla();
            }
        } catch (NullPointerException n) {
            JOptionPane.showMessageDialog(this, "Problemas en jdcPropertyChange.", "Sin selección", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jdcPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBorrarFiltros;
    private javax.swing.JButton jbDetalle;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcbProveedores;
    private com.toedter.calendar.JDateChooser jdc;
    private javax.swing.JTable jtLista;
    // End of variables declaration//GEN-END:variables

    

    private void llenarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) jtLista.getModel();
        modelo.setRowCount(0);
        CompraData p = new CompraData();
        ProveedorData pd = new ProveedorData();

        List<Compra> lista = p.listarCompra();
        lista.forEach((elemento) -> {
            String proveedor = pd.buscarProveedor(elemento.getIdProv()).toString();
            modelo.addRow(new Object[]{elemento.getIdCompra(), elemento.getFecha(), proveedor, elemento.getCantidad(), elemento.getTotal()});
        });
       
    }

    private void eliminar() {
        int filaSeleccionada = jtLista.getSelectedRow();

        if (filaSeleccionada != -1) {
            int idCompra = (int) jtLista.getValueAt(filaSeleccionada, 0);
            CompraData p = new CompraData();
            p.eliminarCompraPorId(idCompra);
            llenarTabla();
            
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un producto para eliminar.", "Sin selección", JOptionPane.WARNING_MESSAGE);

        }
    }

    private void llenarProveedores() {
        ProveedorData proveedor = new ProveedorData();
        List listaProveedor = proveedor.listarProveedores();
        for (int indice = 0; indice < listaProveedor.size(); indice++) {
            jcbProveedores.addItem(String.valueOf(listaProveedor.get(indice)));

        }

    }

}

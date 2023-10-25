package sistemadecompras.vistas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import sistemadecompras.acceso.DetalleCompraData;
import sistemadecompras.acceso.CompraData;

public class DetalleCompra extends javax.swing.JDialog {

    public int valorID = -1;

    public int getValorID() {
        return valorID;
    }

    public void setValorID(int valorID) {
        this.valorID = valorID;
    }
    Menu m = new Menu();
    private final DefaultTableModel modelo = new DefaultTableModel();

    public DetalleCompra(Menu m, boolean modal, int id) {
        super(m, modal);
        this.valorID = id;
        setValorID(id);
        initComponents();
        armarTabla(getValorID());

    }

    private void borrarFilas() {
        int filas = modelo.getRowCount();
        while (filas > 0) {
            modelo.removeRow(--filas);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlTotal = new javax.swing.JLabel();
        jlProveedor = new javax.swing.JLabel();
        jlFecha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDetalle = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlFecha1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        jLabel3.setText("Fecha");

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        jLabel5.setText("TOTAL:");

        jlTotal.setText("$");

        jlProveedor.setText("xxxxxx");

        jlFecha.setText("xxxxxx");

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 30)); // NOI18N
        jLabel2.setText("Detalle de Compra");

        jtDetalle.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        jtDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Precio Unitario", "Subtotal"
            }
        ));
        jScrollPane1.setViewportView(jtDetalle);
        if (jtDetalle.getColumnModel().getColumnCount() > 0) {
            jtDetalle.getColumnModel().getColumn(1).setMaxWidth(80);
            jtDetalle.getColumnModel().getColumn(2).setMaxWidth(80);
            jtDetalle.getColumnModel().getColumn(3).setMaxWidth(150);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        jLabel1.setText("Proveedor");

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        jLabel4.setText("Id Compra");

        jlFecha1.setText("xxxxxx");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jlTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jlFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jlProveedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jlFecha1))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTotal)
                    .addComponent(jLabel5))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(DetalleCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalleCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalleCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalleCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DetalleCompra dialog = new DetalleCompra((Menu) new javax.swing.JFrame(), true, getValorID());
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JLabel jlFecha1;
    private javax.swing.JLabel jlProveedor;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JTable jtDetalle;
    // End of variables declaration//GEN-END:variables
private void armarTabla(int idCompra) {
        int total = 0;
        armarCabecera();
        borrarFilas();
        DetalleCompraData detalleCompra = new DetalleCompraData();

        CompraData Compra = new CompraData();
        List listaCompra = Compra.listarCompraIdCompra(idCompra);
        String filaCompra = listaCompra.toString();
        try{
        String[] datosCompra = filaCompra.split(" ");
        String idProveedor = datosCompra[1];
        String fechaCompra = datosCompra[2] + "  [" + datosCompra[3];
        jlProveedor.setText(String.valueOf(idProveedor));
        jlFecha1.setText(String.valueOf(idCompra));
        jlFecha.setText(fechaCompra);
        } catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "no hay compras realizadas");
            this.dispose();
        }
        

        List lista = detalleCompra.listarDetalleCompra(idCompra);

        for (int i = 0; i < lista.size(); i++) {
            String fila = lista.get(i).toString();
            String[] data = fila.split(" ");
            modelo.addRow(new Object[]{data[0], data[1], data[2], data[3]});

            double totalx = 0;
            double suma = 0;
            for (int k = 0; k < modelo.getRowCount(); k++) {
                String valorCelda = (String) modelo.getValueAt(k, 3);
                totalx = Double.parseDouble(valorCelda);
                suma += totalx;
            }
            jlTotal.setText(String.valueOf(suma));
        }

    }

    private void armarCabecera() {

        modelo.addColumn("ID Compra");
        modelo.addColumn("ID Producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("SubTotal");
        jtDetalle.setModel(modelo);
    }
}

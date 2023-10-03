package sistemadecompras.vistas;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        determinarFondo();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JLayeredPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmRegistroProveedor = new javax.swing.JMenuItem();
        jmRegistroProducto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmCompras = new javax.swing.JMenuItem();
        jmDetalleCompra = new javax.swing.JMenuItem();
        jmActualizar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 862, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
        );

        jMenu1.setText("Registro ");

        jmRegistroProveedor.setText("Registro Proveedor");
        jmRegistroProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRegistroProveedorActionPerformed(evt);
            }
        });
        jMenu1.add(jmRegistroProveedor);

        jmRegistroProducto.setText("Registro Producto");
        jmRegistroProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRegistroProductoActionPerformed(evt);
            }
        });
        jMenu1.add(jmRegistroProducto);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Compras");

        jmCompras.setText("Compras");
        jmCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmComprasActionPerformed(evt);
            }
        });
        jMenu2.add(jmCompras);

        jmDetalleCompra.setText("Detalle de compra");
        jmDetalleCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmDetalleCompraActionPerformed(evt);
            }
        });
        jMenu2.add(jmDetalleCompra);

        jMenuBar1.add(jMenu2);

        jmActualizar.setText("Actualizacion Stock");
        jmActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmActualizarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmActualizar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmRegistroProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRegistroProveedorActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        determinarFondo();
        RegistroProveedor rp = new RegistroProveedor();
        rp.setVisible(true);
        escritorio.add(rp);
        escritorio.moveToFront(rp);
    }//GEN-LAST:event_jmRegistroProveedorActionPerformed

    private void jmRegistroProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRegistroProductoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        determinarFondo();
        RegistroProducto rp = new RegistroProducto();
        rp.setVisible(true);
        escritorio.add(rp);
        escritorio.moveToFront(rp);
    }//GEN-LAST:event_jmRegistroProductoActionPerformed

    private void jmComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmComprasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        determinarFondo();
        Compras c = new Compras();
        c.setVisible(true);
        escritorio.add(c);
        escritorio.moveToFront(c);
        
    }//GEN-LAST:event_jmComprasActionPerformed

    private void jmDetalleCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmDetalleCompraActionPerformed
         escritorio.removeAll();
        escritorio.repaint();
        determinarFondo();
        DetalleCompra c = new DetalleCompra();
        c.setVisible(true);
        escritorio.add(c);
        escritorio.moveToFront(c);
    }//GEN-LAST:event_jmDetalleCompraActionPerformed

    private void jmActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmActualizarMouseClicked
      escritorio.removeAll();
        escritorio.repaint();
        determinarFondo();
        ActualizarStock a = new ActualizarStock();
        a.setVisible(true);
        escritorio.add(a);
        escritorio.moveToFront(a);
    }//GEN-LAST:event_jmActualizarMouseClicked

    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatDarkLaf());
        new Menu().setVisible(true);

    }

    public void centrarInternalFrame(JInternalFrame internalFrame) {
        int ancho = escritorio.getWidth();
        int alto = escritorio.getHeight();
        int anchoFrame = internalFrame.getWidth();
        int altoFrame = internalFrame.getHeight();

        int x = (ancho - anchoFrame) / 2;
        int y = (alto - altoFrame) / 2;

        internalFrame.setLocation(x, y);
    }

    private void determinarFondo() {
        JLayeredPane base = new JLayeredPane();
        base.setBounds(0, 0, escritorio.getWidth(), escritorio.getHeight());

        JLabel fondo = new JLabel();
        fondo.setIcon(new ImageIcon(""));
        fondo.setBounds(0, 0, escritorio.getWidth(), escritorio.getHeight());
        fondo.setOpaque(true);

        JLabel logo = new JLabel();
        logo.setIcon(new ImageIcon(""));
        logo.setBounds((fondo.getWidth() - logo.getPreferredSize().width) / 2, (fondo.getHeight() - logo.getPreferredSize().height) / 2, logo.getPreferredSize().width, logo.getPreferredSize().height);

        base.add(fondo, Integer.valueOf(0));
        base.add(logo, Integer.valueOf(1));

        escritorio.add(base);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmActualizar;
    private javax.swing.JMenuItem jmCompras;
    private javax.swing.JMenuItem jmDetalleCompra;
    private javax.swing.JMenuItem jmRegistroProducto;
    private javax.swing.JMenuItem jmRegistroProveedor;
    // End of variables declaration//GEN-END:variables
}

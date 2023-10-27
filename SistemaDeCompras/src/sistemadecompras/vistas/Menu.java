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
        jMenu4 = new javax.swing.JMenu();
        jmRegistroProveedor = new javax.swing.JMenuItem();
        jmRegistroProducto = new javax.swing.JMenuItem();
        jmCompras = new javax.swing.JMenu();
        jmActualizar = new javax.swing.JMenu();
        jmConsultas = new javax.swing.JMenu();
        jmListaProductos = new javax.swing.JMenuItem();
        jmListaProveedores = new javax.swing.JMenuItem();
        jmListaCompras = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        escritorio.setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 888, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N

        jMenu1.setText("Gestion");

        jMenu4.setText("Registrar");

        jmRegistroProveedor.setText("Registrar proveedor");
        jmRegistroProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRegistroProveedorActionPerformed(evt);
            }
        });
        jMenu4.add(jmRegistroProveedor);

        jmRegistroProducto.setText("Registrar producto");
        jmRegistroProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRegistroProductoActionPerformed(evt);
            }
        });
        jMenu4.add(jmRegistroProducto);

        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        jmCompras.setText("Compras");
        jmCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmComprasMouseClicked(evt);
            }
        });
        jmCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmComprasActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmCompras);

        jmActualizar.setText("Actualizacion Stock");
        jmActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmActualizarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmActualizar);

        jmConsultas.setText("Consultas");

        jmListaProductos.setText("Lista de Productos");
        jmListaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmListaProductosActionPerformed(evt);
            }
        });
        jmConsultas.add(jmListaProductos);

        jmListaProveedores.setText("Lista de Proveedores");
        jmListaProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmListaProveedoresActionPerformed(evt);
            }
        });
        jmConsultas.add(jmListaProveedores);

        jmListaCompras.setText("Lista de Compras");
        jmListaCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmListaComprasActionPerformed(evt);
            }
        });
        jmConsultas.add(jmListaCompras);

        jMenuBar1.add(jmConsultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
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

    private void jmActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmActualizarMouseClicked
        escritorio.removeAll();
        escritorio.repaint();
        determinarFondo();
        ActualizarStock a = new ActualizarStock();
        a.setVisible(true);
        escritorio.add(a);
        escritorio.moveToFront(a);
    }//GEN-LAST:event_jmActualizarMouseClicked

    private void jmListaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListaProductosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        determinarFondo();
        ListarProductos a = new ListarProductos();
        a.setVisible(true);
        escritorio.add(a);
        escritorio.moveToFront(a);
    }//GEN-LAST:event_jmListaProductosActionPerformed

    private void jmListaProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListaProveedoresActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        determinarFondo();
        ListarProveedores a = new ListarProveedores();
        a.setVisible(true);
        escritorio.add(a);
        escritorio.moveToFront(a);
    }//GEN-LAST:event_jmListaProveedoresActionPerformed

    private void jmComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmComprasActionPerformed
       
    }//GEN-LAST:event_jmComprasActionPerformed

    private void jmComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmComprasMouseClicked
      escritorio.removeAll();
        escritorio.repaint();
        determinarFondo();
        Compras a = new Compras();
        a.setVisible(true);
        escritorio.add(a);
        escritorio.moveToFront(a);
    }//GEN-LAST:event_jmComprasMouseClicked

    private void jmListaComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListaComprasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        determinarFondo();
        ListarCompras a = new ListarCompras();
        a.setVisible(true);
        escritorio.add(a);
        escritorio.moveToFront(a);
    }//GEN-LAST:event_jmListaComprasActionPerformed

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
        fondo.setIcon(new ImageIcon("fondo.jpg"));
        fondo.setBounds(0, 0, escritorio.getWidth(), escritorio.getHeight());
        fondo.setOpaque(true);

        JLabel logo = new JLabel();
        logo.setIcon(new ImageIcon("logo.png"));
        logo.setBounds((fondo.getWidth() - logo.getPreferredSize().width) / 2, (fondo.getHeight() - logo.getPreferredSize().height) / 2, logo.getPreferredSize().width, logo.getPreferredSize().height);

        base.add(fondo, Integer.valueOf(0));
       // base.add(logo, Integer.valueOf(1));

        escritorio.add(base);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmActualizar;
    private javax.swing.JMenu jmCompras;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenuItem jmListaCompras;
    private javax.swing.JMenuItem jmListaProductos;
    private javax.swing.JMenuItem jmListaProveedores;
    private javax.swing.JMenuItem jmRegistroProducto;
    private javax.swing.JMenuItem jmRegistroProveedor;
    // End of variables declaration//GEN-END:variables
}

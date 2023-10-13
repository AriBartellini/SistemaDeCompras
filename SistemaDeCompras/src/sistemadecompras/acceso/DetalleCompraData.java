package sistemadecompras.acceso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class DetalleCompraData {

    private Connection con;

    public DetalleCompraData() {
        con = Conexion.buscarConexion();
    }

 
    public void agregarDetalleCompra(int cantidad, double precioCosto, int idCompra, int idProducto) {
        
        String sql = "INSERT INTO detallecompra (cantidad,	precioCosto,idCompra,idProducto	) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cantidad);
            ps.setDouble(2, precioCosto);
            ps.setInt(3, idCompra);
            ps.setInt(4, idProducto);

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Detalle cargado correctamente");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en agregarDetalleCompra");
        }
    }

    public int buscarCompraPorId() {
        int id = 0;
        try {
            String sql = "SELECT idCompra from compra ORDER BY fecha DESC LIMIT 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt("idCompra");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en buscarCompraPorID en DetalleCompra");
        }

        return id;
    }
    
   
}

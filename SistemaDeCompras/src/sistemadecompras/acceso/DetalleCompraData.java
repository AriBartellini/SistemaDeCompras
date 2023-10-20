package sistemadecompras.acceso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import sistemadecompras.entidades.DetalleCompra;

public class DetalleCompraData {

    private Connection con;

    public DetalleCompraData() {
        con = Conexion.buscarConexion();
    }

 
    public void agregarDetalleCompra(int cantidad, double precioCosto, int idCompra, int idProducto) {
        
        String sql = "INSERT INTO detallecompra ( cantidad , precioCosto , idCompra , idProducto ) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cantidad);
            ps.setDouble(2, precioCosto);
            ps.setInt(3, idCompra);
            ps.setInt(4, idProducto);
            ps.executeUpdate();
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
    public DetalleCompra buscarDetalleCompra(int id) { //busqueda si o si por ID // en proceso...

        String sql = "SELECT idDetalle, cantidad, precioCosto, idProducto FROM detallecompra WHERE idCompra = ?";
        DetalleCompra detalleCompra = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                detalleCompra = new DetalleCompra();
                detalleCompra.setIdCompra (id);
                detalleCompra.setIdDetalle(rs.getInt("idDetalle"));
                detalleCompra.setCantidad(rs.getInt("cantidad"));
                detalleCompra.setPrecioCosto(rs.getDouble("precioCosto"));
                detalleCompra.setIdProducto(rs.getInt("idProducto"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe una compra con ese id");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla en el metodo buscarDetalleCompra");
        }
        return detalleCompra;

    }
    public List<DetalleCompra> listarDetalleCompra(int id) {
        List<DetalleCompra> detallesCompra = new ArrayList<>();
        try {
            String sql = "SELECT * FROM detallecompra WHERE idCompra = ?";
            DetalleCompra detalleCompra = null;
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                detalleCompra = new DetalleCompra();
                detalleCompra.setIdCompra (id);
                detalleCompra.setIdDetalle(rs.getInt("idDetalle"));
                detalleCompra.setCantidad(rs.getInt("cantidad"));
                detalleCompra.setPrecioCosto(rs.getDouble("precioCosto"));
                detalleCompra.setIdProducto(rs.getInt("idProducto"));

                detallesCompra.add(detalleCompra);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla en el metodo listarDetalleCompra");
        }
        return detallesCompra;
    }

   
}

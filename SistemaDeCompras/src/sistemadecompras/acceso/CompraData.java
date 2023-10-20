package sistemadecompras.acceso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import sistemadecompras.entidades.Compra;

public class CompraData {

    private final Connection con;

    public CompraData() {
        con = Conexion.buscarConexion();
    }

    public int guardarCompra(int idProveedor, List<String> detalle, int cant, double total ) {
      Timestamp fecha = new Timestamp(System.currentTimeMillis());
       String sql = "INSERT INTO compra ( idProveedor , detalle , cant , total , fecha ) VALUES ( ? , ? , ? , ? , ? )";
        int generatedId = -1;
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                        
            ps.setInt(1, idProveedor);
            ps.setString(2, detalle.toString());
            ps.setInt(3, cant);
            ps.setDouble(4, total);
            ps.setTimestamp(5, fecha);
        
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                generatedId = rs.getInt(1);
                JOptionPane.showMessageDialog(null, "Compra cargada correctamente");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Compra");
        }
        return generatedId;
    }

    public void modificarCompra(Compra compra, int idCompra) {

        String sql = "UPDATE Producto SET idProveedor = ?, detalle = ?, cant = ?, total = ? WHERE idCompra = ?";
                
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, compra.getIdProv());
            ps.setString(2, compra.getDetalle());
            ps.setInt(3, compra.getCantidad());
            ps.setDouble(4, compra.getTotal());
            ps.setInt(5, idCompra);

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Compra modificado correctamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder al Compra en metodo modificarCompra");
         }

    }

    public void eliminarCompraPorId(int id) {
        try {
            String sql = "DELETE FROM Compra WHERE idCompra= ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó la Compra");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder al Compra");

        }
    }

    
    public List<Compra> listarCompra() {
        List<Compra> compras = new ArrayList<>();
        try {
            String sql = "SELECT * FROM compra ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Compra compra = new Compra();
                compra.setIdCompra(rs.getInt("idCompra"));
                compra.setFecha(rs.getTimestamp("fecha"));
                compra.setIdProv(rs.getInt("idProveedor"));
                compra.setCantidad(rs.getInt("cant"));
                compra.setTotal(rs.getDouble("total"));
                
                compras.add(compra);
            }
            ps.close();
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error al acceder a la tabla en el metodo listarCompra");
            
        }
        return compras;
    }

      public List<Compra> listarCompraPorProveedor(int idProveedor) {
        List<Compra> compras = new ArrayList<>();
        try {
            String sql = "SELECT * FROM compra WHERE idProveedor = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProveedor);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Compra compra = new Compra();
                compra.setIdCompra(rs.getInt("idCompra"));
                compra.setFecha(rs.getTimestamp("fecha"));
                compra.setIdProv(rs.getInt("idProveedor"));
                compra.setCantidad(rs.getInt("cant"));
                compra.setTotal(rs.getDouble("total"));
                
                compras.add(compra);
            }
            ps.close();
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error al acceder a la tabla en el metodo listarCompra");
            
        }
        return compras;
    }
      
     
      public List<Compra> listarCompraPorFecha(Timestamp fecha) {
        List<Compra> compras = new ArrayList<>();
        try {
            String sql = " SELECT * FROM compra WHERE  fecha = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setTimestamp(1, fecha);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Compra compra = new Compra();
                compra.setIdCompra(rs.getInt("idCompra"));
                compra.setFecha(rs.getTimestamp("fecha"));
                compra.setIdProv(rs.getInt("idProveedor"));
                compra.setCantidad(rs.getInt("cant"));
                compra.setTotal(rs.getDouble("total"));
                
                compras.add(compra);
            }
            ps.close();
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error al acceder a la tabla en el metodo listarCompra");
            
        }
        return compras;
    }
      
}

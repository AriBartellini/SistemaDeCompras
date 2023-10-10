package sistemadecompras.acceso;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import sistemadecompras.entidades.Compra;
import sistemadecompras.entidades.Producto;

public class CompraData {

    private final Connection con;

    public CompraData() {
        con = Conexion.buscarConexion();
    }

    public void guardarCompra(int idProveedor, List<Producto> detalle, int cant, int total ) {
       Date fecha= Date.valueOf(LocalDate.now());
       String sql = "INSERT INTO compra ( idProveedor , detalle , cant , total , fecha ) VALUES ( ? , ? , ? , ? , ? )";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, idProveedor);
            ps.setString(2, detalle.toString());
            ps.setInt(3, cant);
            ps.setDouble(4, total);
            ps.setDate(5, fecha);
        
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Compra cargada correctamente");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Compra");
        }
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
                JOptionPane.showMessageDialog(null, "Se eliminó el Compra");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder al Compra");

        }
    }

    
    public List<Compra> listarCompra() {
        List<Compra> compras = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Compra";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Compra compra = new Compra();
                compra.setIdCompra(rs.getInt("idCompra"));
                compra.setIdProv(rs.getInt("idProveedor"));
                compra.setDetalle(rs.getString("detalle"));
                compra.setCantidad(rs.getInt("cantidad"));
                compra.setTotal(rs.getDouble("total"));
                compra.setFecha(rs.getDate("fecha").toLocalDate());
                compras.add(compra);
            }
            ps.close();
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla en el metodo listarCompra");
        }
        return compras;
    }

}

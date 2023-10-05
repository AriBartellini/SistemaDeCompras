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

public class CompraData {

    private Connection con;

    public CompraData() {
        con = Conexion.buscarConexion();
    }

    public void guardarCompra( int idProveedor, Date fecha) {
        String sql = "INSERT INTO compra (idCompra, idProveedor, fecha) VALUES (?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, idProveedor);
            ps.setDate(2, fecha);
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
    
    public void modificarCompra(Compra compra) {

        String sql = "UPDATE Producto SET idProveedor = ?, fecha = ? WHERE idCompra = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, compra.getIdProv());
            ps.setDate(2, Date.valueOf(compra.getFecha()));

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
            String sql = "DELETE Compra WHERE idCompra= ? ";
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
    
    public List<Compra> listarCompra(){
        List<Compra> compras = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Compra";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Compra compra = new Compra();
                compra.setIdCompra(rs.getInt("idCompra"));
                compra.setIdProv(rs.getInt("idProveedor"));
                compra.setFecha (rs.getDate("fecha").toLocalDate());
                compras.add(compra);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla en el metodo listarCompra");
        }
        return compras;
    } 

}

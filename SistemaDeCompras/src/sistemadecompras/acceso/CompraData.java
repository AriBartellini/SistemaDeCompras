package sistemadecompras.acceso;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

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

    

}

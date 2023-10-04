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

    public void guardarCompra(int idCompra, int idProveedor, Date fecha) {
        String sql = "INSERT INTO inscripcion (idCompra, idProveedor, fecha) VALUES (?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idCompra);
            ps.setInt(2, idProveedor);
            ps.setDate(3, fecha);
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

    public void actualizarCompra(int idCompra, int idProveedor, Date fecha) {
        String sql = "UPDATE compra SET idCompra = ? WHERE idProveedor = ? and fecha = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCompra);
            ps.setInt(2, idProveedor);
            ps.setDate(3, fecha);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Compra actualizada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra");
        }
    }

}

package sistemadecompras.acceso;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import sistemadecompras.entidades.Proveedor;

public class ProveedorData {

    private Connection con;
    
    public ProveedorData(){
        con = Conexion.buscarConexion();
    }
    
    public void guardarProveedor(Proveedor proveedor){
        
        String sql = "INSERT INTO proveedor (idProveedor, nombre, domicilio, telefono) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, proveedor.getIdProveedor());
            ps.setString(2, proveedor.getNombreProveedor());
            ps.setString(3, proveedor.getDomicilio());
            ps.setString(4, proveedor.getDomicilio());
           
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                proveedor.setIdProveedor(rs.getInt(1));
                JOptionPane.showMessageDialog(null, " guardado correctamente");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "alumno duplicado, inserte otro DNI");
        }

    }
    }
    
}

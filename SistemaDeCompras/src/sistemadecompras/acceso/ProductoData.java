package sistemadecompras.acceso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import sistemadecompras.entidades.Producto;

public class ProductoData {

    private Connection con;

    public ProductoData() {
        con = Conexion.buscarConexion();
        
    }

    public void agregarProducto(Producto producto) {

        String sql = "INSERT INTO Producto (nombre, descripcion, precio, stock) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1,producto.getNombreProducto());
            ps.setString(2,producto.getDescripcion());
            ps.setDouble(3,producto.getPrecio());
            ps.setDouble(4,producto.getStock());
           

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                producto.setIdProducto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Producto Agregado correctamente");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Producto Duplicado");
        }

    }


public void modificarProducto(Producto producto) {

        String sql = "UPDATE Producto SET nombre = ?, descripcion = ? , precio = ?, Stock = ? WHERE idMateria = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,producto.getNombreProducto());
            ps.setString(2,producto.getDescripcion());
            ps.setDouble(3,producto.getPrecio());
            ps.setDouble(4,producto.getStock());
            ps.setBoolean(5,producto.isEstado());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Producto modificado correctamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder al Producto ");
        }

    }

public void eliminarProductoPorId(int id) {
        try {
            String sql = "DELETE Producto  WHERE idProducto = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó el Producto");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder al Producto");
      
        }
}
}

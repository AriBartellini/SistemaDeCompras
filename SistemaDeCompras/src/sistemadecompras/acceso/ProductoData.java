package sistemadecompras.acceso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import sistemadecompras.entidades.Producto;

public class ProductoData {

    private Connection con;

    public ProductoData() {
        con = Conexion.buscarConexion();

    }

    public void agregarProducto(Producto producto) {

        String sql = "INSERT INTO Producto (nombre, precio) VALUES (?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, producto.getNombreProducto());
            ps.setDouble(2, producto.getPrecio());

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

        String sql = "UPDATE Producto SET nombre = ?, precio = ? WHERE idProducto = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombreProducto());
            ps.setDouble(2, producto.getPrecio());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Producto modificado correctamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder al Producto en metodo modificarProducto");
        }

    }

    public void eliminarProductoPorId(int id) {
        try {
            String sql = "DELETE Producto WHERE idProducto = ? ";
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

     public List<Producto> listarProducto(){
        List<Producto> productos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Producto";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombreProducto(rs.getString("nombre"));
                producto.setPrecio(rs.getDouble("precio"));
                productos.add(producto);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla en el metodo listarProducto");
        }
        return productos;
    }   
    
}
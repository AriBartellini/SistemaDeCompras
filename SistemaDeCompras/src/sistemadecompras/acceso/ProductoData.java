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

        String sql = "INSERT INTO Producto (nombre, precio, stock) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, producto.getNombreProducto());
            ps.setDouble(2, producto.getPrecio());
            ps.setInt(3, producto.getStock());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                  JOptionPane.showMessageDialog(null, "Producto Agregado correctamente");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en metodo agregarProducto");
        }

    }

    public void modificarProducto(Producto producto) {

        String sql = "UPDATE Producto SET nombre = ?, precio = ?, stock = ? WHERE idProducto = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombreProducto());
            ps.setDouble(2, producto.getPrecio());
            ps.setInt(3, producto.getStock());
            ps.setInt(4, producto.getIdProducto());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Producto modificado correctamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder al Producto en metodo modificarProducto");
        }

    }
    
    public void modificarStock(int id, int stock){ //aca modificamos el stock para las compras a un producto especifico
        
        String sql = "UPDATE Producto Set stock = (stock + ?)  WHERE idProducto = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, stock);
            ps.setInt(2, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "STOCK modificado correctamente");
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder al Producto en metodo modificarSTOCK");
        }
        
    }

    public void eliminarProductoPorId(int id) {
        try {
            String sql = "DELETE  FROM producto  WHERE  idProducto  =  ?  ";
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
                producto.setStock(rs.getInt("stock"));
                productos.add(producto);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla en el metodo listarProducto");
        }
        return productos;
    }   
    
     public List<Integer> listarIdProductos(){
        List<Integer> idProductos = new ArrayList<>();
        try {
            String sql = "SELECT idProducto FROM Producto";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //Producto producto = new Producto();
                int prodId;
                prodId = rs.getInt("idProducto");
                
                idProductos.add(prodId);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla en el metodo listarIdProductos");
        }
        return idProductos;
    }   
     
     
    public double traerPrecioPorId(int id){
        double precio = 0;
        
        try{
        String sql = "SELECT precio FROM Producto WHERE idProducto = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        
            if (rs.next()) {
                
                precio = rs.getDouble("precio");
                
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla en el metodo traerPrecioPorID");
        }
        return precio;
    }
     
    public void descontarPorId(int id, int descuento){
        String sql = "UPDATE Producto Set stock = (stock - ?)  WHERE idProducto = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, descuento);
            ps.setInt(2, id);
            int exito = ps.executeUpdate();
//            if (exito == 1) {
//                JOptionPane.showMessageDialog(null, "STOCK modificado correctamente");
//            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder al Producto en metodo descontarPorId");
        }
        
    } 
    
    
    public int traerStockPorId(int id){
        int stock = 0;
        String sql = "SELECT stock FROM Producto WHERE idProducto = ?";
        try{
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        
            if (rs.next()) {
                
                stock = rs.getInt("stock");
                
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla en el metodo traerStockPorId");
        }
        return stock;
    }
    
    public List<Producto> listarProductosBajoStock(){
        List<Producto> productos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Producto WHERE stock < 10"; //definimos 10 como el minimo del stock
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setNombreProducto(rs.getString("nombre"));
                producto.setStock(rs.getInt("stock"));
                productos.add(producto);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla en el metodo listarProductosBajoStock");
        }
        return productos;
    }   
     
}
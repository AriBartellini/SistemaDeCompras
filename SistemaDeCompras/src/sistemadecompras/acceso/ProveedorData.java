package sistemadecompras.acceso;

import java.sql.Connection;
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
            ps.setString(4, proveedor.getTelefono());
           
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                proveedor.setIdProveedor(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Proveedor guardado correctamente");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Proveedor duplicado, inserte otro ID");
        }

    }
    
    public void modificarProveedor(Proveedor proveedor){
        
        String sql = "UPDATE proveedor SET nombre = ?, domicilio = ?, telefono = ? WHERE idProveedor = ? ";
                

        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, proveedor.getNombreProveedor());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
            ps.setInt(4, proveedor.getIdProveedor());
            

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Proveedor modificado correctamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla en el metodo modificarProveedor");
        }

        
    }
    
    public Proveedor buscarProveedor(){ //busqueda si o si por ID
        
        String sql = "SELECT dni, apellido, nombre, fechaNac FROM proveedor WHERE idProveedor = ? AND estado=1";
        Proveedor proveedor = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                proveedor = new Proveedor();
                proveedor.setIdProveedor(id);
                proveedor.setDni(rs.getInt("dni"));
                proveedor.setApellido(rs.getString("apellido"));
                proveedor.setNombre(rs.getString("nombre"));
                
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe un proveedor con ese id");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla proveedor");
        }
        return proveedor;
        
    }
    
    }
    


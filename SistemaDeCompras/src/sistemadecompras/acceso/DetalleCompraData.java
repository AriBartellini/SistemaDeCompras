package sistemadecompras.acceso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import sistemadecompras.entidades.Compra;
import sistemadecompras.entidades.Producto;

public class DetalleCompraData {
     private Connection con;

    public DetalleCompraData(Connection con) {
       con = Conexion.buscarConexion();
    }
     
    public void agregarDetalleCompra(Compra compra, Producto producto){
        String sql = "INSERT INTO detallecompra (cantidad,	precioCosto,idCompra,idProducto	) VALUES (?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, compra.getCantidad() );
            ps.setDouble(2, producto.getPrecio());
            ps.setInt(3,compra.getIdCompra());
            ps.setInt(4, producto.getIdProducto());
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Detalle cargado correctamente");
            }
            ps.close();
           
        } catch (SQLException ex) {
             Logger.getLogger(DetalleCompraData.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    public void agregarDetalleCompra(int cantidad, double precioCosto, int idCompra,int idProducto){
        String sql = "INSERT INTO detallecompra (cantidad,	precioCosto,idCompra,idProducto	) VALUES (?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cantidad );
            ps.setDouble(2, precioCosto);
            ps.setInt(3,idCompra);
            ps.setInt(4, idProducto);
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Detalle cargado correctamente");
            }
            ps.close();
           
        } catch (SQLException ex) {
             Logger.getLogger(DetalleCompraData.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    public List<Compra> listarPorId(){
        List<Compra> comp = new ArrayList<>();
        try {
            String sql = "SELECT * FROM compra WHERE idCompra = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Compra compra = new Compra();
            }
            
        } catch (SQLException ex) {
             Logger.getLogger(DetalleCompraData.class.getName()).log(Level.SEVERE, null, ex);
         }
         return comp;
    }
}

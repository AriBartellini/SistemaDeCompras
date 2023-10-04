package sistemadecompras.acceso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mariadb.jdbc.Statement;
import sistemadecompras.entidades.Compra;

public class DetalleCompraData {
     private Connection con;

    public DetalleCompraData(Connection con) {
       con = Conexion.buscarConexion();
    }
     
    public void agregarDetalleCompra(Compra compra){
        String sql = "INSERT INTO detallecompra (cantidad,	precioCosto,idCompra,idProducto	) VALUES (?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
           
        } catch (SQLException ex) {
             Logger.getLogger(DetalleCompraData.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
}

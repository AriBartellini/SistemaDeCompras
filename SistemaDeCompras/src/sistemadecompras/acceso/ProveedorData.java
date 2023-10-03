package sistemadecompras.acceso;

import java.sql.Connection;

public class ProveedorData {

    private Connection con;
    
    public ProveedorData(){
        con = Conexion.buscarConexion();
    }
    
    
    
}

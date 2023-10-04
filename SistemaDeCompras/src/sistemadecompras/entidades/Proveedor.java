
package sistemadecompras.entidades;

public class Proveedor {
    private int idProveedor;
    private String nombreProveedor;
    private String domicilio;
    private String telefono;

    public Proveedor() {
    }

    public Proveedor(String nombreProveedor, String domicilio, String telefono) {
        this.nombreProveedor = nombreProveedor;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    
    public Proveedor(int idProveedor, String nombre, String domicilio, String telefono) {
        this.idProveedor = idProveedor;
        this.nombreProveedor = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "idProveedor=" + idProveedor + ", nombre=" + nombreProveedor + ", domicilio=" + domicilio + ", telefono=" + telefono + '}';
    }
    
    
}

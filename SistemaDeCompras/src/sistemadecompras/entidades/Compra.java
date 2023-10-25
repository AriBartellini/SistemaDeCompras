package sistemadecompras.entidades;
import java.sql.Timestamp;

public class Compra {

    private int idCompra;
    private Proveedor prov;
    private int idProv;
    private String nombreProv;
    private String detalle;
    private int cantidad;
    private double total;
    private Timestamp fecha;

    public Compra() {
    }

    public Compra(int idProv, Timestamp fecha, int cantidad) {
        idProv = prov.getIdProveedor();
        this.fecha = fecha;
        this.cantidad = cantidad;
    }
//PARA METODO MODIFICAR EN COMPRADATA
    public Compra(int idCompra, String nompreProv, int cantidad, double total) {
        this.idCompra = idCompra;
        this.nombreProv = prov.getNombreProveedor();
        this.cantidad = cantidad;
        this.total = total;
    }

    public Compra(int idCompra, Proveedor prov, int idProv, String detalle, int cantidad, double total, Timestamp fecha) {
        this.idCompra = idCompra;
        this.prov = prov;
        this.idProv = idProv;
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.total = total;
        this.fecha = fecha;
    }

    public Compra(Proveedor prov, int idProv, String detalle, int cantidad, double total, Timestamp fecha) {
        this.prov = prov;
        this.idProv = idProv;
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.total = total;
        this.fecha = fecha;
    }
  public Compra(int idCompra, int idProv, Timestamp fecha, int cantidad) {
        this.idCompra = idCompra;
        idProv = prov.getIdProveedor();
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getIdProv() {
        return idProv;
    }

    public void setIdProv(int idProv) {
        this.idProv = idProv;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Proveedor getProv() {
        return prov;
    }

    public void setProv(Proveedor prov) {
        this.prov = prov;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public String getNombreProv() {
        return nombreProv;
    }

    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }

    @Override
    public String toString() {
        return  "idCompra=" + idCompra + " " + idProv + " " + fecha ;
    }

}

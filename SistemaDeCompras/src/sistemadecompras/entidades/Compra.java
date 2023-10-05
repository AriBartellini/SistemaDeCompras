
package sistemadecompras.entidades;

import java.time.LocalDate;

public class Compra {
    private int idCompra;
    private Proveedor prov;
    private LocalDate fecha;
    private int cantidad;
    private int idProv;

    public Compra() {
    }

    public Compra(int idProv, LocalDate fecha, int cantidad) {
        idProv = prov.getIdProveedor();
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    
    public Compra(int idCompra, int idProv, LocalDate fecha, int cantidad) {
        this.idCompra = idCompra;
       idProv = prov.getIdProveedor();
        this.fecha = fecha;
        this.cantidad= cantidad;
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", prov=" + prov + ", fecha=" + fecha + '}';
    }
   
    
    
}

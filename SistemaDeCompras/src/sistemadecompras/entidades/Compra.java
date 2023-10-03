
package sistemadecompras.entidades;

import java.time.LocalDate;

public class Compra {
    private int idCompra;
    private Proveedor prov;
    private LocalDate fecha;

    public Compra() {
    }

    
    public Compra(int idCompra, Proveedor prov, LocalDate fecha) {
        this.idCompra = idCompra;
        this.prov = prov;
        this.fecha = fecha;
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

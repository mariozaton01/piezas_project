package proyecto.Entidades;

import jakarta.persistence.*;

@Entity
@IdClass(GestionPK.class)
public class Gestion {
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_proveedor")
    private String idProveedor;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_pieza")
    private String idPieza;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_proyecto")
    private String idProyecto;
    @Basic
    @Column(name = "cantidad")
    private int cantidad;

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getIdPieza() {
        return idPieza;
    }

    public void setIdPieza(String idPieza) {
        this.idPieza = idPieza;
    }

    public String getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Gestion gestion = (Gestion) o;

        if (cantidad != gestion.cantidad) return false;
        if (idProveedor != null ? !idProveedor.equals(gestion.idProveedor) : gestion.idProveedor != null) return false;
        if (idPieza != null ? !idPieza.equals(gestion.idPieza) : gestion.idPieza != null) return false;
        if (idProyecto != null ? !idProyecto.equals(gestion.idProyecto) : gestion.idProyecto != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProveedor != null ? idProveedor.hashCode() : 0;
        result = 31 * result + (idPieza != null ? idPieza.hashCode() : 0);
        result = 31 * result + (idProyecto != null ? idProyecto.hashCode() : 0);
        result = 31 * result + cantidad;
        return result;
    }
}

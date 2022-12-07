package proyecto.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class GestionPK implements Serializable {
    @Column(name = "id_proveedor")
    @Id
    //GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idProveedor;
    @Column(name = "id_pieza")
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idPieza;
    @Column(name = "id_proyecto")
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idProyecto;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GestionPK gestionPK = (GestionPK) o;

        if (idProveedor != null ? !idProveedor.equals(gestionPK.idProveedor) : gestionPK.idProveedor != null)
            return false;
        if (idPieza != null ? !idPieza.equals(gestionPK.idPieza) : gestionPK.idPieza != null) return false;
        if (idProyecto != null ? !idProyecto.equals(gestionPK.idProyecto) : gestionPK.idProyecto != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProveedor != null ? idProveedor.hashCode() : 0;
        result = 31 * result + (idPieza != null ? idPieza.hashCode() : 0);
        result = 31 * result + (idProyecto != null ? idProyecto.hashCode() : 0);
        return result;
    }
}

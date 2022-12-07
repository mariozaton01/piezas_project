package proyecto.Entidades;

import jakarta.persistence.*;

@Entity
public class Proyectos {
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "ciudad")
    private String ciudad;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Proyectos proyectos = (Proyectos) o;

        if (id != null ? !id.equals(proyectos.id) : proyectos.id != null) return false;
        if (nombre != null ? !nombre.equals(proyectos.nombre) : proyectos.nombre != null) return false;
        if (ciudad != null ? !ciudad.equals(proyectos.ciudad) : proyectos.ciudad != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (ciudad != null ? ciudad.hashCode() : 0);
        return result;
    }
}

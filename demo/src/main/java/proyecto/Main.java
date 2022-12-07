package proyecto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import proyecto.Entidades.*;
import proyecto.Ventanas.*;

import java.util.List;

public class Main {
    
    private static Ventana_gestion v_gestion;
    private static EntityManagerFactory entityManagerFactory;
    private static EntityTransaction transaction;

    public static void main(String[] args) {

         entityManagerFactory = Persistence.createEntityManagerFactory("default");
         //entityManager = entityManagerFactory.createEntityManager();
         //transaction = entityManager.getTransaction();
        
        setVentanaInicial();
        
    }
    
    public static void setVentanaInicial(){
        v_gestion = new Ventana_gestion();
        v_gestion.setVisible(true);
        v_gestion.setLocationRelativeTo(null);
    }

    
    public static Pieza getIdPieza(String id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Pieza p = entityManager.find(Pieza.class,id);
        return p;
    }

    public static void getPiezasstoComboBox(JComboBox<String> cb_pieza) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        transaction = entityManager.getTransaction();
        try{

            List<Pieza> lista = entityManager.createQuery("FROM Pieza ").getResultList();
            for(Pieza pieza : lista){

                String nombre = pieza.getNombre();
                String id = pieza.getId();
                System.out.println(nombre);
                cb_pieza.addItem(id+"- " + nombre);
            }
            entityManager.close();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al conseguir las piezas.");

        }


    }

    public static void deletePieza(String id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        transaction = entityManager.getTransaction();
        try{
            transaction.begin();

            Pieza pieza = entityManager.find( Pieza.class, id );
            if (pieza != null){
                entityManager.remove(pieza);
                transaction.commit();

            }
            entityManager.close();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al borrar pieza.");

        }



    }

    public static void Cancelar(Ventana_gestion v) {
        System.exit(0);
    }

    public static void updatePieza(String id, String nombre, String descripcion, Float precio) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        transaction = entityManager.getTransaction();

        try{
            transaction.begin();

            Pieza pieza = entityManager.find(Pieza.class, id);

            if(pieza !=null ){
                pieza.setNombre(nombre);
                pieza.setDescripcion(descripcion);
                pieza.setPrecio(precio);

            }

            transaction.commit();
            entityManager.close();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al actualizar pieza.");

        }


    }

    public static void insertProveedor(Proveedor p) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        transaction = entityManager.getTransaction();

        try{

            transaction.begin();

            entityManager.persist(p);

            transaction.commit();
            JOptionPane.showMessageDialog(null, "Proveedor añadido.");

        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al insertar: " +e.getMessage());

        }


    }

    public static Proveedor getIdProveedor(String id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Proveedor p = entityManager.find(Proveedor.class,id);
        return p;

    }

    public static void getProveedortoComboBox(JComboBox<String> cb_proveedor) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        transaction = entityManager.getTransaction();
        try{
            transaction.begin();

            List<Proveedor> lista = entityManager.createQuery("FROM Proveedor").getResultList();
            for(Proveedor proveedor : lista){

                String nombre = proveedor.getNombre();
                String id = proveedor.getId();
                System.out.println(nombre);
                cb_proveedor.addItem(id+"- " + nombre);
            }
            transaction.commit();
            entityManager.close();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al conseguir los proveedores.");

        }


    }

    public static void deleteProveedor(String id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        transaction = entityManager.getTransaction();
        try{
            transaction.begin();

            Proveedor proveedor = entityManager.find( Proveedor.class, id );
            if (proveedor != null){
                entityManager.remove(proveedor);
                transaction.commit();

            }
            entityManager.close();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al borrar proveedor.");

        }



    }

    public static void updateProveedor(String id, String nombre, String  descripcion, String cp) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        transaction = entityManager.getTransaction();

        try{
            transaction.begin();

            Proveedor proveedor = entityManager.find(Proveedor.class, id);
            if (proveedor !=null ){

                proveedor.setNombre(nombre);
                proveedor.setApellido(descripcion);
                proveedor.setDireccion(cp);
            }


            transaction.commit();
            entityManager.close();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al actualizar proveedor.");

        }
    }

    public static void insertProyecto(Proyectos p) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        transaction = entityManager.getTransaction();

        try{

            transaction.begin();

            entityManager.persist(p);

            transaction.commit();
            JOptionPane.showMessageDialog(null, "Proyecto añadido");

        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al insertar: "+ e.getMessage());

        }

    }


    public static Proyectos getIdProyecto(String id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Proyectos p = entityManager.find(Proyectos.class,id);
        return p;

    }

    public static void getProyectotoComboBox(JComboBox<String> cb_proyectos) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        transaction = entityManager.getTransaction();

        try{
            //transaction.begin();
            List<Proyectos> lista = entityManager.createQuery("FROM Proyectos ").getResultList();
            for(Proyectos proyecto : lista){

                String nombre = proyecto.getNombre();
                String id = proyecto.getId();
                System.out.println(nombre);
                cb_proyectos.addItem(id+"- " + nombre);
            }
            //transaction.commit();
            //entityManager.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al conseguir los proyecto.");

        }


    }

    public static void deleteProyecto(String id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        transaction = entityManager.getTransaction();
        try{

            transaction.begin();

            Proyectos proyecto = entityManager.find( Proyectos.class, id );
            if (proyecto != null){
                entityManager.remove(proyecto);
                transaction.commit();

            }
            entityManager.close();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al borrar proyecto.");

        }

    }

    public static void updateProyecto(String id, String nombre, String ciudad) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        transaction = entityManager.getTransaction();

        try{
            transaction.begin();

            Proyectos proyecto = entityManager.find(Proyectos.class, id);
            if (proyecto !=null ){

                proyecto.setNombre(nombre);
                proyecto.setCiudad(ciudad);
            }


            transaction.commit();
            entityManager.close();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al actualizar proyecto.");

        }
    }

    public static void insertPieza(Pieza p) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        transaction = entityManager.getTransaction();

        try{

            transaction.begin();

            entityManager.persist(p);

            transaction.commit();
            JOptionPane.showMessageDialog(null, "Pieza añadida");

            entityManager.close();

        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al insertar: " + e.getMessage());

        }

    }


    public static void mostrarListadoPiezas(String filtro, JTable tabla, String buscador) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<Pieza>lista = null;
        if (buscador.isEmpty()){
            lista =  entityManager.createQuery("FROM Pieza ").getResultList();
        } else if (buscador.equals("id")) {
            lista = entityManager.createQuery("FROM Pieza  where id like '%"+ filtro+"%'").getResultList();
        } else if (buscador.equals("nombre")) {
            lista = entityManager.createQuery("FROM Pieza  where nombre like '%"+ filtro+"%'").getResultList();

        }

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Nombre");
        model.addColumn("Precio");
        for(Pieza pieza : lista){
            model.addRow(new Object[] {pieza.getId(),pieza.getNombre(), pieza.getPrecio()});
        }
        tabla.setModel(model);

    }
    public static void mostrarListadoProyectos(String filtro, JTable tabla, String buscador) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<Proyectos>lista = null;
        if (buscador.isEmpty()){
            lista =  entityManager.createQuery("FROM Proyectos ").getResultList();
        } else if (buscador.equals("id")) {
            lista = entityManager.createQuery("FROM Proyectos  where id like '%"+ filtro+"%'").getResultList();
        } else if (buscador.equals("nombre")) {
            lista = entityManager.createQuery("FROM Proyectos  where nombre like '%"+ filtro+"%'").getResultList();
        }else if (buscador.equals("ciudad")) {
            lista = entityManager.createQuery("FROM Proyectos  where ciudad  like '%"+ filtro+"%'").getResultList();
        }

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Nombre");
        model.addColumn("Ciudad");
        for(Proyectos proyecto : lista){
            model.addRow(new Object[] {proyecto.getId(),proyecto.getNombre(), proyecto.getCiudad()});
        }
        tabla.setModel(model);

    }

    public static void mostrarListadoProveedores(String filtro, JTable tabla, String buscador) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<Proveedor>lista = null;
        if (buscador.isEmpty()){
            lista =  entityManager.createQuery("FROM Proveedor ").getResultList();
        } else if (buscador.equals("id")) {
            lista = entityManager.createQuery("FROM Proveedor  where id like '%"+ filtro+"%'").getResultList();
        } else if (buscador.equals("nombre")) {
            lista = entityManager.createQuery("FROM Proveedor  where nombre like '%"+ filtro+"%'").getResultList();
        }else if (buscador.equals("direccion")) {
            lista = entityManager.createQuery("FROM Proveedor  where direccion  like '%"+ filtro+"%'").getResultList();
        }

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Nombre");
        model.addColumn("Direccion");
        for(Proveedor proveedor : lista){
            model.addRow(new Object[] {proveedor.getId(),proveedor.getNombre(), proveedor.getDireccion()});
        }
        tabla.setModel(model);

    }
    public static void mostrarListadoGestion(String filtro, JTable tabla, String buscador) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<Gestion>lista = null;
        if (buscador.isEmpty()){
            lista =  entityManager.createQuery("FROM Gestion ").getResultList();
        } else if (buscador.equals("pieza")) {
            lista = entityManager.createQuery("FROM Gestion  where idPieza like '%"+ filtro+"%'").getResultList();
        } else if (buscador.equals("proyecto")) {
            lista = entityManager.createQuery("FROM Gestion  where idProyecto like '%"+ filtro+"%'").getResultList();
        }else if (buscador.equals("proveedor")) {
            lista = entityManager.createQuery("FROM Gestion  where idProveedor  like '%"+ filtro+"%'").getResultList();
        }

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Pieza");
        model.addColumn("Proveedor");
        model.addColumn("Proyecto");
        for(Gestion gestion : lista){
            model.addRow(new Object[] {gestion.getIdPieza(),gestion.getIdProveedor(), gestion.getIdProyecto()});
        }
        tabla.setModel(model);

    }
}






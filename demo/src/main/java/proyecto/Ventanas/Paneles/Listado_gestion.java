/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyecto.Ventanas.Paneles;


import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

import proyecto.Entidades.Pieza;
import proyecto.Main;

/**
 *
 * @author mario
 */
public class Listado_gestion extends javax.swing.JPanel {

    String buscador = "";
    /**
     * Creates new form Ver_cliente
     */
    public Listado_gestion() {
        initComponents();
        Main.mostrarListadoGestion(t_buscador.getText(),tabla,buscador);



    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        b_porPieza = new javax.swing.JButton();
        b_porProyecto = new javax.swing.JButton();
        b_restablecer = new javax.swing.JButton();
        t_buscador = new javax.swing.JTextField();
        b_porproveedor = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1071, 585));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Listado gestion");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Buscar pieza por:");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        b_porPieza.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b_porPieza.setText("Pieza");
        b_porPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_porPiezaActionPerformed(evt);
            }
        });

        b_porProyecto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b_porProyecto.setText("Proyecto");
        b_porProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_porProyectoActionPerformed(evt);
            }
        });

        b_restablecer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b_restablecer.setText("Restablecer");
        b_restablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_restablecerActionPerformed(evt);
            }
        });

        t_buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t_buscadorKeyReleased(evt);
            }
        });

        b_porproveedor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b_porproveedor.setText("Proveedor");
        b_porproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_porproveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(473, 473, 473))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(t_buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(434, 434, 434))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(33, 33, 33)
                                .addComponent(b_porPieza, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(b_porproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(b_porProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(b_restablecer))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(b_porPieza, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_porproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_restablecer, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_porProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(t_buscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void b_porPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_porPiezaActionPerformed
        // TODO add your handling code here:
        buscador = "pieza";
    }//GEN-LAST:event_b_porPiezaActionPerformed

    private void b_porProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_porProyectoActionPerformed
        // TODO add your handling code here:
        buscador = "proyecto";

    }//GEN-LAST:event_b_porProyectoActionPerformed

    private void b_restablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_restablecerActionPerformed
        // TODO add your handling code here:
        buscador = "";
        Main.mostrarListadoGestion(t_buscador.getText(),tabla,buscador);
        t_buscador.setText("");

    }//GEN-LAST:event_b_restablecerActionPerformed

    private void t_buscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_buscadorKeyReleased
        // TODO add your handling code here:
        String filtro = t_buscador.getText();
        Main.mostrarListadoGestion(filtro,tabla,buscador);
    }//GEN-LAST:event_t_buscadorKeyReleased

    private void b_porproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_porproveedorActionPerformed
        // TODO add your handling code here:
        buscador = "proveedor";
    }//GEN-LAST:event_b_porproveedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_porPieza;
    private javax.swing.JButton b_porProyecto;
    private javax.swing.JButton b_porproveedor;
    private javax.swing.JButton b_restablecer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t_buscador;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}

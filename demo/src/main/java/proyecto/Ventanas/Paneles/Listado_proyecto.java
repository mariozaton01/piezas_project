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
public class Listado_proyecto extends javax.swing.JPanel {

    String buscador = "";
    /**
     * Creates new form Ver_cliente
     */
    public Listado_proyecto() {
        initComponents();
        Main.mostrarListadoProyectos(t_buscador.getText(),tabla,buscador);


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
        b_porID = new javax.swing.JButton();
        b_porCiudad = new javax.swing.JButton();
        b_restablecer = new javax.swing.JButton();
        t_buscador = new javax.swing.JTextField();
        b_porNombre = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1071, 585));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Listado proyecto");

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
                "ID", "Nombre", "Ciudad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        b_porID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b_porID.setText("ID");
        b_porID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_porIDActionPerformed(evt);
            }
        });

        b_porCiudad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b_porCiudad.setText("Ciudad");
        b_porCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_porCiudadActionPerformed(evt);
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

        b_porNombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b_porNombre.setText("Nombre");
        b_porNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_porNombreActionPerformed(evt);
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
                        .addComponent(t_buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(434, 434, 434))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(40, 40, 40)
                                .addComponent(b_porID, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(b_porNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(b_porCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105)
                                .addComponent(b_restablecer))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(470, 470, 470))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_porNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_porCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_porID, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_restablecer, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(t_buscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void b_porIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_porIDActionPerformed
        // TODO add your handling code here:
        buscador = "id";
    }//GEN-LAST:event_b_porIDActionPerformed

    private void b_porCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_porCiudadActionPerformed
        // TODO add your handling code here:
        buscador = "ciudad";

    }//GEN-LAST:event_b_porCiudadActionPerformed

    private void b_restablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_restablecerActionPerformed
        // TODO add your handling code here:
        buscador = "";
        Main.mostrarListadoProyectos(t_buscador.getText(),tabla,buscador);
        t_buscador.setText("");
    }//GEN-LAST:event_b_restablecerActionPerformed

    private void t_buscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_buscadorKeyReleased
        // TODO add your handling code here:
        String filtro = t_buscador.getText();
        Main.mostrarListadoProyectos(filtro,tabla,buscador);
    }//GEN-LAST:event_t_buscadorKeyReleased

    private void b_porNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_porNombreActionPerformed
        // TODO add your handling code here:
        buscador = "nombre";

    }//GEN-LAST:event_b_porNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_porCiudad;
    private javax.swing.JButton b_porID;
    private javax.swing.JButton b_porNombre;
    private javax.swing.JButton b_restablecer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t_buscador;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesoadatos.AlumnoData;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author santi
 */
public class Alumnos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Alumno
     */
    public Alumnos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdocumento = new javax.swing.JLabel();
        japellido = new javax.swing.JLabel();
        jnombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jfnacimiento = new javax.swing.JLabel();
        jnuevo = new javax.swing.JButton();
        jeliminar = new javax.swing.JButton();
        jguardar = new javax.swing.JButton();
        jsalir = new javax.swing.JButton();
        jbuscar = new javax.swing.JButton();
        jTextFielddoc = new javax.swing.JTextField();
        jTextFieldap = new javax.swing.JTextField();
        jTextField3nombre1 = new javax.swing.JTextField();
        jRadioButton1estado = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();

        jdocumento.setText("Documento");

        japellido.setText("Apellido");

        jnombre.setText("Nombre");

        jLabel4.setText("Estado");

        jfnacimiento.setText("Fecha de nacimiento");

        jnuevo.setText("Nuevo");
        jnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnuevoActionPerformed(evt);
            }
        });

        jeliminar.setText("Eliminar");

        jguardar.setText("Guardar");
        jguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jguardarActionPerformed(evt);
            }
        });

        jsalir.setText("Salir");

        jbuscar.setText("buscar");

        jTextFielddoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielddocActionPerformed(evt);
            }
        });

        jTextField3nombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3nombre1ActionPerformed(evt);
            }
        });

        jRadioButton1estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1estadoActionPerformed(evt);
            }
        });

        jLabel6.setText("alumnos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addComponent(jnuevo)
                            .addGap(29, 29, 29)
                            .addComponent(jeliminar)
                            .addGap(30, 30, 30)
                            .addComponent(jguardar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jsalir))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jdocumento)
                                            .addGap(33, 33, 33)
                                            .addComponent(jTextFielddoc, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(japellido)
                                                .addComponent(jnombre))
                                            .addGap(50, 50, 50)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextFieldap)
                                                .addComponent(jTextField3nombre1))))
                                    .addGap(33, 33, 33)
                                    .addComponent(jbuscar))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jfnacimiento))
                                    .addGap(58, 58, 58)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(63, 63, 63))
                                        .addComponent(jRadioButton1estado))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jdocumento)
                            .addComponent(jTextFielddoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(japellido)
                            .addComponent(jTextFieldap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(jnombre))
                    .addComponent(jTextField3nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1estado)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jfnacimiento)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jnuevo)
                    .addComponent(jeliminar)
                    .addComponent(jguardar)
                    .addComponent(jsalir))
                .addGap(71, 71, 71))
        );

        jLabel6.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnuevoActionPerformed

    private void jTextFielddocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielddocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielddocActionPerformed

    private void jTextField3nombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3nombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3nombre1ActionPerformed

    private void jRadioButton1estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1estadoActionPerformed

    private void jguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jguardarActionPerformed
       
//        int doc =Integer.parseInt(jTextFielddoc.getText());
//        String ap = jTextFieldap.getText();
//        String nom = jTextField3nombre1.getText();
//        boolean es = Boolean.parseBoolean(jRadioButton1estado.getText());
//        
//        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
//        
//        String fecha = sdf.format(jDateChooser1.getCalendar());
//      
        
       
        
        
       
        
        
        
        
        
         
        
        
    }//GEN-LAST:event_jguardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1estado;
    private javax.swing.JTextField jTextField3nombre1;
    private javax.swing.JTextField jTextFieldap;
    private javax.swing.JTextField jTextFielddoc;
    private javax.swing.JLabel japellido;
    private javax.swing.JButton jbuscar;
    private javax.swing.JLabel jdocumento;
    private javax.swing.JButton jeliminar;
    private javax.swing.JLabel jfnacimiento;
    private javax.swing.JButton jguardar;
    private javax.swing.JLabel jnombre;
    private javax.swing.JButton jnuevo;
    private javax.swing.JButton jsalir;
    // End of variables declaration//GEN-END:variables





}
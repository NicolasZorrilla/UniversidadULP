
package gui;

import dataBaseAccess.*;
import entity.*;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nicolas
 */
public class ManejoDeInscripcion extends javax.swing.JInternalFrame {

    DefaultTableModel tableModel = new DefaultTableModel() {
        public boolean isCellEditable(int r, int c) {
            return false;
        }
    };
    /**
     * Creates new form ManejoDeInscripciones
     */
    public ManejoDeInscripcion() {
        initComponents();
        cargarComboAlumno();
        cargarModeloTabla();
        grupoBotones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboAlumno = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnMateriaInscripta = new javax.swing.JRadioButton();
        btnMateriaNoInscripta = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMateria = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        btnInscribir = new javax.swing.JButton();
        btnAnular = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setClosable(true);
        setTitle("Manejo de inscripciones");
        setPreferredSize(new java.awt.Dimension(500, 400));

        jPanel1.setBackground(new java.awt.Color(148, 176, 183));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel1.setText("Seleccione un alumno:");

        comboAlumno.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        comboAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAlumnoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel2.setText("Listado de materias");

        btnMateriaInscripta.setBackground(new java.awt.Color(148, 176, 183));
        btnMateriaInscripta.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        btnMateriaInscripta.setText("Materias inscriptas");
        btnMateriaInscripta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMateriaInscripta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMateriaInscriptaActionPerformed(evt);
            }
        });

        btnMateriaNoInscripta.setBackground(new java.awt.Color(148, 176, 183));
        btnMateriaNoInscripta.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        btnMateriaNoInscripta.setText("Materias no inscriptas");
        btnMateriaNoInscripta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMateriaNoInscripta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMateriaNoInscriptaActionPerformed(evt);
            }
        });

        tableMateria.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.borderColor"));
        tableMateria.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        tableMateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableMateria.setGridColor(new java.awt.Color(74, 112, 122));
        jScrollPane1.setViewportView(tableMateria);

        jSeparator1.setBackground(new java.awt.Color(118, 151, 160));
        jSeparator1.setForeground(new java.awt.Color(74, 112, 122));

        jPanel2.setBackground(new java.awt.Color(74, 112, 122));

        btnInscribir.setBackground(new java.awt.Color(74, 112, 122));
        btnInscribir.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        btnInscribir.setForeground(new java.awt.Color(255, 255, 255));
        btnInscribir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/user-plus.png"))); // NOI18N
        btnInscribir.setText("Inscribir");
        btnInscribir.setBorder(null);
        btnInscribir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInscribir.setMaximumSize(new java.awt.Dimension(41, 17));
        btnInscribir.setMinimumSize(new java.awt.Dimension(41, 17));
        btnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirActionPerformed(evt);
            }
        });

        btnAnular.setBackground(new java.awt.Color(74, 112, 122));
        btnAnular.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        btnAnular.setForeground(new java.awt.Color(255, 255, 255));
        btnAnular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/user-cancel.png"))); // NOI18N
        btnAnular.setText("Anular");
        btnAnular.setBorder(null);
        btnAnular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnular.setPreferredSize(new java.awt.Dimension(83, 27));
        btnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(74, 112, 122));
        btnSalir.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/x.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setPreferredSize(new java.awt.Dimension(83, 27));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(btnInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAnular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInscribir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAnular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnMateriaInscripta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMateriaNoInscripta))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboAlumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(174, 174, 174))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMateriaInscripta)
                    .addComponent(btnMateriaNoInscripta))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addGap(63, 63, 63)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirActionPerformed
        int row = tableMateria.getSelectedRow();

        if (row != -1 && btnMateriaNoInscripta.isSelected()) {
            int idMateria = (int)tableMateria.getValueAt(row, 0);
            
            MateriaData materiadata = new MateriaData();
            Materia materia = materiadata.buscarMateria(idMateria);

            Alumno alumno = (Alumno)comboAlumno.getSelectedItem();
        
            Inscripcion inscripcion = new Inscripcion(alumno, materia, 0);

            InscripcionData inscripciondata = new InscripcionData();
            inscripciondata.guardarInscripcion(inscripcion);
        } else {
            JOptionPane.showMessageDialog(this, "No puede inscribir el alumno.");
        }
        refrescarTabla();
    }//GEN-LAST:event_btnInscribirActionPerformed

    private void btnMateriaInscriptaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMateriaInscriptaActionPerformed
        refrescarTabla();
    }//GEN-LAST:event_btnMateriaInscriptaActionPerformed

    private void btnMateriaNoInscriptaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMateriaNoInscriptaActionPerformed
        refrescarTabla();
    }//GEN-LAST:event_btnMateriaNoInscriptaActionPerformed

    private void btnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularActionPerformed
        int row = tableMateria.getSelectedRow();
        
        if (row != -1 && btnMateriaInscripta.isSelected()) {
            int idMateria = (int)tableMateria.getValueAt(row, 0);
            Alumno alumno = (Alumno)comboAlumno.getSelectedItem();
            InscripcionData inscripciondata = new InscripcionData();
            inscripciondata.borrarInscripcionMateriaAlumno(alumno.getIdAlumno(), idMateria);
        } else {
            JOptionPane.showMessageDialog(this, "No puede anular la inscripción.");
        }
        refrescarTabla();
    }//GEN-LAST:event_btnAnularActionPerformed

    private void comboAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAlumnoActionPerformed
        refrescarTabla();
    }//GEN-LAST:event_comboAlumnoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnInscribir;
    private javax.swing.JRadioButton btnMateriaInscripta;
    private javax.swing.JRadioButton btnMateriaNoInscripta;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<Alumno> comboAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tableMateria;
    // End of variables declaration//GEN-END:variables

    private void cargarModeloTabla() {
        tableModel.addColumn("Código");
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Año");
        tableMateria.setModel(tableModel);
    }
    
    private void cargarComboAlumno() {
        AlumnoData alumnodata = new AlumnoData();
        for (Alumno alumno : alumnodata.listarAlumnos()) {
            comboAlumno.addItem(alumno);
        }
    }
    
    private void limpiarFilas() {
        for (int i = tableModel.getRowCount() -1; i >= 0; i--) {
            tableModel.removeRow(i);
        }
    }
    
    private void refrescarTabla() {
        limpiarFilas();

        Alumno alumno = (Alumno)comboAlumno.getSelectedItem();

        Set<Materia> materias = new HashSet();
        
        InscripcionData inscripciondata = new InscripcionData();
        
        if (btnMateriaInscripta.isSelected()) {
            materias = inscripciondata.obtenerMateriasCursadas(alumno.getIdAlumno());
        } else if (btnMateriaNoInscripta.isSelected()) {
            materias = inscripciondata.obtenerMateriasNoCursadas(alumno.getIdAlumno());
        }

        for (Materia materia : materias) {
            tableModel.addRow(new Object[] {
                materia.getIdMateria(),
                materia.getNombre(),
                materia.getAnio()
            });
        }
    }
    
    private void grupoBotones() {
        buttonGroup1.add(btnMateriaInscripta);
        buttonGroup1.add(btnMateriaNoInscripta);
    }
}

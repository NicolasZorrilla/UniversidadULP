
package gui;

import dataBaseAccess.InscripcionData;
import dataBaseAccess.MateriaData;
import entity.Alumno;
import entity.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nicolas
 */
public class AlumnoPorMateria extends javax.swing.JInternalFrame {

    DefaultTableModel tableModel = new DefaultTableModel() {
        public boolean isCellEditable(int r, int c) {
            return false;
        }
    };
    /**
     * Creates new form AlumnoPorMateria
     */
    public AlumnoPorMateria() {
        initComponents();
        cargarModeloTabla();
        cargarComboMateria();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboMateria = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAlumno = new javax.swing.JTable();

        setClosable(true);
        setTitle("Alumnos por materia");
        setPreferredSize(new java.awt.Dimension(500, 400));

        jPanel1.setBackground(new java.awt.Color(148, 176, 183));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel1.setText("Seleccione una materia:");

        comboMateria.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        comboMateria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMateriaActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(148, 176, 183));
        jSeparator1.setForeground(new java.awt.Color(74, 112, 122));

        tableAlumno.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.borderColor"));
        tableAlumno.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        tableAlumno.setModel(new javax.swing.table.DefaultTableModel(
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
        tableAlumno.setGridColor(new java.awt.Color(74, 112, 122));
        jScrollPane1.setViewportView(tableAlumno);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboMateria, 0, 180, Short.MAX_VALUE)))
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMateriaActionPerformed
        limpiarFilas();

        Materia materia = (Materia)comboMateria.getSelectedItem();

        InscripcionData inscripciondata = new InscripcionData();
        
        List<Alumno> alumnos = new ArrayList();
        alumnos = inscripciondata.obtenerAlumnosPorMateria(materia.getIdMateria());
        
        for (Alumno alumno : alumnos) {
            tableModel.addRow(new Object[] {
                alumno.getIdAlumno(),
                alumno.getDni(),
                alumno.getApellido(),
                alumno.getNombre(),
                alumno.getFechaNacimiento()
            });
        }
    }//GEN-LAST:event_comboMateriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Materia> comboMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tableAlumno;
    // End of variables declaration//GEN-END:variables

    private void cargarModeloTabla() {
        tableModel.addColumn("ID Alumno");
        tableModel.addColumn("DNI");
        tableModel.addColumn("Apellido");
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Fecha de nacimiento");
        tableAlumno.setModel(tableModel);
    }
    
    private void cargarComboMateria() {
        MateriaData materiadata = new MateriaData();
        for (Materia materia : materiadata.listarMaterias()) {
            comboMateria.addItem(materia);
        }
    }
    
    private void limpiarFilas() {
        for (int i = tableModel.getRowCount() -1; i >= 0; i--) {
            tableModel.removeRow(i);
        }
    }
}

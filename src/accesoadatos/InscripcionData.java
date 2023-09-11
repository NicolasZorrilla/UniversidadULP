
package accesoadatos;

import entidades.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class InscripcionData {
    private Connection conex;
    private AlumnoData aluData;
    private MateriaData matData;
    
    public InscripcionData() {
        this.conex = Conexion.getConexion();
    }
    
    public void guardarInscripcion(Inscripcion insc) {
        String sql = "INSERT INTO inscripcion (alumno, materia, nota) "
                    + "VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = conex.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setObject(1, insc.getAlumno());
            ps.setObject(2, insc.getMateria());
            ps.setInt(3, insc.getNota());

            ResultSet rs = ps.getGeneratedKeys();//tabla de inscripcion

            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripción guardada.");
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripción. " + ex.getMessage());
        }
    }
    
    public List<Inscripcion> obtenerInscripciones() {
        List<Inscripcion> inscripciones = new ArrayList<>();
        try {
            String sql = "SELECT * FROM inscripcion WHERE alumno";

            PreparedStatement ps = conex.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion. " + ex.getMessage());
        }
        return inscripciones;
    }
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
        List<Inscripcion> inscripciones = new ArrayList();
        // Falta realizar
        return inscripciones;
    }
    
    // Este método recibe el id de un alumno.
    public List<Materia> obtenerMateriasCursadas(int id) {
        List<Materia> materias = new ArrayList();
        // Falta realizar
        return materias;
    }
    
    public List<Materia> obtenerMateriasNoCursadas(int id) {
        List<Materia> materias = new ArrayList();
        // Falta realizar
        return materias;
    }
    
    public void borrarInscripcionMateriaAlumno(int idAlumno) {
        // Falta realizar
    }
    
    public void actualizarNota(int idAlumno, int idMateria, int nota) {
        // Falta realizar
    }
    
    public List<Alumno> obtenerAlumnosPorMateria(int idMateria) {
        List<Alumno> alumnos = new ArrayList();
        // Falta realizar
        return alumnos;
    }
    
}

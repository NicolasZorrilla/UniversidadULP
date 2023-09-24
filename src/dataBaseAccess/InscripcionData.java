
package dataBaseAccess;

import entity.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;

public class InscripcionData {
    private Connection conex;
    private AlumnoData aluData;
    private MateriaData matData;
    
    public InscripcionData() {
        this.conex = DataBaseConnection.getConnection();
    }
    
    public void guardarInscripcion(Inscripcion insc) {
        try {
            String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria) "
                    + "VALUES (?, ?, ?)";
            
            PreparedStatement ps = conex.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys(); //tabla de inscripcion

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
            String sql = "SELECT * FROM inscripcion";

            PreparedStatement ps = conex.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripción. " + ex.getMessage());
        }
        return inscripciones;
    }
    
    /*
        Este método debe obtener las inscripciones del alumno
        pasandole el id del alumno por parametro
    */
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
        List<Inscripcion> inscripciones = new ArrayList();
        try {
            String listar = "SELECT materia.idMateria, materia.nombre, nota "
                    + "FROM inscripcion JOIN materia "
                    + "ON (materia.idMateria = inscripcion.idMateria) "
                    + "WHERE idAlumno = ?";
            
            PreparedStatement ps = conex.prepareStatement(listar);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                Materia materia = new Materia();
                materia.setNombre(rs.getString("materia.nombre"));
                materia.setIdMateria(rs.getInt("materia.idMateria"));
                inscripcion.setMateria(materia);
                inscripcion.setNota(rs.getInt("nota"));
                inscripciones.add(inscripcion);
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a las tablas inscripcion y/o materia. " + ex.getMessage());
        }
        return inscripciones;
    }
    
    // Este método recibe el id de un alumno.
    public Set<Materia> obtenerMateriasCursadas(int id) {
        Set<Materia> materias = new HashSet();
        try {
            String listar = "SELECT materia.idMateria, nombre, año "
                          + "FROM inscripcion JOIN materia "
                          + "ON (inscripcion.idMateria = materia.idMateria) "
                          + "WHERE inscripcion.idAlumno = ? AND materia.estado = 1";
            
            PreparedStatement ps = conex.prepareStatement(listar);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                materias.add(materia);
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a las tablas inscripcion y/o materia. " + ex.getMessage());
        }
        return materias;
    }
    
    public Set<Materia> obtenerMateriasNoCursadas(int id) {
        Set<Materia> materias = new HashSet<>();
        try {
            String listar = "SELECT idMateria, nombre, año FROM materia WHERE estado = 1";
            
            PreparedStatement ps = conex.prepareStatement(listar);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                materias.add(materia);
            }
            
            materias.removeAll(obtenerMateriasCursadas(id));
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a las tablas inscripcion y/o materia. " + ex.getMessage());
        }
        return materias;
    }
    
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        try {
            String borrado = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
            PreparedStatement ps = conex.prepareStatement(borrado);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            
            int resultado = ps.executeUpdate();
            
            if (resultado == 1) {
                JOptionPane.showMessageDialog(null, "La inscripción se eliminó exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Hubo un problema al borrar la inscripción.");
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion. " + ex.getMessage());
        }
    }
    
    public void actualizarNota(int idAlumno, int idMateria, int nota) {
        try {
            String borrado = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
            PreparedStatement ps = conex.prepareStatement(borrado);
            ps.setInt(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            
            int resultado = ps.executeUpdate();
            
            if (resultado == 1) {
                JOptionPane.showMessageDialog(null, "La nota del alumno se modificó exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Hubo un problema al modificar la nota.");
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripción. " + ex.getMessage());
        }
    }
    
    public List<Alumno> obtenerAlumnosPorMateria(int idMateria) {
        List<Alumno> alumnos = new ArrayList();
        try {
            String obtencion = "SELECT alumno.idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno "
                             + "JOIN inscripcion ON (inscripcion.idAlumno = alumno.idAlumno) "
                             + "WHERE inscripcion.idMateria = ? AND alumno.estado = 1";
            PreparedStatement ps = conex.prepareStatement(obtencion);
            ps.setInt(1, idMateria);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumnos.add(alumno);
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a las tablas alumno y/o inscripción. " + ex.getMessage());
        }
        return alumnos;
    }
    
}

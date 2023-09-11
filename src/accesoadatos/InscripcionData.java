
package accesoadatos;

import entidades.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InscripcionData {
    private Connection conex;
    private AlumnoData aluData;
    private MateriaData matData;
    
    public InscripcionData() {
        this.conex = Conexion.getConexion();
    }
    
    public void guardarInscripcion(Inscripcion insc) {
        
    }
    
    public List<Inscripcion> obtenerInscripciones() {
        List<Inscripcion> inscripciones = new ArrayList();
        return inscripciones;
    }
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
        List<Inscripcion> inscripciones = new ArrayList();
        return inscripciones;
    }
    
    // Este método recibe el id de un alumno.
    public List<Materia> obtenerMateriasCursadas(int id) {
        List<Materia> materias = new ArrayList();
        return materias;
    }
    
    public List<Materia> obtenerMateriasNoCursadas(int id) {
        List<Materia> materias = new ArrayList();
        return materias;
    }
    
    public void borrarInscripcionMateriaAlumno(int idAlumno) {
        
    }
    
    public void actualizarNota(int idAlumno, int idMateria, int nota) {
        
    }
    
    public List<Alumno> obtenerAlumnosPorMateria(int idMateria) {
        List<Alumno> alumnos = new ArrayList();
        return alumnos;
    }
    
}

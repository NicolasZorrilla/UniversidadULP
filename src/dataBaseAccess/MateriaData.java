
package dataBaseAccess;

import entity.Materia;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MateriaData {
    private Connection conex;
    
    /* Constructor:
        Al hacer un new MateriaData(), se crea la conexión.
        Se llama al método getConexion() y se almacena en
        el atributo conex de tipo Connection.
    */
    public MateriaData() {
        this.conex = DataBaseConnection.getConnection();
    }
    
    public void guardarMateria(Materia materia) {
        try {
            String nuevaMateria = "INSERT INTO materia (nombre, año, estado) "
                    + "VALUES (?, ?, ?)";
            
            PreparedStatement ps = conex.prepareStatement(nuevaMateria, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "¡Nueva materia añadida con exito!");
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar la materia. " + ex.getMessage());
        }
    }
    
    public Materia buscarMateria(int id) {
        Materia materia = null;
        try {
            String busqueda = "SELECT nombre, año, estado FROM materia WHERE idMateria = ? AND estado = 1";
            
            PreparedStatement ps = conex.prepareStatement(busqueda);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                materia.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe la materia.");
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia. " + ex.getMessage());
        }
        return materia;
    }
    
    public void modificarMateria(Materia materia) {
        try {
            String modificacion = "UPDATE materia SET nombre = ?, año = ?, estado = ? WHERE idMateria = ?";
            
            PreparedStatement ps = conex.prepareStatement(modificacion);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(4, materia.getIdMateria());
            
            int resultado = ps.executeUpdate();
            
            if (resultado == 1) {
                JOptionPane.showMessageDialog(null, "La materia se modificó exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar la materia.");
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia. " + ex.getMessage());
        }
    }
    
    public void eliminarMateria(int id) {
        try {
            String modificacion = "UPDATE materia SET estado = 0 WHERE idMateria = ?";
            
            PreparedStatement ps = conex.prepareStatement(modificacion);
            ps.setInt(1, id);
            
            int resultado = ps.executeUpdate();
            
            if (resultado == 1) {
                JOptionPane.showMessageDialog(null, "La materia se eliminó exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar la materia.");
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia. " + ex.getMessage());
        }
    }
    
    public List<Materia> listarMaterias() {
        List<Materia> materias = new ArrayList();
        try {
            String listar = "SELECT * FROM materia";
            
            PreparedStatement ps = conex.prepareStatement(listar);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                materia.setEstado(rs.getBoolean("estado"));
                materias.add(materia); // Se agregar la materia creada arriba al arraylist.
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia. " + ex.getMessage());
        }
        return materias;
    }
}

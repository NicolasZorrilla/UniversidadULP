/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoadatos;

import entidades.Inscripcion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author nicolas
 */
public class InscripcionData {
    
    private Connection con = null;
    private MateriaData materiadata;
    private AlumnoData alumnosdata;
    
    

    public InscripcionData() {
        
        con= Conexion.getConexion();
    }
    
    
    
    
    
    
    
    public void guardarInscripcion (Inscripcion Inscripcion) {
        
        String sql = "INSERT INTO Inscripcion (Alumno, Materia ,nota)"
                +"VALUES (?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setObject(1, Inscripcion.getAlumno());
            ps.setObject(2, Inscripcion.getMateria());
            ps.setInt(3, Inscripcion.getNota());
            
            ResultSet RS = ps.getGeneratedKeys();//tabla de inscripcion
            
            
             if (RS.next()) {
             
             Inscripcion.setIdInscripcion(RS.getInt(1));
             
             
               JOptionPane.showMessageDialog(null,"inscripcion guardado");
             } 
            ps.close();
           
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripcion"+ex.getMessage());
        }
        
        
    }
    
  public List<Inscripcion> obtenerInscripcion() {
        
       
    
    List<Inscripcion> Inscripcion = new ArrayList<>();
  
    
 try{   
    
    String sql = "SELECT * FROM Inscripion WHERE Alumno"; 
    
    PreparedStatement ps = con.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
      
  while (rs.next()) {
      
      Inscripcion inscripcion = new Inscripcion();
      
      
      
      
      
      
      
  }
  
   
 } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, " "+ex.getMessage());
    
 }   
   return Inscripcion; 
}
  
}
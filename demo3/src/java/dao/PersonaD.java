package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.PersonaM;

public class PersonaD extends Dao {
    public void AddPersonas(PersonaM persona) throws Exception {
        try {
            this.conectar();            
            String sql = "insert into persona (dni,nombres,correo,fecnac) values (?,?,?,?)";
            PreparedStatement ps = this.getCn().prepareStatement(sql);
            ps.setInt(1, persona.getDni());
            ps.setString(2, persona.getNombres());
            ps.setString(3, persona.getCorreo());            
            ps.setString(4, persona.getFecnac());
//            ps.setDate(4, persona.getFecnac());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
    }
    
    public List<PersonaM> listarPersona() throws Exception {
        List<PersonaM> lista;
        ResultSet rs;
        try {
            this.conectar();
            String sql = "SELECT * FROM persona";
            PreparedStatement ps = this.getCn().prepareStatement(sql);
            rs = ps.executeQuery();
            lista = new ArrayList();
            PersonaM persona;
            while (rs.next()) {
                persona = new PersonaM();
                persona.setDni(rs.getInt("dni"));
                persona.setNombres(rs.getString("nombres"));
                persona.setCorreo(rs.getString("correo"));                
                persona.setFecnac(rs.getString("fecnac"));
//                persona.setFecnac(rs.getDate("fecnac"));
                lista.add(persona);
            }
        } catch (Exception e) {
            throw e;
        }
        return lista;
    }
    
}

package controlador;

import dao.PersonaD;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import modelo.PersonaM;

@Named(value = "PersonaC")
@SessionScoped
public class PersonaC implements Serializable{
    
    PersonaM persona = new PersonaM();
    PersonaD per = new PersonaD();
    private List<PersonaM> lstPersona;
    
    @PostConstruct
    public void inicio(){
        try {
            listPersona();
        } catch (Exception ex) {
            Logger.getLogger(PersonaC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void listPersona() throws Exception{
        try {
            lstPersona = per.listarPersona();
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void addPersona() throws Exception{
        try {
            per.AddPersonas(persona);
            listPersona();
            clearPersona();
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void clearPersona() throws Exception{
        try {
            persona.setDni(0);
            persona.setNombres(null);
            persona.setCorreo(null);
            persona.setFecnac(null);
        } catch (Exception e) {
            throw e;
        }
    }

    public PersonaM getPersona() {
        return persona;
    }

    public void setPersona(PersonaM persona) {
        this.persona = persona;
    }

    public PersonaD getPer() {
        return per;
    }

    public void setPer(PersonaD per) {
        this.per = per;
    } 

    public List<PersonaM> getLstPersona() {
        return lstPersona;
    }

    public void setLstPersona(List<PersonaM> lstPersona) {
        this.lstPersona = lstPersona;
    }    
    
}

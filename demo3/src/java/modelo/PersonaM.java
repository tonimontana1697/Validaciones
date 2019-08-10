package modelo;

import java.sql.Date;

public class PersonaM {
    private int dni;
    private String nombres, correo, fecnac;   
    
//    private Date fecnac;
    
    /**
     * @return the dni
     */
    public int getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(int dni) {
        this.dni = dni;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

//    public Date getFecnac() {
//        return fecnac;
//    }
//
//    public void setFecnac(Date fecnac) {
//        this.fecnac = fecnac;
//    }   

    public String getFecnac() {
        return fecnac;
    }

    public void setFecnac(String fecnac) {
        this.fecnac = fecnac;
    }
    
    

}
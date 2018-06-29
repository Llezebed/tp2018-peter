package aplicacion.modelo.dominio;
// Generated 21/06/2018 01:26:29 by Hibernate Tools 4.3.1



import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Perfil generated by hbm2java
 */
public class Perfil  implements java.io.Serializable {


     private Integer perCodigo;
     private Usuario usuarios;
     private String perNombres;
     private String perApellidos;
     private String perDni;
     private Date perFechaNac;
     private String perEmail;
     private String perDireccion;
     private boolean perEstado;
     private Set ventasEntradases = new HashSet(0);

    public Perfil() {
    }

	
    public Perfil(Usuario usuarios, String perNombres, String perApellidos, String perDni, Date perFechaNac, String perEmail, String perDireccion, boolean perEstado) {
        this.usuarios = usuarios;
        this.perNombres = perNombres;
        this.perApellidos = perApellidos;
        this.perDni = perDni;
        this.perFechaNac = perFechaNac;
        this.perEmail = perEmail;
        this.perDireccion = perDireccion;
        this.perEstado = perEstado;
    }
    
   
    public Integer getPerCodigo() {
        return this.perCodigo;
    }
    
    public void setPerCodigo(Integer perCodigo) {
        this.perCodigo = perCodigo;
    }
    public Usuario getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Usuario usuarios) {
        this.usuarios = usuarios;
    }
    public String getPerNombres() {
        return this.perNombres;
    }
    
    public void setPerNombres(String perNombres) {
        this.perNombres = perNombres;
    }
    public String getPerApellidos() {
        return this.perApellidos;
    }
    
    public void setPerApellidos(String perApellidos) {
        this.perApellidos = perApellidos;
    }
    public String getPerDni() {
        return this.perDni;
    }
    
    public void setPerDni(String perDni) {
        this.perDni = perDni;
    }
    public Date getPerFechaNac() {
        return this.perFechaNac;
    }
    
    public void setPerFechaNac(Date perFechaNac) {
        this.perFechaNac = perFechaNac;
    }
    public String getPerEmail() {
        return this.perEmail;
    }
    
    public void setPerEmail(String perEmail) {
        this.perEmail = perEmail;
    }
    public String getPerDireccion() {
        return this.perDireccion;
    }
    
    public void setPerDireccion(String perDireccion) {
        this.perDireccion = perDireccion;
    }
    public boolean isPerEstado() {
        return this.perEstado;
    }
    
    public void setPerEstado(boolean perEstado) {
        this.perEstado = perEstado;
    }
    public Set getVentasEntradases() {
        return this.ventasEntradases;
    }
    
    public void setVentasEntradases(Set ventasEntradases) {
        this.ventasEntradases = ventasEntradases;
    }




}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.PerfilBean;
import aplicacion.modelo.dominio.Perfil;
import aplicacion.modelo.dominio.Usuario;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author ZAMBRA
 */
@ManagedBean
@ViewScoped
public class PerfilFormBean {
    @ManagedProperty(value = "#{perfilBean}")
    private PerfilBean perfilBean;
    private Usuario unUsuario;
    private Perfil unPerfil;
    private String nombreUs;
    private String passwUs;
    private String tipo;
    private String nombres;
    private String apellidos;
    private boolean busqueda;
    private List<Perfil> perfilEncontrados;
    private String dni;

    /**
     * Creates a new instance of PerfilFormBean
     */
    public PerfilFormBean() {
        perfilBean = new PerfilBean();
        listarPerfiles();
    }
    private void listarPerfiles(){
        perfilEncontrados = perfilBean.listarPerfiles();
    }
    public void establecerPerfil(Perfil per){
        setUnPerfil(per);
    }
    public void agregarPerfil(){
        unUsuario = new Usuario(getNombreUs(),getPasswUs(),getTipo(),true);
        unPerfil = new Perfil(getUnUsuario(), getNombres(),getApellidos(),"11111",new Date(),"email","direccion",true);
        try{
            perfilBean.agregarPerfil(unPerfil);
        }
        catch (Exception e)
        { FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error","El usuario no se ha podido crear");
          FacesContext.getCurrentInstance().addMessage(null,facesMessage);
        }
        
             FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_INFO,"Felicidades!","Usuario creado con exito");
          FacesContext.getCurrentInstance().addMessage(null,facesMessage);
          listarPerfiles();
    }
    public void eliminarPerfil(){
        getUnPerfil().getUsuarios().setUsuEstado(false);
        getUnPerfil().setPerEstado(false);
        perfilBean.modificarPerfil(getUnPerfil());
        listarPerfiles();
    }
    public void modificarPerfil(){
        perfilBean.modificarPerfil(getUnPerfil());
    }
    public PerfilBean getPerfilBean() {
        return perfilBean;
    }

    /**
     * @param perfilBean the perfilBean to set
     */
    public void setPerfilBean(PerfilBean perfilBean) {
        this.perfilBean = perfilBean;
    }

    /**
     * @return the unUsuario
     */
    public Usuario getUnUsuario() {
        return unUsuario;
    }

    /**
     * @param unUsuario the unUsuario to set
     */
    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }

    /**
     * @return the unPerfil
     */
    public Perfil getUnPerfil() {
        return unPerfil;
    }

    /**
     * @param unPerfil the unPerfil to set
     */
    public void setUnPerfil(Perfil unPerfil) {
        this.unPerfil = unPerfil;
    }

    /**
     * @return the nombreUs
     */
    public String getNombreUs() {
        return nombreUs;
    }

    /**
     * @param nombreUs the nombreUs to set
     */
    public void setNombreUs(String nombreUs) {
        this.nombreUs = nombreUs;
    }

    /**
     * @return the passwUs
     */
    public String getPasswUs() {
        return passwUs;
    }

    /**
     * @param passwUs the passwUs to set
     */
    public void setPasswUs(String passwUs) {
        this.passwUs = passwUs;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
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
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the busqueda
     */
    public boolean isBusqueda() {
        return busqueda;
    }

    /**
     * @param busqueda the busqueda to set
     */
    public void setBusqueda(boolean busqueda) {
        this.busqueda = busqueda;
    }

    /**
     * @return the perfilEncontrados
     */
    public List<Perfil> getPerfilEncontrados() {
        return perfilEncontrados;
    }

    /**
     * @param perfilEncontrados the perfilEncontrados to set
     */
    public void setPerfilEncontrados(List<Perfil> perfilEncontrados) {
        this.perfilEncontrados = perfilEncontrados;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }
    
}

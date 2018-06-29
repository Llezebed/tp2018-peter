/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.UsuarioBean;
import aplicacion.datos.hibernate.dao.imp.UsuarioDAOImp;
import aplicacion.modelo.dominio.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author usuario
 */
@ManagedBean
@ViewScoped
public class UsuarioFormBean implements Serializable{
    @ManagedProperty(value="#{usuarioBean}")
    private UsuarioBean usuarioBean;
    private List <Usuario> lista;
    
    /**
     * Creates a new instance of UsuarioFormBean
     */
    public UsuarioFormBean(){
        
        usuarioBean = new UsuarioBean(); 
        obtenerTodo();
    }

    
    
    private void obtenerTodo(){
        setLista(getUsuarioBean().obtenerTodos());
    }

    /**
     * @return the usuarioBean
     */
    public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    /**
     * @param usuarioBean the usuarioBean to set
     */
    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }

    /**
     * @return the lista
     */
    public List <Usuario> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List <Usuario> lista) {
        this.lista = lista;
    }

    /**
     * @return the nuevoDAO
     */
    
}

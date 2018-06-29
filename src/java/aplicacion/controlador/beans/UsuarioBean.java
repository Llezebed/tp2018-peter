/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.datos.hibernate.dao.UsuarioDAO;
import aplicacion.datos.hibernate.dao.imp.UsuarioDAOImp;
import aplicacion.modelo.dominio.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author usuario
 */
@ManagedBean
@ViewScoped
public class UsuarioBean implements Serializable{
    private UsuarioDAOImp usuariodaoimp = new UsuarioDAOImp ();
    List<Usuario> listausuario;
    
    /**
     *
     * Creates a new instance of UsuarioBean
     */
    public UsuarioBean() {
    }
    
    public Usuario validarUsuario(String nombreUs, String passwUs){
        Usuario usuario=null;
        UsuarioDAO usuarioDAO=new UsuarioDAOImp();
         //TablaUsuarios unUsuario=new TablaUsuarios();
        usuario=usuarioDAO.consulta(nombreUs,passwUs);
        return usuario;
    }
    public List<Usuario> obtenerTodos(){
        setListausuario(getUsuariodaoimp().obtenerTodos());
        return getListausuario();
    }
    /**
     * @return the usuariodaoimp
     */
    public UsuarioDAOImp getUsuariodaoimp() {
        return usuariodaoimp;
    }

    /**
     * @param usuariodaoimp the usuariodaoimp to set
     */
    public void setUsuariodaoimp(UsuarioDAOImp usuariodaoimp) {
        this.usuariodaoimp = usuariodaoimp;
    }

    /**
     * @return the listausuario
     */
    public List<Usuario> getListausuario() {
        return listausuario;
    }

    /**
     * @param listausuario the listausuario to set
     */
    public void setListausuario(List<Usuario> listausuario) {
        this.listausuario = listausuario;
        
        
    }
    
}

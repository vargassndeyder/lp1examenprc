/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.v2019.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import pe.edu.upeu.v2019.entity.Usuario;

/**
 *
 * @author alum.fial1
 */
public interface UsuarioDao {
	
    HashMap<String,Object> validar(String user, String clave);
    
    int create(Usuario u);
    int update(Usuario u);
    int delete(int id);
    public Usuario read(int id);
    
    boolean search(String user);
    
    List<Map<String, Object>> readAll();
    
    List<Usuario> BuscarCliente(int idusario, String clave); 
}

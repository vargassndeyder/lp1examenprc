/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.v2019.entity;

/**
 *
 * @author alum.fial1
 */
public class Usuario {
	private int idusuario;
	private  int idpersona;
	private int rol;
	
	private String nom_user;
	private String clave;
	private String estado;
	
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public int getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}
	public int getRol() {
		return rol;
	}
	public void setRol(int rol) {
		this.rol = rol;
	}
	public String getNom_user() {
		return nom_user;
	}
	public void setNom_user(String nom_user) {
		this.nom_user = nom_user;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getEstado() {
		return estado;
	}
	
	public Usuario(int idpersona, int rol, String nom_user, String clave) {
		super();
		this.idpersona = idpersona;
		this.rol = rol;
		this.nom_user = nom_user;
		this.clave = clave;
	}
	
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Usuario(int idusuario, int idpersona, int rol, String nom_user, String clave, String estado) {
		super();
		this.idusuario = idusuario;
		this.idpersona = idpersona;
		this.rol = rol;
		this.nom_user = nom_user;
		this.clave = clave;
		this.estado = estado;
	}
	
	
}

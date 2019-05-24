package pe.edu.upeu.clase08.entity;

public class Alumno {
  private int idalumno;
  private String nombres;
  private String apellidos;
  private String dni;
public Alumno() {
	
}
public Alumno(int idalumno, String nombres, String apellidos, String dni) {
	super();
	this.idalumno = idalumno;
	this.nombres = nombres;
	this.apellidos = apellidos;
	this.dni = dni;
}
public int getIdalumno() {
	return idalumno;
}
public void setIdalumno(int idalumno) {
	this.idalumno = idalumno;
}
public String getNombres() {
	return nombres;
}
public void setNombres(String nombres) {
	this.nombres = nombres;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
  
}

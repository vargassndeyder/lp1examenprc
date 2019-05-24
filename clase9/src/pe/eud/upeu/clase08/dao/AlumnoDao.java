package pe.eud.upeu.clase08.dao;

import java.util.List;

import pe.edu.upeu.clase08.entity.Alumno;


public interface AlumnoDao {
	public int create(Alumno u);
	public int update(Alumno u);
	public int delete(int id);
	public Alumno read(int id);
	public List<Alumno> readAll();

}

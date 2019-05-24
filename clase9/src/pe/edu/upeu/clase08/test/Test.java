package pe.edu.upeu.clase08.test;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import pe.edu.upeu.clase08.entity.Alumno;
import pe.eud.upeu.clase08.dao.AlumnoDao;
import pe.eud.upeu.clase08.daoImp.AlumnoDaoImp;

public class Test {
    private static AlumnoDao dao = new AlumnoDaoImp();
    private static List<Alumno> al = new ArrayList<>();
    private static Gson g = new Gson();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//modificar();
		//listar();
		read();
	}
    
	static void guardar() {
		int x = dao.create(new Alumno(0,"Madai","Chuco","34567"));
		System.out.println(x);
	}
    static void listar() {
    	al = dao.readAll();
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i).getNombres());
		}
	}
    static void eliminar() {
    	System.out.println(dao.delete(9)); 		
	}
    static void modificar() {
    	System.out.println(dao.update(new Alumno(4,"Kranmer","Ramos","77777")));
    }
    static void read() {
    	System.out.println(g.toJson(dao.read(4)));
    }
}

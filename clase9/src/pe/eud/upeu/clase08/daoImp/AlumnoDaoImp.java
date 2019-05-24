package pe.eud.upeu.clase08.daoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pe.edu.upeu.clase08.entity.Alumno;
import pe.eud.upeu.clase08.dao.AlumnoDao;
import pe.eud.upeu.clase08.util.Conexion;

public class AlumnoDaoImp implements AlumnoDao{
	private PreparedStatement ps;
	private ResultSet rs;
	private Connection cx = null;
	@Override
	public int create(Alumno u) {
		int x = 0;
		String sql ="INSERT INTO alumno (idalumno, nombres, apellidos, dni) VALUES (NULL, ?, ?, ?)";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(sql);
			ps.setString(1, u.getNombres());
			ps.setString(2, u.getApellidos());
			ps.setString(3, u.getDni());
			x = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return x;
	}

	@Override
	public int update(Alumno u) {
		// TODO Auto-generated method stub
		int x = 0;
		String sql = "UPDATE alumno SET nombres = ?, apellidos = ?, dni = ? WHERE idalumno = ?";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(sql);
			ps.setString(1, u.getNombres());
			ps.setString(2, u.getApellidos());
			ps.setString(3, u.getDni());
			ps.setInt(4, u.getIdalumno());
    	} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return x;
	}

	@Override
	public int delete(int id) {
		int x = 0;
		// TODO Auto-generated method stub
		String sql= "DELETE FROM alumno WHERE idalumno = ?";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(sql);
			ps.setInt(1, id);
			x = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return x;
	}

	@Override
	public Alumno read(int id) {
		// TODO Auto-generated method stub
		String sql= "select * from alumno where idalumno=?";
		Alumno a = new Alumno();
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {				
				a.setIdalumno(rs.getInt("idalumno"));
				a.setNombres(rs.getString("nombres"));
				a.setApellidos(rs.getString("apellidos"));
				a.setDni(rs.getString("dni"));			    
			}
			
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
		return a;
	}

	@Override
	public List<Alumno> readAll() {
		// TODO Auto-generated method stub
		List<Alumno> list = new ArrayList<>();
		String sql = "select *from alumno";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Alumno a = new Alumno();
				a.setIdalumno(rs.getInt("idalumno"));
				a.setNombres(rs.getString("nombres"));
				a.setApellidos(rs.getString("apellidos"));
				a.setDni(rs.getString("dni"));
			    list.add(a);
			    
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

}

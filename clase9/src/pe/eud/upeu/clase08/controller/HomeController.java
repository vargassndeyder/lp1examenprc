package pe.eud.upeu.clase08.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import pe.edu.upeu.clase08.entity.Alumno;
import pe.eud.upeu.clase08.dao.AlumnoDao;
import pe.eud.upeu.clase08.daoImp.AlumnoDaoImp;
import pe.eud.upeu.clase08.util.Conexion;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/hc")
public class HomeController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    private AlumnoDao al = new AlumnoDaoImp();   
    private Gson g = new Gson();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out = response.getWriter();
		 // System.out.println(request.getParameter("opc"));
		int op = Integer.parseInt(request.getParameter("opc"));
		int x = 0;
		switch (op) {
		case 1:	
			int w = Integer.parseInt(request.getParameter("id"));
			if(w==0) {
			x =al.create(new Alumno(0,request.getParameter("nom"),request.getParameter("apel"),request.getParameter("dni")));
			out.println("Registro guardao correctamente..!");
			}else {
			x =al.update(new Alumno(w,request.getParameter("nom"),request.getParameter("apel"),request.getParameter("dni")));
			out.println("Modificado correctamente..!");
				
			}
			break;
		case 2:	
			 out.println(g.toJson(al.readAll()));			 
			break;
		case 3:	
			out.println(g.toJson(al.delete(Integer.parseInt(request.getParameter("id")))));
			break;
		case 4:	
			out.println(g.toJson(al.read(Integer.parseInt(request.getParameter("id")))));
			break;

		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

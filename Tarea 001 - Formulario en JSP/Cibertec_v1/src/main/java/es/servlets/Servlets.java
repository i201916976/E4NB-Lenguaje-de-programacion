package es.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlets")
public class Servlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servlets() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String nombre=request.getParameter("nombre");
		String apellido=request.getParameter("apellido");
		String usuario=request.getParameter("nombre");
		String email=request.getParameter("email");
		String error="";
		
		
			if(nombre.toString().matches("[0-9]*")) {
			error="Nombre Invalido, debe contener solo letras.";
			RequestDispatcher myDispatcher =request.getRequestDispatcher("/registro.jsp");
			request.setAttribute("mensaje",error);
			myDispatcher.forward(request,response);
			}else if(nombre.length()<4){
				error="Nombre debe ser mayor a 4 letras.";
				RequestDispatcher myDispatcher =request.getRequestDispatcher("/registro.jsp");
				request.setAttribute("mensaje",error);
				myDispatcher.forward(request,response);
			}else if(apellido.toString().matches("[0-9]*")){
				 error="Apellido Invalido, debe contener solo letras";
				RequestDispatcher myDispatcher =request.getRequestDispatcher("/registro.jsp");
				request.setAttribute("mensaje",error);
			myDispatcher.forward(request,response);
			}else if(apellido.length()<4){
				error="Apellido debe ser mayor a 4 letras.";
				RequestDispatcher myDispatcher =request.getRequestDispatcher("/registro.jsp");
				request.setAttribute("mensaje",error);
				myDispatcher.forward(request,response);
			}else if (usuario.length()<5) {
				error="Usuario Invalido, debe ser mayor a 5 caracteres.";
				RequestDispatcher myDispatcher =request.getRequestDispatcher("/registro.jsp");
				request.setAttribute("mensaje",error);
				myDispatcher.forward(request,response);
			}else if (email.length()<6) {
				error="Correo Invalido.Debe contener @ ser mayor a 6 caracteres.";
				RequestDispatcher myDispatcher =request.getRequestDispatcher("/registro.jsp");
				request.setAttribute("mensaje",error);
				myDispatcher.forward(request,response);}
			else {
				String a ="*";
				for(int i=0;i<=request.getParameter("contraseña").length();i++)
				{
					a+="*";
				}
				
				PrintWriter salida = response.getWriter();
				salida.println("<html><body>");
				salida.println("<html><h2>Gracias por registrarte: </h2>");
				salida.println("<html><h4>Nombre: "+request.getParameter("nombre")+"</h1>");
				salida.println("<html><h4>Apellido: "+request.getParameter("apellido")+"</h1>");
				salida.println("<html><h4>Usuario: "+request.getParameter("usuario")+"</h1>");
				salida.println("<html><h4>Email: "+request.getParameter("email")+"</h1>");
				salida.println("<html><h4>Contraseña: "+a+"</h1>");
				salida.println("<html><h4>Fecha de Nacimiento: "+request.getParameter("fecha")+"</h1>");
				salida.println("<html><a href=registro.jsp;>Retroceder</a>");
				salida.println("</html></body>");
				
				
			}
		
	
	}

	}
		




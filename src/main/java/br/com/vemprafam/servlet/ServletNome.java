package br.com.vemprafam.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletNome
 */
@WebServlet("/tratarNome")
public class ServletNome extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletNome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String snome = request.getParameter("snome");
	    PrintWriter out = response.getWriter();
	    out.print("<!DOCTYPE html>\r\n"
	    		+ "<html>\r\n"
	    		+ "<head>\r\n"
	    		+ "<meta charset=\"ISO-8859-1\">\r\n"
	    		+ "<title>Primeira página</title>\r\n"
	    		+ "</head>\r\n"
	    		+ "<body>\r\n"
	    		+ "Bem vindo " + nome + " " + snome + "\r\n"
	    		+ "</body>\r\n"
	    		+ "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

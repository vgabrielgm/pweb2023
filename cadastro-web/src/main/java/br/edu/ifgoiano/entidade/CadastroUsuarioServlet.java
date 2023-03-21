package br.edu.ifgoiano.entidade;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cadastrarUsuario")
public class CadastroUsuarioServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		String senha1= req.getParameter("senha");
		String senha2= req.getParameter("senha2");
		
		
		
		//verifica se a senhas estão iguais 
		if(senha1.equals(senha2)) {
			//redireciona o usuario para o login
			resp.sendRedirect("index.html");
			
			
		} else {
			
			//volta para a pagina de cadastro novamente 
			req.getRequestDispatcher("Index2.html").forward(req, resp);
			
			
		}
		
		
	}
	
	
}

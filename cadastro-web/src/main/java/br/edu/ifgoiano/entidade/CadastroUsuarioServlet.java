package br.edu.ifgoiano.entidade;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cadastrarUsuario")
public class CadastroUsuarioServlet extends HttpServlet {

	//simulando banco de dados 
	
	private List<Usuario>lstDeUsuario;
	
	@Override
	public void init() throws ServletException {
		this.lstDeUsuario= new ArrayList<Usuario>();	}
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		
		//
		String senha1= req.getParameter("senha");
		String senha2= req.getParameter("senha2");
		
		
		
		//verifica se a senhas estão iguais 
		if(senha1.equals(senha2)) {
			Usuario usu = new Usuario();
			usu.setNome(req.getParameter("name"));
			usu.setEmail(req.getParameter("email"));
			usu.setSenha(senha1);
			
			lstDeUsuario.add(usu);
			
			//redireciona o usuario para o login
			resp.sendRedirect("index.html");
			
			
		} else {
			
			//volta para a pagina de cadastro novamente 
			req.getRequestDispatcher("Index2.html").forward(req, resp);
			
			
		}
		
		
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		for (Usuario usuario : lstDeUsuario) {
			System.out.println(usuario.getNome().concat("-").concat(usuario.getEmail()));
			
			
		}
	}
	
	
	//apaga os elementos da lista 
	@Override
	public void destroy() {
		this.lstDeUsuario.clear();
	}
	
	

	
}
